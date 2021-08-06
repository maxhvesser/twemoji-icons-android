package no.mhl.twemojiiconsandroid.sample.ui.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// region Property text
@Composable
fun PropertyText(
    label: String,
    text: String
) = Row(
    verticalAlignment = Alignment.CenterVertically
) {
    Text(
        text = label
    )
    Spacer(Modifier.width(4.dp))
    Text(
        text = text
    )
}
// endregion