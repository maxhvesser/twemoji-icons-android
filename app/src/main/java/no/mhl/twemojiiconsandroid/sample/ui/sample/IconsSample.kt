package no.mhl.twemojiiconsandroid.sample.ui.sample

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets
import kotlinx.coroutines.CoroutineScope
import no.mhl.twemojiiconsandroid.TwemojiIconProvider
import no.mhl.twemojiiconsandroid.model.TwemojiIcon

// region Main entry
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun IconsSample() {
    val coroutineScope = rememberCoroutineScope()
    val sheetState = rememberBottomSheetScaffoldState(bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed))
    val selectedIcon = remember { mutableStateOf(TwemojiIcon()) }

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
    selectedIcon: MutableState<TwemojiIcon>
) {
    val insets = LocalWindowInsets.current
    val density = LocalDensity.current

    val top = with(density) { insets.statusBars.top.toDp() }
    val bottom = with(density) { insets.navigationBars.bottom.toDp() }

    LazyVerticalGrid(
        cells = GridCells.Adaptive(80.dp),
        contentPadding = PaddingValues(8.dp, top, 8.dp,, bottom)
    ) {
        items(TwemojiIconProvider().provideAll()) { icon ->
            
        }
    }
}
// endregion

// region Icon info bottom sheet
@ExperimentalMaterialApi
@Composable
private fun IconInfoSheet(
    coroutineScope: CoroutineScope,
    sheetState: BottomSheetScaffoldState,
    icon: TwemojiIcon
) = Column {

}
// endregion

