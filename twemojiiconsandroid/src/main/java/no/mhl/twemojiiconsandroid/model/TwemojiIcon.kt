package no.mhl.twemojiiconsandroid.model

import androidx.annotation.DrawableRes
import no.mhl.twemojiiconsandroid.R

data class TwemojiIcon(
    val plainName: String = "",
    val unicode: String = "",
    val category: TwemojiCategory = TwemojiCategory.Activities,
    val subcategory: TwemojiSubcategory = TwemojiSubcategory.Alphanum,
    @DrawableRes val resource: Int = R.drawable.ic_1f60d
)