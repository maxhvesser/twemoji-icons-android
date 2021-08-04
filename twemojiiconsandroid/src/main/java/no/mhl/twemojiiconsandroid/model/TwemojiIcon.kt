package no.mhl.twemojiiconsandroid.model

import androidx.annotation.DrawableRes

data class TwemojiIcon(
    val plainName: String,
    val unicode: String,
    val category: TwemojiCategory,
    val subcategory: TwemojiSubcategory,
    @DrawableRes val resource: Int
)