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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
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
import no.mhl.twemojiiconsandroid.TwemojiIconProvider
import no.mhl.twemojiiconsandroid.sample.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val systemUiController = rememberSystemUiController()
            val useDarkIcons = MaterialTheme.colors.isLight
            SideEffect {
                systemUiController.setSystemBarsColor(Color.Transparent, darkIcons = useDarkIcons)
            }

            SampleTheme {
                ProvideWindowInsets {
                    Surface(
                        color = MaterialTheme.colors.background
                    ) {
                        IconGrid()
                    }
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun IconGrid() {
    val insets = LocalWindowInsets.current
    val density = LocalDensity.current
    val top = with(density) { insets.statusBars.top.toDp() }
    val bottom = with(density) { insets.navigationBars.bottom.toDp() }

    LazyVerticalGrid(
        cells = GridCells.Fixed(4),
        contentPadding = PaddingValues(4.dp, top, 4.dp, bottom)
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
                        .clickable {  },
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