package no.mhl.twemojiiconsandroid.smileys

import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Font
import no.mhl.twemojiiconsandroid.core.model.Subcategory

object SmileysAndEmotion {

    // region All
    fun all(): List<EmojiIcon> = listOf(
        faceSmiling(),
        faceAffection(),
        faceTongue(),
        faceHand(),
        faceNeutralSkeptical(),
        faceSleepy(),
        faceUnwell(),
        faceHat(),
        faceGlasses(),
        faceConcerned(),
        faceNegative(),
        faceCostume(),
        catFace(),
        monkeyFace()
    ).flatten()
    // endregion

    // region FaceSmiling
    fun faceSmiling(): List<EmojiIcon> = listOf(
        EmojiIcon("GrinningFace", "1f600", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f600),
        EmojiIcon("GrinningFaceWithBigEyes", "1f603", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f603),
        EmojiIcon("GrinningFaceWithSmilingEyes", "1f604", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f604),
        EmojiIcon("BeamingFaceWithSmilingEyes", "1f601", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f601),
        EmojiIcon("GrinningSquintingFace", "1f606", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f606),
        EmojiIcon("GrinningFaceWithSweat", "1f605", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f605),
        EmojiIcon("RollingOnTheFloorLaughing", "1f923", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f923),
        EmojiIcon("FaceWithTearsOfJoy", "1f602", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f602),
        EmojiIcon("SlightlySmilingFace", "1f642", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f642),
        EmojiIcon("UpsideDownFace", "1f643", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f643),
        EmojiIcon("WinkingFace", "1f609", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f609),
        EmojiIcon("SmilingFaceWithSmilingEyes", "1f60a", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f60a),
        EmojiIcon("SmilingFaceWithHalo", "1f607", Category.SmileysAndEmotion, Subcategory.FaceSmiling, Font.Twemoji, R.drawable.ic_1f607)
    )
    // endregion

    // region FaceAffection
    fun faceAffection(): List<EmojiIcon> = listOf(
        EmojiIcon("SmilingFaceWithHearts", "1f970", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f970),
        EmojiIcon("SmilingFaceWithHeart-Eyes", "1f60d", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f60d),
        EmojiIcon("Star-Struck", "1f929", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f929),
        EmojiIcon("FaceBlowingAKiss", "1f618", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f618),
        EmojiIcon("KissingFace", "1f617", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f617),
        EmojiIcon("SmilingFace", "263a", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_263a),
        EmojiIcon("KissingFaceWithClosedEyes", "1f61a", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f61a),
        EmojiIcon("KissingFaceWithSmilingEyes", "1f619", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f619),
        EmojiIcon("SmilingFaceWithTear", "1f972", Category.SmileysAndEmotion, Subcategory.FaceAffection, Font.Twemoji, R.drawable.ic_1f972)
    )
    // endregion

    // region FaceTongue
    fun faceTongue(): List<EmojiIcon> = listOf(
        EmojiIcon("FaceSavoringFood", "1f60b", Category.SmileysAndEmotion, Subcategory.FaceTongue, Font.Twemoji, R.drawable.ic_1f60b),
        EmojiIcon("FaceWithTongue", "1f61b", Category.SmileysAndEmotion, Subcategory.FaceTongue, Font.Twemoji, R.drawable.ic_1f61b),
        EmojiIcon("WinkingFaceWithTongue", "1f61c", Category.SmileysAndEmotion, Subcategory.FaceTongue, Font.Twemoji, R.drawable.ic_1f61c),
        EmojiIcon("ZanyFace", "1f92a", Category.SmileysAndEmotion, Subcategory.FaceTongue, Font.Twemoji, R.drawable.ic_1f92a),
        EmojiIcon("SquintingFaceWithTongue", "1f61d", Category.SmileysAndEmotion, Subcategory.FaceTongue, Font.Twemoji, R.drawable.ic_1f61d),
        EmojiIcon("Money-MouthFace", "1f911", Category.SmileysAndEmotion, Subcategory.FaceTongue, Font.Twemoji, R.drawable.ic_1f911)
    )
    // endregion

    // region FaceHand
    fun faceHand(): List<EmojiIcon> = listOf(
        EmojiIcon("HuggingFace", "1f917", Category.SmileysAndEmotion, Subcategory.FaceHand, Font.Twemoji, R.drawable.ic_1f917),
        EmojiIcon("FaceWithHandOverMouth", "1f92d", Category.SmileysAndEmotion, Subcategory.FaceHand, Font.Twemoji, R.drawable.ic_1f92d),
        EmojiIcon("ShushingFace", "1f92b", Category.SmileysAndEmotion, Subcategory.FaceHand, Font.Twemoji, R.drawable.ic_1f92b),
        EmojiIcon("ThinkingFace", "1f914", Category.SmileysAndEmotion, Subcategory.FaceHand, Font.Twemoji, R.drawable.ic_1f914)
    )
    // endregion

