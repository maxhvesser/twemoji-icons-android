package no.mhl.twemojiiconsandroid.symbols

import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.Subcategory
import no.mhl.twemojiiconsandroid.core.model.Font

object Symbols {

    // region Transport sign
    private val transportSign: List<EmojiIcon> = listOf(
        EmojiIcon("AtmSign", "1f3e7", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f3e7),
        EmojiIcon("LitterInBinSign", "1f6ae", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6ae),
        EmojiIcon("PotableWater", "1f6b0", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6b0),
        EmojiIcon("WheelchairSymbol", "267f", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_267f),
        EmojiIcon("Men’SRoom", "1f6b9", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6b9),
        EmojiIcon("Women’SRoom", "1f6ba", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6ba),
        EmojiIcon("Restroom", "1f6bb", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6bb),
        EmojiIcon("BabySymbol", "1f6bc", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6bc),
        EmojiIcon("WaterCloset", "1f6be", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6be),
        EmojiIcon("PassportControl", "1f6c2", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6c2),
        EmojiIcon("Customs", "1f6c3", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6c3),
        EmojiIcon("BaggageClaim", "1f6c4", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6c4),
        EmojiIcon("LeftLuggage", "1f6c5", Category.Symbols, Subcategory.TransportSign, Font.Twemoji, R.drawable.ic_1f6c5)
    )
    // endregion

    // region Warning
    private val warning: List<EmojiIcon> = listOf(
        EmojiIcon("Warning", "26a0", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_26a0),
        EmojiIcon("ChildrenCrossing", "1f6b8", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6b8),
        EmojiIcon("NoEntry", "26d4", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_26d4),
        EmojiIcon("Prohibited", "1f6ab", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6ab),
        EmojiIcon("NoBicycles", "1f6b3", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6b3),
        EmojiIcon("NoSmoking", "1f6ad", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6ad),
        EmojiIcon("NoLittering", "1f6af", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6af),
        EmojiIcon("NonPotableWater", "1f6b1", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6b1),
        EmojiIcon("NoPedestrians", "1f6b7", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f6b7),
        EmojiIcon("NoMobilePhones", "1f4f5", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f4f5),
        EmojiIcon("NoOneUnderEighteen", "1f51e", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_1f51e),
        EmojiIcon("Radioactive", "2622", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_2622),
        EmojiIcon("Biohazard", "2623", Category.Symbols, Subcategory.Warning, Font.Twemoji, R.drawable.ic_2623)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        transportSign,
        warning
    ).flatten()
    // endregion

}