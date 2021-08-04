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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.LocalWindowInsets
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import no.mhl.twemojiiconsandroid.TwemojiIconProvider
import no.mhl.twemojiiconsandroid.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.sample.ui.theme.Iron
import no.mhl.twemojiiconsandroid.sample.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            // Set transparent system bars
            val systemUiController = rememberSystemUiController()
            val useDarkIcons = MaterialTheme.colors.isLight
            SideEffect {
                systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = useDarkIcons)
            }

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
        sheetContent = { IconInfoSheet(icon = selectedIcon.value) },
        scaffoldState = sheetScaffoldState,
        sheetPeekHeight = 0.dp,
        sheetBackgroundColor = MaterialTheme.colors.background
    ) {
        IconGrid(coroutineScope, selectedIcon, sheetScaffoldState)
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
        cells = GridCells.Fixed(4),
        contentPadding = PaddingValues(8.dp, top, 8.dp, bottom)
    ) {
        items(TwemojiIconProvider().provideAll()) { icon ->
            BoxWithConstraints {
                val iconSize = if ((maxWidth / 2) > 72.dp) 72.dp else (maxWidth / 2)

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
                        modifier = Modifier.size(iconSize),
                        painter = painterResource(icon.resource),
                        contentDescription = icon.plainName
                    )
                }
            }
        }
    }
}

@Composable
private fun IconInfoSheet(
    icon: TwemojiIcon?
) = Column(
    modifier = Modifier.padding(16.dp)
) {
    Spacer(Modifier.height(32.dp))
    Text("Plain name: ${icon?.plainName ?: ""}")
    Spacer(Modifier.height(32.dp))
    Text("Unicode ${icon?.unicode ?: ""}")
    Spacer(Modifier.height(32.dp))
    Text("Category: ${icon?.category?.name ?: ""}")
    Spacer(Modifier.height(32.dp))
    Text("Subcategory: ${icon?.subcategory?.name ?: ""}")
    Spacer(Modifier.height(32.dp))
}
