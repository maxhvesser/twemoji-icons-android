package no.mhl.twemojiiconsandroid.smileys

import no.mhl.twemojiiconsandroid.core.model.TwemojiCategory
import no.mhl.twemojiiconsandroid.core.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.core.model.TwemojiSubcategory

object SmileysAndEmotionProvider {

    // region All
    fun provideSmileysAndEmotion(): List<TwemojiIcon> = listOf(
        provideCatFace(),
        provideEmotion(),
        provideAffection(),
        provideConcerned(),
        provideCostume(),
        provideGlasses(),
        provideHand(),
        provideHat(),
        provideNegative(),
        provideNeutralSkeptical(),
        provideSleepy(),
        provideSmiling(),
        provideTongue(),
        provideUnwell(),
        provideMonkeyFace()
    ).flatten()
    // endregion

    // region Cat face
    private fun provideCatFace(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "SmilingCatWithHeartEyes", unicode = "1f63b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63b),
        TwemojiIcon(plainName = "CatWithTearsOfJoy", unicode = "1f639", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f639),
        TwemojiIcon(plainName = "CryingCat", unicode = "1f63f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63f),
        TwemojiIcon(plainName = "KissingCat", unicode = "1f63d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63d),
        TwemojiIcon(plainName = "CatWithWrySmile", unicode = "1f63c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63c),
        TwemojiIcon(plainName = "GrinningCatWithSmilingEyes", unicode = "1f638", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f638),
        TwemojiIcon(plainName = "WearyCat", unicode = "1f640", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f640),
        TwemojiIcon(plainName = "GrinningCat", unicode = "1f63a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63a),
        TwemojiIcon(plainName = "PoutingCat", unicode = "1f63e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63e)
    )
    // endregion

    // region Emotion
    private fun provideEmotion(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "RedHeart", unicode = "2764", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_2764),
        TwemojiIcon(plainName = "TwoHearts", unicode = "1f495", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f495),
        TwemojiIcon(plainName = "PurpleHeart", unicode = "1f49c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49c),
        TwemojiIcon(plainName = "BrokenHeart", unicode = "1f494", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f494),
        TwemojiIcon(plainName = "HundredPoints", unicode = "1f4af", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4af),
        TwemojiIcon(plainName = "SparklingHeart", unicode = "1f496", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f496),
        TwemojiIcon(plainName = "BlueHeart", unicode = "1f499", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f499),
        TwemojiIcon(plainName = "HeartWithArrow", unicode = "1f498", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f498),
        TwemojiIcon(plainName = "GrowingHeart", unicode = "1f497", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f497),
        TwemojiIcon(plainName = "RevolvingHearts", unicode = "1f49e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49e),
        TwemojiIcon(plainName = "KissMark", unicode = "1f48b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f48b),
        TwemojiIcon(plainName = "YellowHeart", unicode = "1f49b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49b),
        TwemojiIcon(plainName = "GreenHeart", unicode = "1f49a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49a),
        TwemojiIcon(plainName = "BeatingHeart", unicode = "1f493", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f493),
        TwemojiIcon(plainName = "Dizzy", unicode = "1f4ab", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4ab),
        TwemojiIcon(plainName = "Collision", unicode = "1f4a5", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a5),
        TwemojiIcon(plainName = "ThoughtBalloon", unicode = "1f4ad", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4ad),
        TwemojiIcon(plainName = "SweatDroplets", unicode = "1f4a6", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a6),
        TwemojiIcon(plainName = "Zzz", unicode = "1f4a4", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a4),
        TwemojiIcon(plainName = "HeartDecoration", unicode = "1f49f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49f),
        TwemojiIcon(plainName = "HeartWithRibbon", unicode = "1f49d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49d),
        TwemojiIcon(plainName = "HeartWithBandage", unicode = "2764-fe0f-200d1-fa79", category = TwemojiCategory.SmileysAndEmotion, TwemojiSubcategory.Emotion, resource = R.drawable.ic_2764_fe0f_200d_1fa79),
        TwemojiIcon(plainName = "HeartOnFire", unicode = "2764-fe0f-200d-1f525", category = TwemojiCategory.SmileysAndEmotion, TwemojiSubcategory.Emotion, resource = R.drawable.ic_2764_fe0f_200d_1f525),
        TwemojiIcon(plainName = "DashingAway", unicode = "1f4a8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a8),
        TwemojiIcon(plainName = "LoveLetter", unicode = "1f48c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f48c),
        TwemojiIcon(plainName = "Bomb", unicode = "1f4a3", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a3),
        TwemojiIcon(plainName = "AngerSymbol", unicode = "1f4a2", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a2),
        TwemojiIcon(plainName = "SpeechBalloon", unicode = "1f4ac", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4ac),
        TwemojiIcon(plainName = "EyeInSpeechBubble", unicode = "1f441-200d-1f5e8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f441_200d_1f5e8),
        TwemojiIcon(plainName = "HeartExclamation", unicode = "2763", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_2763),
        TwemojiIcon(plainName = "RightAngerBubble", unicode = "1f5ef", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f5ef),
        TwemojiIcon(plainName = "Hole", unicode = "1f573", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f573),
        TwemojiIcon(plainName = "BlackHeart", unicode = "1f5a4", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f5a4),
        TwemojiIcon(plainName = "LeftSpeechBubble", unicode = "1f5e8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f5e8),
        TwemojiIcon(plainName = "OrangeHeart", unicode = "1f9e1", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f9e1),
        TwemojiIcon(plainName = "BrownHeart", unicode = "1f90e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f90e),
        TwemojiIcon(plainName = "WhiteHeart", unicode = "1f90d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f90d)
    )
    // endregion

    // region Affection
    private fun provideAffection(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "SmilingFaceWithHeartEyes", unicode = "1f60d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f60d),
        TwemojiIcon(plainName = "FaceBlowingAKiss", unicode = "1f618", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f618),
        TwemojiIcon(plainName = "KissingFaceWithClosedEyes", unicode = "1f61a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f61a),
        TwemojiIcon(plainName = "KissingFaceWithSmilingEyes", unicode = "1f619", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f619),
        TwemojiIcon(plainName = "KissingFace", unicode = "1f617", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f617),
        TwemojiIcon(plainName = "SmilingFaceWithHearts", unicode = "1f970", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f970),
        TwemojiIcon(plainName = "StarStruck", unicode = "1f929", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f929),
        TwemojiIcon(plainName = "SmilingFace", unicode = "263a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_263a)
    )
    // endregion

    // region Concerned
    private fun provideConcerned(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "LoudlyCryingFace", unicode = "1f62d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62d),
        TwemojiIcon(plainName = "WearyFace", unicode = "1f629", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f629),
        TwemojiIcon(plainName = "FlushedFace", unicode = "1f633", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f633),
        TwemojiIcon(plainName = "CryingFace", unicode = "1f622", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f622),
        TwemojiIcon(plainName = "ConfusedFace", unicode = "1f615", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f615),
        TwemojiIcon(plainName = "DisappointedFace", unicode = "1f61e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f61e),
        TwemojiIcon(plainName = "FaceScreamingInFear", unicode = "1f631", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f631),
        TwemojiIcon(plainName = "TiredFace", unicode = "1f62b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62b),
        TwemojiIcon(plainName = "DowncastFaceWithSweat", unicode = "1f613", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f613),
        TwemojiIcon(plainName = "PerseveringFace", unicode = "1f623", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f623),
        TwemojiIcon(plainName = "SadButRelievedFace", unicode = "1f625", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f625),
        TwemojiIcon(plainName = "ConfoundedFace", unicode = "1f616", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f616),
        TwemojiIcon(plainName = "AnxiousFaceWithSweat", unicode = "1f630", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f630),
        TwemojiIcon(plainName = "WorriedFace", unicode = "1f61f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f61f),
        TwemojiIcon(plainName = "FearfulFace", unicode = "1f628", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f628),
        TwemojiIcon(plainName = "AnguishedFace", unicode = "1f627", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f627),
        TwemojiIcon(plainName = "FaceWithOpenMouth", unicode = "1f62e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62e),
        TwemojiIcon(plainName = "FaceExhaling", unicode = "1f62e-200d-1f4a8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62e_200d_1f4a8),
        TwemojiIcon(plainName = "HushedFace", unicode = "1f62f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62f),
        TwemojiIcon(plainName = "AstonishedFace", unicode = "1f632", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f632),
        TwemojiIcon(plainName = "FrowningFaceWithOpenMouth", unicode = "1f626", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f626),
        TwemojiIcon(plainName = "FrowningFace", unicode = "2639", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_2639),
        TwemojiIcon(plainName = "SlightlyFrowningFace", unicode = "1f641", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f641),
        TwemojiIcon(plainName = "PleadingFace", unicode = "1f97a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f97a),
        TwemojiIcon(plainName = "YawningFace", unicode = "1f971", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f971)
    )
    // endregion

    // region Costume
    private fun provideCostume(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "PileOfPoo", unicode = "1f4a9", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f4a9),
        TwemojiIcon(plainName = "Ghost", unicode = "1f47b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47b),
        TwemojiIcon(plainName = "Alien", unicode = "1f47d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47d),
        TwemojiIcon(plainName = "AlienMonster", unicode = "1f47e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47e),
        TwemojiIcon(plainName = "Ogre", unicode = "1f479", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f479),
        TwemojiIcon(plainName = "Goblin", unicode = "1f47a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47a),
        TwemojiIcon(plainName = "Robot", unicode = "1f916", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f916),
        TwemojiIcon(plainName = "DisguisedFace", unicode = "1f978", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f978),
        TwemojiIcon(plainName = "ClownFace", unicode = "1f921", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f921)
    )
    // endregion

    // region Glasses
    private fun provideGlasses(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "SmilingFaceWithSunglasses", unicode = "1f60e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceGlasses, resource = R.drawable.ic_1f60e),
        TwemojiIcon(plainName = "NerdFace", unicode = "1f913", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceGlasses, resource = R.drawable.ic_1f913),
        TwemojiIcon(plainName = "FaceWithMonocle", unicode = "1f9d0", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceGlasses, resource = R.drawable.ic_1f9d0)
    )
    // endregion

    // region Hand
    private fun provideHand(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "HuggingFace", unicode = "1f917", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f917),
        TwemojiIcon(plainName = "ThinkingFace", unicode = "1f914", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f914),
        TwemojiIcon(plainName = "FaceWithHandOverMouth", unicode = "1f92d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f92d),
        TwemojiIcon(plainName = "ShushingFace", unicode = "1f92b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f92b)
    )
    // endregion

    // region Hat
    private fun provideHat(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "CowboyHatFace", unicode = "1f920", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHat, resource = R.drawable.ic_1f920),
        TwemojiIcon(plainName = "PartyingFace", unicode = "1f973", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHat, resource = R.drawable.ic_1f973)
    )
    // endregion

    // region Negative
    private fun provideNegative(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "PoutingFace", unicode = "1f621", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f621),
        TwemojiIcon(plainName = "Skull", unicode = "1f480", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f480),
        TwemojiIcon(plainName = "FaceWithSteamFromNose", unicode = "1f624", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f624),
        TwemojiIcon(plainName = "AngryFace", unicode = "1f620", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f620),
        TwemojiIcon(plainName = "SmilingFaceWithHorns", unicode = "1f608", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f608),
        TwemojiIcon(plainName = "AngryFaceWithHorns", unicode = "1f47f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f47f),
        TwemojiIcon(plainName = "SkullAndCrossbones", unicode = "2620", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_2620),
        TwemojiIcon(plainName = "FaceWithSymbolsOnMouth", unicode = "1f92c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f92c)
    )
    // endregion

    // region Neutral skeptical
    private fun provideNeutralSkeptical(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "UnamusedFace", unicode = "1f612", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f612),
        TwemojiIcon(plainName = "SmirkingFace", unicode = "1f60f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f60f),
        TwemojiIcon(plainName = "ExpressionlessFace", unicode = "1f611", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f611),
        TwemojiIcon(plainName = "NeutralFace", unicode = "1f610", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f610),
        TwemojiIcon(plainName = "GrimacingFace", unicode = "1f62c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f62c),
        TwemojiIcon(plainName = "FaceWithoutMouth", unicode = "1f636", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f636),
        TwemojiIcon(plainName = "FaceInClouds", unicode = "1f636-200d-1f32b-fe0f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f636_200d_1f32b_fe0f),
        TwemojiIcon(plainName = "ZipperMouthFace", unicode = "1f910", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f910),
        TwemojiIcon(plainName = "FaceWithRollingEyes", unicode = "1f644", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f644),
        TwemojiIcon(plainName = "FaceWithRaisedEyebrow", unicode = "1f928", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f928),
        TwemojiIcon(plainName = "LyingFace", unicode = "1f925", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f925)
    )
    // endregion

    // region Sleepy
    private fun provideSleepy(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "PensiveFace", unicode = "1f614", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f614),
        TwemojiIcon(plainName = "RelievedFace", unicode = "1f60c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f60c),
        TwemojiIcon(plainName = "SleepingFace", unicode = "1f634", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f634),
        TwemojiIcon(plainName = "SleepyFace", unicode = "1f62a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f62a),
        TwemojiIcon(plainName = "DroolingFace", unicode = "1f924", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f924)
    )
    // endregion

    // region Smiling
    private fun provideSmiling(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "FaceWithTearsOfJoy", unicode = "1f602", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f602),
        TwemojiIcon(plainName = "SmilingFaceWithSmilingEyes", unicode = "1f60a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f60a),
        TwemojiIcon(plainName = "BeamingFaceWithSmilingEyes", unicode = "1f601", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f601),
        TwemojiIcon(plainName = "WinkingFace", unicode = "1f609", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f609),
        TwemojiIcon(plainName = "GrinningFaceWithSweat", unicode = "1f605", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f605),
        TwemojiIcon(plainName = "GrinningFaceWithSmilingEyes", unicode = "1f604", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f604),
        TwemojiIcon(plainName = "GrinningFaceWithBigEyes", unicode = "1f603", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f603),
        TwemojiIcon(plainName = "GrinningSquintingFace", unicode = "1f606", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f606),
        TwemojiIcon(plainName = "GrinningFace", unicode = "1f600", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f600),
        TwemojiIcon(plainName = "SmilingFaceWithHalo", unicode = "1f607", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f607),
        TwemojiIcon(plainName = "UpsideDownFace", unicode = "1f643", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f643),
        TwemojiIcon(plainName = "SlightlySmilingFace", unicode = "1f642", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f642),
        TwemojiIcon(plainName = "SmilingFaceWithTear", unicode = "1f972", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f972),
        TwemojiIcon(plainName = "RollingOnTheFloorLaughing", unicode = "1f923", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f923)
    )
    // endregion

    // region Tongue
    private fun provideTongue(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "WinkingFaceWithTongue", unicode = "1f61c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f61c),
        TwemojiIcon(plainName = "FaceSavoringFood", unicode = "1f60b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f60b),
        TwemojiIcon(plainName = "SquintingFaceWithTongue", unicode = "1f61d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f61d),
        TwemojiIcon(plainName = "FaceWithTongue", unicode = "1f61b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f61b),
        TwemojiIcon(plainName = "MoneyMouthFace", unicode = "1f911", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f911),
        TwemojiIcon(plainName = "ZanyFace", unicode = "1f92a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f92a)
    )
    // endregion

    // region Unwell
    private fun provideUnwell(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "FaceWithMedicalMask", unicode = "1f637", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f637),
        TwemojiIcon(plainName = "DizzyFace", unicode = "1f635", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f635),
        TwemojiIcon(plainName = "FaceWithSpiralEyes", unicode = "1f635-200d-1f4ab", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f635_200d_1f4ab),
        TwemojiIcon(plainName = "FaceWithHeadBandage", unicode = "1f915", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f915),
        TwemojiIcon(plainName = "FaceWithThermometer", unicode = "1f912", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f912),
        TwemojiIcon(plainName = "NauseatedFace", unicode = "1f922", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f922),
        TwemojiIcon(plainName = "FaceVomiting", unicode = "1f92e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f92e),
        TwemojiIcon(plainName = "SneezingFace", unicode = "1f927", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f927),
        TwemojiIcon(plainName = "HotFace", unicode = "1f975", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f975),
        TwemojiIcon(plainName = "ColdFace", unicode = "1f976", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f976),
        TwemojiIcon(plainName = "WoozyFace", unicode = "1f974", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f974),
        TwemojiIcon(plainName = "ExplodingHead", unicode = "1f92f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f92f)
    )
    // endregion

    // region Monkey face
    private fun provideMonkeyFace(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "SeeNoEvilMonkey", unicode = "1f648", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.MonkeyFace, resource = R.drawable.ic_1f648),
        TwemojiIcon(plainName = "SpeakNoEvilMonkey", unicode = "1f64a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.MonkeyFace, resource = R.drawable.ic_1f64a),
        TwemojiIcon(plainName = "HearNoEvilMonkey", unicode = "1f649", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.MonkeyFace, resource = R.drawable.ic_1f649)
    )
    // endregion

}