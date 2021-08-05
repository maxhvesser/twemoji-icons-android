package no.mhl.twemojiiconsandroid.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.ProvideWindowInsets
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import no.mhl.twemojiiconsandroid.TwemojiIconProvider
import no.mhl.twemojiiconsandroid.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.sample.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            // Main content
            SampleTheme {
                ProvideWindowInsets {
                    Surface(color = MaterialTheme.colors.background) { TwemojiIcons() }
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
private fun TwemojiIcons() {
    val sheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    val coroutineScope = rememberCoroutineScope()
    val selectedIcon: MutableState<TwemojiIcon?> = remember { mutableStateOf(null) }

    BottomSheetScaffold(
        sheetContent = {
            IconInfoSheet(
                coroutineScope = coroutineScope,
                sheetState = sheetScaffoldState,
                icon = selectedIcon.value
            )
        },
        scaffoldState = sheetScaffoldState,
        sheetPeekHeight = 0.dp,
        sheetBackgroundColor = MaterialTheme.colors.onSurface
    ) {
        IconGrid(
            coroutineScope = coroutineScope,
            selectedIcon = selectedIcon,
            sheetState = sheetScaffoldState
        )
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
private fun IconGrid(
    coroutineScope: CoroutineScope,
    selectedIcon: MutableState<TwemojiIcon?>,
    sheetState: BottomSheetScaffoldState
) {
    val insets = LocalWindowInsets.current
    val density = LocalDensity.current
    val top = with(density) { insets.statusBars.top.toDp() }
    val bottom = with(density) { insets.navigationBars.bottom.toDp() }

    LazyVerticalGrid(
        cells = GridCells.Adaptive(80.dp),
        contentPadding = PaddingValues(8.dp, top, 8.dp, bottom)
    ) {
        items(TwemojiIconProvider().provideAll()) { icon ->
            BoxWithConstraints {
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
                        contentDescription = icon.plainName
                    )
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
private fun IconInfoSheet(
    coroutineScope: CoroutineScope,
    sheetState: BottomSheetScaffoldState,
    icon: TwemojiIcon?
) = Column(
    modifier = Modifier.padding(16.dp)
) {
    @Composable
    fun PropertyText(
        title: String,
        text: String
    ) = Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.subtitle2,
            color = MaterialTheme.colors.onBackground
        )
        Spacer(Modifier.width(4.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.onBackground
        )
    }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(icon?.resource ?: R.drawable.ic_1f004),
            contentDescription = icon?.plainName
        )
        Spacer(Modifier.weight(1f))
        IconButton(
            onClick = {
                coroutineScope.launch { sheetState.bottomSheetState.collapse() }
            }
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_close),
                contentDescription = null,
                tint = MaterialTheme.colors.onBackground
            )
        }
    }
    Spacer(Modifier.height(8.dp))
    PropertyText(
        title = "Name:",
        text = icon?.plainName ?: ""
    )
    Spacer(Modifier.height(16.dp))
    PropertyText(
        title = "Unicode:",
        text = icon?.unicode ?: ""
    )
    Spacer(Modifier.height(16.dp))
    PropertyText(
        title = "Category:",
        text = icon?.category?.name ?: ""
    )
    Spacer(Modifier.height(16.dp))
    PropertyText(
        title = "Subcategory:",
        text = icon?.subcategory?.name ?: ""
    )
    Spacer(Modifier.height(32.dp))
}
