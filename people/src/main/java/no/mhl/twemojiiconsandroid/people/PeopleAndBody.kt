package no.mhl.twemojiiconsandroid.people

import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Font
import no.mhl.twemojiiconsandroid.core.model.Subcategory

object PeopleAndBody {

    // region Hand fingers partial
    private val handFingersPartial: List<EmojiIcon> = listOf(
        EmojiIcon("OkHand", "1f44c", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f44c),
        EmojiIcon("OkHandLightSkinTone", "1f44c-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f44c_1f3fb),
        EmojiIcon("OkHandMediumLightSkinTone", "1f44c-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f44c_1f3fc),
        EmojiIcon("OkHandMediumSkinTone", "1f44c-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f44c_1f3fd),
        EmojiIcon("OkHandMediumDarkSkinTone", "1f44c-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f44c_1f3fe),
        EmojiIcon("OkHandDarkSkinTone", "1f44c-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f44c_1f3ff),
        EmojiIcon("PinchedFingers", "1f90c", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90c),
        EmojiIcon("PinchedFingersLightSkinTone", "1f90c-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90c_1f3fb),
        EmojiIcon("PinchedFingersMediumLightSkinTone", "1f90c-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90c_1f3fc),
        EmojiIcon("PinchedFingersMediumSkinTone", "1f90c-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90c_1f3fd),
        EmojiIcon("PinchedFingersMediumDarkSkinTone", "1f90c-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90c_1f3fe),
        EmojiIcon("PinchedFingersDarkSkinTone", "1f90c-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90c_1f3ff),
        EmojiIcon("PinchingHand", "1f90f", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90f),
        EmojiIcon("PinchingHandLightSkinTone", "1f90f-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90f_1f3fb),
        EmojiIcon("PinchingHandMediumLightSkinTone", "1f90f-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90f_1f3fc),
        EmojiIcon("PinchingHandMediumSkinTone", "1f90f-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90f_1f3fd),
        EmojiIcon("PinchingHandMediumDarkSkinTone", "1f90f-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90f_1f3fe),
        EmojiIcon("PinchingHandDarkSkinTone", "1f90f-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f90f_1f3ff),
        EmojiIcon("VictoryHand", "270c", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_270c),
        EmojiIcon("VictoryHandLightSkinTone", "270c-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_270c_1f3fb),
        EmojiIcon("VictoryHandMediumLightSkinTone", "270c-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_270c_1f3fc),
        EmojiIcon("VictoryHandMediumSkinTone", "270c-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_270c_1f3fd),
        EmojiIcon("VictoryHandMediumDarkSkinTone", "270c-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_270c_1f3fe),
        EmojiIcon("VictoryHandDarkSkinTone", "270c-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_270c_1f3ff),
        EmojiIcon("CrossedFingers", "1f91e", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91e),
        EmojiIcon("CrossedFingersLightSkinTone", "1f91e-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91e_1f3fb),
        EmojiIcon("CrossedFingersMediumLightSkinTone", "1f91e-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91e_1f3fc),
        EmojiIcon("CrossedFingersMediumSkinTone", "1f91e-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91e_1f3fd),
        EmojiIcon("CrossedFingersMediumDarkSkinTone", "1f91e-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91e_1f3fe),
        EmojiIcon("CrossedFingersDarkSkinTone", "1f91e-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91e_1f3ff),
        EmojiIcon("LoveYouGesture", "1f91f", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91f),
        EmojiIcon("LoveYouGestureLightSkinTone", "1f91f-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91f_1f3fb),
        EmojiIcon("LoveYouGestureMediumLightSkinTone", "1f91f-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91f_1f3fc),
        EmojiIcon("LoveYouGestureMediumSkinTone", "1f91f-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91f_1f3fd),
        EmojiIcon("LoveYouGestureMediumDarkSkinTone", "1f91f-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91f_1f3fe),
        EmojiIcon("LoveYouGestureDarkSkinTone", "1f91f-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f91f_1f3ff),
        EmojiIcon("SignOfTheHorns", "1f918", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f918),
        EmojiIcon("SignOfTheHornsLightSkinTone", "1f918-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f918_1f3fb),
        EmojiIcon("SignOfTheHornsMediumLightSkinTone", "1f918-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f918_1f3fc),
        EmojiIcon("SignOfTheHornsMediumSkinTone", "1f918-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f918_1f3fd),
        EmojiIcon("SignOfTheHornsMediumDarkSkinTone", "1f918-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f918_1f3fe),
        EmojiIcon("SignOfTheHornsDarkSkinTone", "1f918-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f918_1f3ff),
        EmojiIcon("CallMeHand", "1f919", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f919),
        EmojiIcon("CallMeHandLightSkinTone", "1f919-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f919_1f3fb),
        EmojiIcon("CallMeHandMediumLightSkinTone", "1f919-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f919_1f3fc),
        EmojiIcon("CallMeHandMediumSkinTone", "1f919-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f919_1f3fd),
        EmojiIcon("CallMeHandMediumDarkSkinTone", "1f919-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f919_1f3fe),
        EmojiIcon("CallMeHandDarkSkinTone", "1f919-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersPartial, Font.Twemoji, R.drawable.ic_1f919_1f3ff)
    )
    // endregion

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