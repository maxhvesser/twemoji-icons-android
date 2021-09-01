package no.mhl.twemojiiconsandroid.sample.ui.sample

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import no.mhl.twemojiiconsandroid.activities.Activities
import no.mhl.twemojiiconsandroid.animals.AnimalsAndNature
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.flags.Flags
import no.mhl.twemojiiconsandroid.food.FoodAndDrink
import no.mhl.twemojiiconsandroid.objects.Objects
import no.mhl.twemojiiconsandroid.people.PeopleAndBody
import no.mhl.twemojiiconsandroid.sample.R
import no.mhl.twemojiiconsandroid.sample.ui.views.PropertyText
import no.mhl.twemojiiconsandroid.smileys.SmileysAndEmotion
import no.mhl.twemojiiconsandroid.symbols.Symbols
import no.mhl.twemojiiconsandroid.travel.TravelAndPlaces

// region Main entry
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun IconsSample() {
    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberBottomSheetScaffoldState(bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed))
    val selectedIcon = remember { mutableStateOf(EmojiIcon()) }

    BottomSheetScaffold(
        sheetContent = { IconInfoSheet(coroutineScope, sheetState, selectedIcon.value) },
        scaffoldState = sheetState,
        sheetPeekHeight = 0.dp,
        sheetBackgroundColor = MaterialTheme.colors.onSurface
    ) { IconGrid(coroutineScope, sheetState, selectedIcon) }
}
// endregion

// region Icon grid
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
private fun IconGrid(
    coroutineScope: CoroutineScope,
    sheetState: BottomSheetScaffoldState,
    selectedIcon: MutableState<EmojiIcon>
) {
    val insets = LocalWindowInsets.current
    val density = LocalDensity.current

    val top = with(density) { insets.statusBars.top.toDp() }
    val bottom = with(density) { insets.navigationBars.bottom.toDp() }

    LazyVerticalGrid(
        cells = GridCells.Adaptive(80.dp),
        contentPadding = PaddingValues(8.dp, top, 8.dp, bottom)
    ) {
        val icons = listOf(
            SmileysAndEmotion.all,
            PeopleAndBody.all,
            AnimalsAndNature.all,
            FoodAndDrink.all,
            TravelAndPlaces.all,
            Activities.all,
            Objects.all,
            Symbols.all,
            Flags.all
        ).flatten()

        items(icons) {
            IconTile(
                coroutineScope = coroutineScope,
                selectedIcon = selectedIcon,
                sheetState = sheetState,
                icon = it
            )
        }
    }
}

@ExperimentalMaterialApi
@Composable
private fun IconTile(
    coroutineScope: CoroutineScope,
    selectedIcon: MutableState<EmojiIcon>,
    sheetState: BottomSheetScaffoldState,
    icon: EmojiIcon
) = BoxWithConstraints {
    Box(
        modifier = Modifier
            .padding(2.dp)
            .clip(MaterialTheme.shapes.large)
            .background(MaterialTheme.colors.surface)
            .fillMaxWidth()
            .height(maxWidth)
            .clickable {
                selectedIcon.value = icon
                coroutineScope.launch { sheetState.bottomSheetState.expand() }
            },
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(icon.resource),
            contentDescription = icon.name
        )
    }
}
// endregion

// region Icon info bottom sheet
@ExperimentalMaterialApi
@Composable
private fun IconInfoSheet(
    coroutineScope: CoroutineScope,
    sheetState: BottomSheetScaffoldState,
    icon: EmojiIcon
) = Column(
    modifier = Modifier.padding(16.dp)
) {
    Row(
       verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(icon.resource),
            contentDescription = icon.name
        )
        Spacer(Modifier.weight(1f))
        IconButton({ coroutineScope.launch { sheetState.bottomSheetState.collapse() } }) {
            Icon(
                painter = painterResource(R.drawable.ic_close),
                contentDescription = stringResource(R.string.close_content_description),
                tint = MaterialTheme.colors.onBackground
            )
        }
    }
    Spacer(Modifier.height(8.dp))
    PropertyText(
        label = stringResource(R.string.icon_info_name),
        text = icon.name
    )
    Spacer(Modifier.height(16.dp))
    PropertyText(
        label = stringResource(R.string.icon_info_unicode),
        text = icon.unicode
    )
    Spacer(Modifier.height(16.dp))
    PropertyText(
        label = stringResource(R.string.icon_info_category),
        text = icon.category.name
    )
    Spacer(Modifier.height(16.dp))
    PropertyText(
        label = stringResource(R.string.icon_info_subcategory),
        text = icon.subcategory.name
    )
    Spacer(Modifier.height(32.dp))
}
// endregion

