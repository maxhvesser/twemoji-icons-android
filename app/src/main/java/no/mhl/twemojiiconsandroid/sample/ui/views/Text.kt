package no.mhl.twemojiiconsandroid.sample.ui.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
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
        text = label,
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
// endregion