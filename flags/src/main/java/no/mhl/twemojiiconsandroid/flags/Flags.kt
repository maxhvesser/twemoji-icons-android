package no.mhl.twemojiiconsandroid.flags

import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.Subcategory
import no.mhl.twemojiiconsandroid.core.model.Font

object Flags {

    // region Flag
    private val flag: List<EmojiIcon> = listOf(
        EmojiIcon("ChequeredFlag", "1f3c1", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f3c1),
        EmojiIcon("TriangularFlag", "1f6a9", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f6a9),
        EmojiIcon("CrossedFlags", "1f38c", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f38c),
        EmojiIcon("BlackFlag", "1f3f4", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f3f4),
        EmojiIcon("WhiteFlag", "1f3f3", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f3f3),
        EmojiIcon("RainbowFlag", "1f3f3-fe0f-200d-1f308", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f3f3_fe0f_200d_1f308),
        EmojiIcon("PirateFlag", "1f3f4-200d-2620-fe0f", Category.Flags, Subcategory.Flag, Font.Twemoji, R.drawable.ic_1f3f4_200d_2620_fe0f)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        flag
    ).flatten()
    // endregion

}