    // region FaceNeutralSkeptical
    fun faceNeutralSkeptical(): List<EmojiIcon> = listOf(
        EmojiIcon("ZipperMouthFace", "1f910", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f910),
        EmojiIcon("FaceWithRaisedEyebrow", "1f928", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f928),
        EmojiIcon("NeutralFace", "1f610", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f610),
        EmojiIcon("ExpressionlessFace", "1f611", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f611),
        EmojiIcon("FaceWithoutMouth", "1f636", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f636),
        EmojiIcon("FaceInClouds", "1f636-200d-1f32b-fe0f", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f636_200d_1f32b_fe0f),
        EmojiIcon("SmirkingFace", "1f60f", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f60f),
        EmojiIcon("UnamusedFace", "1f612", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f612),
        EmojiIcon("FaceWithRollingEyes", "1f644", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f644),
        EmojiIcon("GrimacingFace", "1f62c", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f62c),
        EmojiIcon("FaceExhaling", "1f62e-200d-1f4a8", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f62e_200d_1f4a8),
        EmojiIcon("GFace", "1f925", Category.SmileysAndEmotion, Subcategory.FaceNeutralSkeptical, Font.Twemoji, R.drawable.ic_1f925)
    )
    // endregion

    // region FaceSleepy
    fun faceSleepy(): List<EmojiIcon> = listOf(
        EmojiIcon("RelievedFace", "1f60c", Category.SmileysAndEmotion, Subcategory.FaceSleepy, Font.Twemoji, R.drawable.ic_1f60c),
        EmojiIcon("PensiveFace", "1f614", Category.SmileysAndEmotion, Subcategory.FaceSleepy, Font.Twemoji, R.drawable.ic_1f614),
        EmojiIcon("SleepyFace", "1f62a", Category.SmileysAndEmotion, Subcategory.FaceSleepy, Font.Twemoji, R.drawable.ic_1f62a),
        EmojiIcon("DroolingFace", "1f924", Category.SmileysAndEmotion, Subcategory.FaceSleepy, Font.Twemoji, R.drawable.ic_1f924),
        EmojiIcon("SleepingFace", "1f634", Category.SmileysAndEmotion, Subcategory.FaceSleepy, Font.Twemoji, R.drawable.ic_1f634)
    )
    // endregion

    // region FaceUnwell
    fun faceUnwell(): List<EmojiIcon> = listOf(
        EmojiIcon("FaceWithMedicalMask", "1f637", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f637),
        EmojiIcon("FaceWithThermometer", "1f912", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f912),
        EmojiIcon("FaceWithHead-Bandage", "1f915", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f915),
        EmojiIcon("NauseatedFace", "1f922", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f922),
        EmojiIcon("FaceVomiting", "1f92e", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f92e),
        EmojiIcon("SneezingFace", "1f927", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f927),
        EmojiIcon("HotFace", "1f975", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f975),
        EmojiIcon("ColdFace", "1f976", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f976),
        EmojiIcon("WoozyFace", "1f974", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f974),
        EmojiIcon("KnockedOutFace", "1f635", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f635),
        EmojiIcon("FaceWithSpiralEyes", "1f635-200d-1f4ab", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f635_200d_1f4ab),
        EmojiIcon("ExplodingHead", "1f92f", Category.SmileysAndEmotion, Subcategory.FaceUnwell, Font.Twemoji, R.drawable.ic_1f92f)
    )
    // endregion

    // region FaceHat
    fun faceHat(): List<EmojiIcon> = listOf(
        EmojiIcon("CowboyHatFace", "1f920", Category.SmileysAndEmotion, Subcategory.FaceHat, Font.Twemoji, R.drawable.ic_1f920),
        EmojiIcon("PartyingFace", "1f973", Category.SmileysAndEmotion, Subcategory.FaceHat, Font.Twemoji, R.drawable.ic_1f973),
        EmojiIcon("DisguisedFace", "1f978", Category.SmileysAndEmotion, Subcategory.FaceHat, Font.Twemoji, R.drawable.ic_1f978)
    )
    // endregion

    // region FaceGlasses
    fun faceGlasses(): List<EmojiIcon> = listOf(
        EmojiIcon("SmilingFaceWithSunglasses", "1f60e", Category.SmileysAndEmotion, Subcategory.FaceGlasses, Font.Twemoji, R.drawable.ic_1f60e),
        EmojiIcon("NerdFace", "1f913", Category.SmileysAndEmotion, Subcategory.FaceGlasses, Font.Twemoji, R.drawable.ic_1f913),
        EmojiIcon("FaceWithMonocle", "1f9d0", Category.SmileysAndEmotion, Subcategory.FaceGlasses, Font.Twemoji, R.drawable.ic_1f9d0)
    )
    // endregion

