package no.mhl.twemojiiconsandroid.sample.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = FrenchPass,
    primaryVariant = ShuttleGray,
    secondary = Calypso
)

private val LightColorPalette = lightColors(
    primary = FrenchPass,
    primaryVariant = ShuttleGray,
    secondary = Calypso,
    background = Porcelain,
    surface = AthensGray
)

@Composable
fun SampleTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}