package no.mhl.twemojiiconsandroid.core.model

import androidx.annotation.DrawableRes
import no.mhl.twemojiiconsandroid.core.R

private data class EmojiIcon(
    val name: String = "",
    val unicode: String = "",
    val category: Category = Category.Unknown,
    val subcategory: Subcategory = Subcategory.Unknown,
    val font: Font = Font.Unknown,
    @DrawableRes val resource: Int = R.drawable.ic_1f60d
)