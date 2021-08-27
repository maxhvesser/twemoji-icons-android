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

    // region Hand single finger
    private val handSingleFinger: List<EmojiIcon> = listOf(
        EmojiIcon("BackhandIndexPointingLeft", "1f448", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f448),
        EmojiIcon("BackhandIndexPointingLeftLightSkinTone", "1f448-1f3fb", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f448_1f3fb),
        EmojiIcon("BackhandIndexPointingLeftMediumLightSkinTone", "1f448-1f3fc", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f448_1f3fc),
        EmojiIcon("BackhandIndexPointingLeftMediumSkinTone", "1f448-1f3fd", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f448_1f3fd),
        EmojiIcon("BackhandIndexPointingLeftMediumDarkSkinTone", "1f448-1f3fe", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f448_1f3fe),
        EmojiIcon("BackhandIndexPointingLeftDarkSkinTone", "1f448-1f3ff", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f448_1f3ff),
        EmojiIcon("BackhandIndexPointingRight", "1f449", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f449),
        EmojiIcon("BackhandIndexPointingRightLightSkinTone", "1f449-1f3fb", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f449_1f3fb),
        EmojiIcon("BackhandIndexPointingRightMediumLightSkinTone", "1f449-1f3fc", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f449_1f3fc),
        EmojiIcon("BackhandIndexPointingRightMediumSkinTone", "1f449-1f3fd", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f449_1f3fd),
        EmojiIcon("BackhandIndexPointingRightMediumDarkSkinTone", "1f449-1f3fe", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f449_1f3fe),
        EmojiIcon("BackhandIndexPointingRightDarkSkinTone", "1f449-1f3ff", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f449_1f3ff),
        EmojiIcon("BackhandIndexPointingUp", "1f446", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f446),
        EmojiIcon("BackhandIndexPointingUpLightSkinTone", "1f446-1f3fb", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f446_1f3fb),
        EmojiIcon("BackhandIndexPointingUpMediumLightSkinTone", "1f446-1f3fc", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f446_1f3fc),
        EmojiIcon("BackhandIndexPointingUpMediumSkinTone", "1f446-1f3fd", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f446_1f3fd),
        EmojiIcon("BackhandIndexPointingUpMediumDarkSkinTone", "1f446-1f3fe", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f446_1f3fe),
        EmojiIcon("BackhandIndexPointingUpDarkSkinTone", "1f446-1f3ff", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f446_1f3ff),
        EmojiIcon("MiddleFinger", "1f595", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f595),
        EmojiIcon("MiddleFingerLightSkinTone", "1f595-1f3fb", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f595_1f3fb),
        EmojiIcon("MiddleFingerMediumLightSkinTone", "1f595-1f3fc", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f595_1f3fc),
        EmojiIcon("MiddleFingerMediumSkinTone", "1f595-1f3fd", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f595_1f3fd),
        EmojiIcon("MiddleFingerMediumDarkSkinTone", "1f595-1f3fe", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f595_1f3fe),
        EmojiIcon("MiddleFingerDarkSkinTone", "1f595-1f3ff", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f595_1f3ff),
        EmojiIcon("BackhandIndexPointingDown", "1f447", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f447),
        EmojiIcon("BackhandIndexPointingDownLightSkinTone", "1f447-1f3fb", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f447_1f3fb),
        EmojiIcon("BackhandIndexPointingDownMediumLightSkinTone", "1f447-1f3fc", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f447_1f3fc),
        EmojiIcon("BackhandIndexPointingDownMediumSkinTone", "1f447-1f3fd", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f447_1f3fd),
        EmojiIcon("BackhandIndexPointingDownMediumDarkSkinTone", "1f447-1f3fe", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f447_1f3fe),
        EmojiIcon("BackhandIndexPointingDownDarkSkinTone", "1f447-1f3ff", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_1f447_1f3ff),
        EmojiIcon("IndexPointingUp", "261d", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_261d),
        EmojiIcon("IndexPointingUpLightSkinTone", "261d-1f3fb", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_261d_1f3fb),
        EmojiIcon("IndexPointingUpMediumLightSkinTone", "261d-1f3fc", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_261d_1f3fc),
        EmojiIcon("IndexPointingUpMediumSkinTone", "261d-1f3fd", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_261d_1f3fd),
        EmojiIcon("IndexPointingUpMediumDarkSkinTone", "261d-1f3fe", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_261d_1f3fe),
        EmojiIcon("IndexPointingUpDarkSkinTone", "261d-1f3ff", Category.PeopleAndBody, Subcategory.HandSingleFinger, Font.Twemoji, R.drawable.ic_261d_1f3ff)
    )
    // endregion

    // region Hand fingers closed
    private val handFingersClosed: List<EmojiIcon> = listOf(
        EmojiIcon("ThumbsUp", "1f44d", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44d),
        EmojiIcon("ThumbsUpLightSkinTone", "1f44d-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44d_1f3fb),
        EmojiIcon("ThumbsUpMediumLightSkinTone", "1f44d-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44d_1f3fc),
        EmojiIcon("ThumbsUpMediumSkinTone", "1f44d-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44d_1f3fd),
        EmojiIcon("ThumbsUpMediumDarkSkinTone", "1f44d-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44d_1f3fe),
        EmojiIcon("ThumbsUpDarkSkinTone", "1f44d-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44d_1f3ff),
        EmojiIcon("ThumbsDown", "1f44e", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44e),
        EmojiIcon("ThumbsDownLightSkinTone", "1f44e-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44e_1f3fb),
        EmojiIcon("ThumbsDownMediumLightSkinTone", "1f44e-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44e_1f3fc),
        EmojiIcon("ThumbsDownMediumSkinTone", "1f44e-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44e_1f3fd),
        EmojiIcon("ThumbsDownMediumDarkSkinTone", "1f44e-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44e_1f3fe),
        EmojiIcon("ThumbsDownDarkSkinTone", "1f44e-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44e_1f3ff),
        EmojiIcon("RaisedFist", "270a", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_270a),
        EmojiIcon("RaisedFistLightSkinTone", "270a-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_270a_1f3fb),
        EmojiIcon("RaisedFistMediumLightSkinTone", "270a-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_270a_1f3fc),
        EmojiIcon("RaisedFistMediumSkinTone", "270a-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_270a_1f3fd),
        EmojiIcon("RaisedFistMediumDarkSkinTone", "270a-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_270a_1f3fe),
        EmojiIcon("RaisedFistDarkSkinTone", "270a-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_270a_1f3ff),
        EmojiIcon("OncomingFist", "1f44a", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44a),
        EmojiIcon("OncomingFistLightSkinTone", "1f44a-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44a_1f3fb),
        EmojiIcon("OncomingFistMediumLightSkinTone", "1f44a-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44a_1f3fc),
        EmojiIcon("OncomingFistMediumSkinTone", "1f44a-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44a_1f3fd),
        EmojiIcon("OncomingFistMediumDarkSkinTone", "1f44a-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44a_1f3fe),
        EmojiIcon("OncomingFistDarkSkinTone", "1f44a-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f44a_1f3ff),
        EmojiIcon("LeftFacingFist", "1f91b", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91b),
        EmojiIcon("LeftFacingFistLightSkinTone", "1f91b-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91b_1f3fb),
        EmojiIcon("LeftFacingFistMediumLightSkinTone", "1f91b-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91b_1f3fc),
        EmojiIcon("LeftFacingFistMediumSkinTone", "1f91b-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91b_1f3fd),
        EmojiIcon("LeftFacingFistMediumDarkSkinTone", "1f91b-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91b_1f3fe),
        EmojiIcon("LeftFacingFistDarkSkinTone", "1f91b-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91b_1f3ff),
        EmojiIcon("RightFacingFist", "1f91c", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91c),
        EmojiIcon("RightFacingFistLightSkinTone", "1f91c-1f3fb", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91c_1f3fb),
        EmojiIcon("RightFacingFistMediumLightSkinTone", "1f91c-1f3fc", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91c_1f3fc),
        EmojiIcon("RightFacingFistMediumSkinTone", "1f91c-1f3fd", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91c_1f3fd),
        EmojiIcon("RightFacingFistMediumDarkSkinTone", "1f91c-1f3fe", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91c_1f3fe),
        EmojiIcon("RightFacingFistDarkSkinTone", "1f91c-1f3ff", Category.PeopleAndBody, Subcategory.HandFingersClosed, Font.Twemoji, R.drawable.ic_1f91c_1f3ff)
    )
    // endregion

    // region Hands
    private val hands: List<EmojiIcon> = listOf(
        EmojiIcon("ClappingHands", "1f44f", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f44f),
        EmojiIcon("ClappingHandsLightSkinTone", "1f44f-1f3fb", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f44f_1f3fb),
        EmojiIcon("ClappingHandsMediumLightSkinTone", "1f44f-1f3fc", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f44f_1f3fc),
        EmojiIcon("ClappingHandsMediumSkinTone", "1f44f-1f3fd", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f44f_1f3fd),
        EmojiIcon("ClappingHandsMediumDarkSkinTone", "1f44f-1f3fe", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f44f_1f3fe),
        EmojiIcon("ClappingHandsDarkSkinTone", "1f44f-1f3ff", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f44f_1f3ff),
        EmojiIcon("RaisingHands", "1f64c", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64c),
        EmojiIcon("RaisingHandsLightSkinTone", "1f64c-1f3fb", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64c_1f3fb),
        EmojiIcon("RaisingHandsMediumLightSkinTone", "1f64c-1f3fc", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64c_1f3fc),
        EmojiIcon("RaisingHandsMediumSkinTone", "1f64c-1f3fd", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64c_1f3fd),
        EmojiIcon("RaisingHandsMediumDarkSkinTone", "1f64c-1f3fe", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64c_1f3fe),
        EmojiIcon("RaisingHandsDarkSkinTone", "1f64c-1f3ff", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64c_1f3ff),
        EmojiIcon("OpenHands", "1f450", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f450),
        EmojiIcon("OpenHandsLightSkinTone", "1f450-1f3fb", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f450_1f3fb),
        EmojiIcon("OpenHandsMediumLightSkinTone", "1f450-1f3fc", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f450_1f3fc),
        EmojiIcon("OpenHandsMediumSkinTone", "1f450-1f3fd", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f450_1f3fd),
        EmojiIcon("OpenHandsMediumDarkSkinTone", "1f450-1f3fe", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f450_1f3fe),
        EmojiIcon("OpenHandsDarkSkinTone", "1f450-1f3ff", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f450_1f3ff),
        EmojiIcon("PalmsUpTogether", "1f932", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f932),
        EmojiIcon("PalmsUpTogetherLightSkinTone", "1f932-1f3fb", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f932_1f3fb),
        EmojiIcon("PalmsUpTogetherMediumLightSkinTone", "1f932-1f3fc", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f932_1f3fc),
        EmojiIcon("PalmsUpTogetherMediumSkinTone", "1f932-1f3fd", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f932_1f3fd),
        EmojiIcon("PalmsUpTogetherMediumDarkSkinTone", "1f932-1f3fe", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f932_1f3fe),
        EmojiIcon("PalmsUpTogetherDarkSkinTone", "1f932-1f3ff", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f932_1f3ff),
        EmojiIcon("Handshake", "1f91d", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f91d),
        EmojiIcon("FoldedHands", "1f64f", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64f),
        EmojiIcon("FoldedHandsLightSkinTone", "1f64f-1f3fb", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64f_1f3fb),
        EmojiIcon("FoldedHandsMediumLightSkinTone", "1f64f-1f3fc", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64f_1f3fc),
        EmojiIcon("FoldedHandsMediumSkinTone", "1f64f-1f3fd", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64f_1f3fd),
        EmojiIcon("FoldedHandsMediumDarkSkinTone", "1f64f-1f3fe", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64f_1f3fe),
        EmojiIcon("FoldedHandsDarkSkinTone", "1f64f-1f3ff", Category.PeopleAndBody, Subcategory.Hands, Font.Twemoji, R.drawable.ic_1f64f_1f3ff)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        handFingersOpen,
        handFingersPartial,
        handSingleFinger,
        handFingersClosed,
        hands
    ).flatten()
    // endregion

}