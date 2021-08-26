package no.mhl.twemojiiconsandroid.people

import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Font
import no.mhl.twemojiiconsandroid.core.model.Subcategory

object PeopleAndBody {

    // region Hand fingers open
    private val handFingersOpen: List<EmojiIcon> = listOf(
        EmojiIcon("WavingHand", "1f44b", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f44b),
        EmojiIcon("WavingHandLightSkinTone", "1f44b-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f44b_1f3fb),
        EmojiIcon("WavingHandMediumLightSkinTone", "1f44b-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f44b_1f3fc),
        EmojiIcon("WavingHandMediumSkinTone", "1f44b-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f44b_1f3fd),
        EmojiIcon("WavingHandMediumDarkSkinTone", "1f44b-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f44b_1f3fe),
        EmojiIcon("WavingHandDarkSkinTone", "1f44b-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f44b_1f3ff),
        EmojiIcon("RaisedBackOfHand", "1f91a", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f91a),
        EmojiIcon("RaisedBackOfHandLightSkinTone", "1f91a-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f91a_1f3fb),
        EmojiIcon("RaisedBackOfHandMediumLightSkinTone", "1f91a-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f91a_1f3fc),
        EmojiIcon("RaisedBackOfHandMediumSkinTone", "1f91a-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f91a_1f3fd),
        EmojiIcon("RaisedBackOfHandMediumDarkSkinTone", "1f91a-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f91a_1f3fe),
        EmojiIcon("RaisedBackOfHandDarkSkinTone", "1f91a-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f91a_1f3ff),
        EmojiIcon("HandWithFingersSplayed", "1f590", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f590),
        EmojiIcon("HandWithFingersSplayedLightSkinTone", "1f590-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f590_1f3fb),
        EmojiIcon("HandWithFingersSplayedMediumLightSkinTone", "1f590-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f590_1f3fc),
        EmojiIcon("HandWithFingersSplayedMediumSkinTone", "1f590-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f590_1f3fd),
        EmojiIcon("HandWithFingersSplayedMediumDarkSkinTone", "1f590-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f590_1f3fe),
        EmojiIcon("HandWithFingersSplayedDarkSkinTone", "1f590-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f590_1f3ff),
        EmojiIcon("RaisedHand", "270b", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_270b),
        EmojiIcon("RaisedHandLightSkinTone", "270b-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_270b_1f3fb),
        EmojiIcon("RaisedHandMediumLightSkinTone", "270b-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_270b_1f3fc),
        EmojiIcon("RaisedHandMediumSkinTone", "270b-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_270b_1f3fd),
        EmojiIcon("RaisedHandMediumDarkSkinTone", "270b-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_270b_1f3fe),
        EmojiIcon("RaisedHandDarkSkinTone", "270b-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_270b_1f3ff),
        EmojiIcon("VulcanSalute", "1f596", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f596),
        EmojiIcon("VulcanSaluteLightSkinTone", "1f596-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f596_1f3fb),
        EmojiIcon("VulcanSaluteMediumLightSkinTone", "1f596-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f596_1f3fc),
        EmojiIcon("VulcanSaluteMediumSkinTone", "1f596-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f596_1f3fd),
        EmojiIcon("VulcanSaluteMediumDarkSkinTone", "1f596-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f596_1f3fe),
        EmojiIcon("VulcanSaluteDarkSkinTone", "1f596-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersOpen, Font.Twemoji, R.drawable.ic_1f596_1f3ff)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf()
    // endregion

}