    // region FaceConcerned
    fun faceConcerned(): List<EmojiIcon> = listOf(
        EmojiIcon("ConfusedFace", "1f615", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f615),
        EmojiIcon("WorriedFace", "1f61f", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f61f),
        EmojiIcon("SlightlyFrowningFace", "1f641", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f641),
        EmojiIcon("RowningFace", "2639", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_2639),
        EmojiIcon("FaceWithOpenMouth", "1f62e", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f62e),
        EmojiIcon("HushedFace", "1f62f", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f62f),
        EmojiIcon("AstonishedFace", "1f632", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f632),
        EmojiIcon("FlushedFace", "1f633", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f633),
        EmojiIcon("PleadingFace", "1f97a", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f97a),
        EmojiIcon("FrowningFaceWithOpenMouth", "1f626", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f626),
        EmojiIcon("AnguishedFace", "1f627", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f627),
        EmojiIcon("FearfulFace", "1f628", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f628),
        EmojiIcon("AnxiousFaceWithSweat", "1f630", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f630),
        EmojiIcon("SadButRelievedFace", "1f625", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f625),
        EmojiIcon("CryingFace", "1f622", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f622),
        EmojiIcon("LoudlyCryingFace", "1f62d", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f62d),
        EmojiIcon("FaceScreamingInFear", "1f631", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f631),
        EmojiIcon("ConfoundedFace", "1f616", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f616),
        EmojiIcon("PerseveringFace", "1f623", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f623),
        EmojiIcon("DisappointedFace", "1f61e", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f61e),
        EmojiIcon("DowncastFaceWithSweat", "1f613", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f613),
        EmojiIcon("WearyFace", "1f629", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f629),
        EmojiIcon("TiredFace", "1f62b", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f62b),
        EmojiIcon("YawningFace", "1f971", Category.SmileysAndEmotion, Subcategory.FaceConcerned, Font.Twemoji, R.drawable.ic_1f971)
    )
    // endregion

    // region FaceNegative
    fun faceNegative(): List<EmojiIcon> = listOf(
        EmojiIcon("FaceWithSteamFromNose", "1f624", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f624),
        EmojiIcon("PoutingFace", "1f621", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f621),
        EmojiIcon("AngryFace", "1f620", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f620),
        EmojiIcon("FaceWithSymbolsOnMouth", "1f92c", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f92c),
        EmojiIcon("SmilingFaceWithHorns", "1f608", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f608),
        EmojiIcon("AngryFaceWithHorns", "1f47f", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f47f),
        EmojiIcon("Skull", "1f480", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_1f480),
        EmojiIcon("SkullAndCrossbones", "2620", Category.SmileysAndEmotion, Subcategory.FaceNegative, Font.Twemoji, R.drawable.ic_2620)
    )
    // endregion

    // region FaceCostume
    fun faceCostume(): List<EmojiIcon> = listOf(
        EmojiIcon("PileOfPoo", "1f4a9", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f4a9),
        EmojiIcon("ClownFace", "1f921", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f921),
        EmojiIcon("Ogre", "1f479", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f479),
        EmojiIcon("Goblin", "1f47a", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f47a),
        EmojiIcon("Ghost", "1f47b", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f47b),
        EmojiIcon("Alien", "1f47d", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f47d),
        EmojiIcon("AlienMonster", "1f47e", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f47e),
        EmojiIcon("Robot", "1f916", Category.SmileysAndEmotion, Subcategory.FaceCostume, Font.Twemoji, R.drawable.ic_1f916)
    )
    // endregion

    // region CatFace
    fun catFace(): List<EmojiIcon> = listOf(
        EmojiIcon("GrinningCat", "1f63a", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f63a),
        EmojiIcon("GrinningCatWithSmilingEyes", "1f638", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f638),
        EmojiIcon("CatWithTearsOfJoy", "1f639", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f639),
        EmojiIcon("SmilingCatWithHeart-Eyes", "1f63b", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f63b),
        EmojiIcon("CatWithWrySmile", "1f63c", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f63c),
        EmojiIcon("KissingCat", "1f63d", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f63d),
        EmojiIcon("WearyCat", "1f640", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f640),
        EmojiIcon("CryingCat", "1f63f", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f63f),
        EmojiIcon("PoutingCat", "1f63e", Category.SmileysAndEmotion, Subcategory.CatFace, Font.Twemoji, R.drawable.ic_1f63e)
    )
    // endregion

    // region MonkeyFace
    fun monkeyFace(): List<EmojiIcon> = listOf(
        EmojiIcon("SeeNoEvilMonkey", "1f648", Category.SmileysAndEmotion, Subcategory.MonkeyFace, Font.Twemoji, R.drawable.ic_1f648),
        EmojiIcon("HearNoEvilMonkey", "1f649", Category.SmileysAndEmotion, Subcategory.MonkeyFace, Font.Twemoji, R.drawable.ic_1f649),
        EmojiIcon("SpeakNoEvilMonkey", "1f64a", Category.SmileysAndEmotion, Subcategory.MonkeyFace, Font.Twemoji, R.drawable.ic_1f64a)
    )
    // endregion

    // region Emotion
    fun emotion(): List<EmojiIcon> = listOf()
    // endregion

}