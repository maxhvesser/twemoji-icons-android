package no.mhl.twemojiiconsandroid.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import no.mhl.twemojiiconsandroid.sample.ui.sample.IconsSample
import no.mhl.twemojiiconsandroid.sample.ui.theme.SampleTheme

@ExperimentalMaterialApi
@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            // Main content
            SampleTheme {
                ProvideWindowInsets {
                    Surface(color = MaterialTheme.colors.background) { IconsSample() }
                }
            }
        }
    }
}
