package no.mhl.twemojiiconsandroid.core.model

import androidx.annotation.DrawableRes
import no.mhl.twemojiiconsandroid.core.R

data class TwemojiIcon(
    val plainName: String = "",
    val unicode: String = "",
    val category: TwemojiCategory = TwemojiCategory.Activities,
    val subcategory: TwemojiSubcategory = TwemojiSubcategory.Alphanum,
    @DrawableRes val resource: Int = R.drawable.ic_1f60d
)