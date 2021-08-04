package no.mhl.twemojiiconsandroid.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import no.mhl.twemojiiconsandroid.TwemojiIconProvider
import no.mhl.twemojiiconsandroid.sample.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    IconGrid()
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun IconGrid() = LazyVerticalGrid(
    cells = GridCells.Fixed(4),
    contentPadding = PaddingValues(4.dp)
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
                    .height(maxWidth),
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