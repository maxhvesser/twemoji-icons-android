package no.mhl.twemojiiconsandroid

import androidx.annotation.DrawableRes

data class TwemojiIcon(
    val plainName: String,
    val unicode: String,
    val category: TwemojiCategory,
    val subcategory: TwemojiSubcategory,
    @DrawableRes val resource: Int
)

enum class TwemojiIconnn(
    val plainName: String,
    val unicode: String,
    val category: TwemojiCategory,
    val subcategory: TwemojiSubcategory,
    @DrawableRes val resource: Int
) {

    /**
     * Smileys and emotion
     */
    // region Cat face
    SmilingCatWithHeartEyes(plainName = "SmilingCatWithHeartEyes", unicode = "1f63b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63b),
    CatWithTearsOfJoy(plainName = "CatWithTearsOfJoy", unicode = "1f639", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f639),
    CryingCat(plainName = "CryingCat", unicode = "1f63f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63f),
    KissingCat(plainName = "KissingCat", unicode = "1f63d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63d),
    CatWithWrySmile(plainName = "CatWithWrySmile", unicode = "1f63c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63c),
    GrinningCatWithSmilingEyes(plainName = "GrinningCatWithSmilingEyes", unicode = "1f638", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f638),
    WearyCat(plainName = "WearyCat", unicode = "1f640", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f640),
    GrinningCat(plainName = "GrinningCat", unicode = "1f63a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63a),
    PoutingCat(plainName = "PoutingCat", unicode = "1f63e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.CatFace, resource = R.drawable.ic_1f63e),
    // endregion

    // region Emotion
    RedHeart(plainName = "RedHeart", unicode = "2764", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_2764),
    TwoHearts(plainName = "TwoHearts", unicode = "1f495", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f495),
    PurpleHeart(plainName = "PurpleHeart", unicode = "1f49c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49c),
    BrokenHeart(plainName = "BrokenHeart", unicode = "1f494", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f494),
    HundredPoints(plainName = "HundredPoints", unicode = "1f4af", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4af),
    SparklingHeart(plainName = "SparklingHeart", unicode = "1f496", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f496),
    BlueHeart(plainName = "BlueHeart", unicode = "1f499", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f499),
    HeartWithArrow(plainName = "HeartWithArrow", unicode = "1f498", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f498),
    GrowingHeart(plainName = "GrowingHeart", unicode = "1f497", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f497),
    RevolvingHearts(plainName = "RevolvingHearts", unicode = "1f49e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49e),
    KissMark(plainName = "KissMark", unicode = "1f48b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f48b),
    YellowHeart(plainName = "YellowHeart", unicode = "1f49b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49b),
    GreenHeart(plainName = "GreenHeart", unicode = "1f49a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49a),
    BeatingHeart(plainName = "BeatingHeart", unicode = "1f493", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f493),
    Dizzy(plainName = "Dizzy", unicode = "1f4ab", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4ab),
    Collision(plainName = "Collision", unicode = "1f4a5", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a5),
    ThoughtBalloon(plainName = "ThoughtBalloon", unicode = "1f4ad", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4ad),
    SweatDroplets(plainName = "SweatDroplets", unicode = "1f4a6", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a6),
    Zzz(plainName = "Zzz", unicode = "1f4a4", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a4),
    HeartDecoration(plainName = "HeartDecoration", unicode = "1f49f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49f),
    HeartWithRibbon(plainName = "HeartWithRibbon", unicode = "1f49d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f49d),
    DashingAway(plainName = "DashingAway", unicode = "1f4a8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a8),
    LoveLetter(plainName = "LoveLetter", unicode = "1f48c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f48c),
    Bomb(plainName = "Bomb", unicode = "1f4a3", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a3),
    AngerSymbol(plainName = "AngerSymbol", unicode = "1f4a2", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4a2),
    SpeechBalloon(plainName = "SpeechBalloon", unicode = "1f4ac", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f4ac),
    EyeInSpeechBubble(plainName = "EyeInSpeechBubble", unicode = "1f441-200d-1f5e8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f441_200d_1f5e8),
    HeartExclamation(plainName = "HeartExclamation", unicode = "2763", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_2763),
    RightAngerBubble(plainName = "RightAngerBubble", unicode = "1f5ef", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f5ef),
    Hole(plainName = "Hole", unicode = "1f573", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f573),
    BlackHeart(plainName = "BlackHeart", unicode = "1f5a4", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f5a4),
    LeftSpeechBubble(plainName = "LeftSpeechBubble", unicode = "1f5e8", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f5e8),
    OrangeHeart(plainName = "OrangeHeart", unicode = "1f9e1", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f9e1),
    BrownHeart(plainName = "BrownHeart", unicode = "1f90e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f90e),
    WhiteHeart(plainName = "WhiteHeart", unicode = "1f90d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.Emotion, resource = R.drawable.ic_1f90d),
    // endregion

    // region Affection
    SmilingFaceWithHeartEyes(plainName = "SmilingFaceWithHeartEyes", unicode = "1f60d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f60d),
    FaceBlowingAKiss(plainName = "FaceBlowingAKiss", unicode = "1f618", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f618),
    KissingFaceWithClosedEyes(plainName = "KissingFaceWithClosedEyes", unicode = "1f61a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f61a),
    KissingFaceWithSmilingEyes(plainName = "KissingFaceWithSmilingEyes", unicode = "1f619", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f619),
    KissingFace(plainName = "KissingFace", unicode = "1f617", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f617),
    SmilingFaceWithHearts(plainName = "SmilingFaceWithHearts", unicode = "1f970", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f970),
    StarStruck(plainName = "StarStruck", unicode = "1f929", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_1f929),
    SmilingFace(plainName = "SmilingFace", unicode = "263a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceAffection, resource = R.drawable.ic_263a),
    // endregion

    // region Concerned
    LoudlyCryingFace(plainName = "LoudlyCryingFace", unicode = "1f62d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62d),
    WearyFace(plainName = "WearyFace", unicode = "1f629", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f629),
    FlushedFace(plainName = "FlushedFace", unicode = "1f633", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f633),
    CryingFace(plainName = "CryingFace", unicode = "1f622", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f622),
    ConfusedFace(plainName = "ConfusedFace", unicode = "1f615", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f615),
    DisappointedFace(plainName = "DisappointedFace", unicode = "1f61e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f61e),
    FaceScreamingInFear(plainName = "FaceScreamingInFear", unicode = "1f631", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f631),
    TiredFace(plainName = "TiredFace", unicode = "1f62b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62b),
    DowncastFaceWithSweat(plainName = "DowncastFaceWithSweat", unicode = "1f613", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f613),
    PerseveringFace(plainName = "PerseveringFace", unicode = "1f623", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f623),
    SadButRelievedFace(plainName = "SadButRelievedFace", unicode = "1f625", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f625),
    ConfoundedFace(plainName = "ConfoundedFace", unicode = "1f616", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f616),
    AnxiousFaceWithSweat(plainName = "AnxiousFaceWithSweat", unicode = "1f630", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f630),
    WorriedFace(plainName = "WorriedFace", unicode = "1f61f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f61f),
    FearfulFace(plainName = "FearfulFace", unicode = "1f628", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f628),
    AnguishedFace(plainName = "AnguishedFace", unicode = "1f627", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f627),
    FaceWithOpenMouth(plainName = "FaceWithOpenMouth", unicode = "1f62e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62e),
    HushedFace(plainName = "HushedFace", unicode = "1f62f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f62f),
    AstonishedFace(plainName = "AstonishedFace", unicode = "1f632", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f632),
    FrowningFaceWithOpenMouth(plainName = "FrowningFaceWithOpenMouth", unicode = "1f626", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f626),
    FrowningFace(plainName = "FrowningFace", unicode = "2639", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_2639),
    SlightlyFrowningFace(plainName = "SlightlyFrowningFace", unicode = "1f641", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f641),
    PleadingFace(plainName = "PleadingFace", unicode = "1f97a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f97a),
    YawningFace(plainName = "YawningFace", unicode = "1f971", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceConcerned, resource = R.drawable.ic_1f971),
    // endregion

    // region Costume
    PileOfPoo(plainName = "PileOfPoo", unicode = "1f4a9", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f4a9),
    Ghost(plainName = "Ghost", unicode = "1f47b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47b),
    Alien(plainName = "Alien", unicode = "1f47d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47d),
    AlienMonster(plainName = "AlienMonster", unicode = "1f47e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47e),
    Ogre(plainName = "Ogre", unicode = "1f479", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f479),
    Goblin(plainName = "Goblin", unicode = "1f47a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f47a),
    Robot(plainName = "Robot", unicode = "1f916", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f916),
    ClownFace(plainName = "ClownFace", unicode = "1f921", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceCostume, resource = R.drawable.ic_1f921),
    // endregion

    // region Glasses
    SmilingFaceWithSunglasses(plainName = "SmilingFaceWithSunglasses", unicode = "1f60e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceGlasses, resource = R.drawable.ic_1f60e),
    NerdFace(plainName = "NerdFace", unicode = "1f913", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceGlasses, resource = R.drawable.ic_1f913),
    FaceWithMonocle(plainName = "FaceWithMonocle", unicode = "1f9d0", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceGlasses, resource = R.drawable.ic_1f9d0),
    // endregion

    // region Hand
    HuggingFace(plainName = "HuggingFace", unicode = "1f917", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f917),
    ThinkingFace(plainName = "ThinkingFace", unicode = "1f914", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f914),
    FaceWithHandOverMouth(plainName = "FaceWithHandOverMouth", unicode = "1f92d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f92d),
    ShushingFace(plainName = "ShushingFace", unicode = "1f92b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHand, resource = R.drawable.ic_1f92b),
    // endregion

    // region Hat
    CowboyHatFace(plainName = "CowboyHatFace", unicode = "1f920", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHat, resource = R.drawable.ic_1f920),
    PartyingFace(plainName = "PartyingFace", unicode = "1f973", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceHat, resource = R.drawable.ic_1f973),
    // endregion

    // region Negative
    PoutingFace(plainName = "PoutingFace", unicode = "1f621", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f621),
    Skull(plainName = "Skull", unicode = "1f480", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f480),
    FaceWithSteamFromNose(plainName = "FaceWithSteamFromNose", unicode = "1f624", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f624),
    AngryFace(plainName = "AngryFace", unicode = "1f620", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f620),
    SmilingFaceWithHorns(plainName = "SmilingFaceWithHorns", unicode = "1f608", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f608),
    AngryFaceWithHorns(plainName = "AngryFaceWithHorns", unicode = "1f47f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f47f),
    SkullAndCrossbones(plainName = "SkullAndCrossbones", unicode = "2620", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_2620),
    FaceWithSymbolsOnMouth(plainName = "FaceWithSymbolsOnMouth", unicode = "1f92c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNegative, resource = R.drawable.ic_1f92c),
    // endregion

    // region Neutral skeptical
    UnamusedFace(plainName = "UnamusedFace", unicode = "1f612", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f612),
    SmirkingFace(plainName = "SmirkingFace", unicode = "1f60f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f60f),
    ExpressionlessFace(plainName = "ExpressionlessFace", unicode = "1f611", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f611),
    NeutralFace(plainName = "NeutralFace", unicode = "1f610", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f610),
    GrimacingFace(plainName = "GrimacingFace", unicode = "1f62c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f62c),
    FaceWithoutMouth(plainName = "FaceWithoutMouth", unicode = "1f636", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f636),
    ZipperMouthFace(plainName = "ZipperMouthFace", unicode = "1f910", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f910),
    FaceWithRollingEyes(plainName = "FaceWithRollingEyes", unicode = "1f644", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f644),
    FaceWithRaisedEyebrow(plainName = "FaceWithRaisedEyebrow", unicode = "1f928", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f928),
    LyingFace(plainName = "LyingFace", unicode = "1f925", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceNeutralSkeptical, resource = R.drawable.ic_1f925),
    // endregion

    // region Sleepy
    PensiveFace(plainName = "PensiveFace", unicode = "1f614", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f614),
    RelievedFace(plainName = "RelievedFace", unicode = "1f60c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f60c),
    SleepingFace(plainName = "SleepingFace", unicode = "1f634", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f634),
    SleepyFace(plainName = "SleepyFace", unicode = "1f62a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f62a),
    DroolingFace(plainName = "DroolingFace", unicode = "1f924", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSleepy, resource = R.drawable.ic_1f924),
    // endregion

    // region Smiling
    FaceWithTearsOfJoy(plainName = "FaceWithTearsOfJoy", unicode = "1f602", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f602),
    SmilingFaceWithSmilingEyes(plainName = "SmilingFaceWithSmilingEyes", unicode = "1f60a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f60a),
    BeamingFaceWithSmilingEyes(plainName = "BeamingFaceWithSmilingEyes", unicode = "1f601", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f601),
    WinkingFace(plainName = "WinkingFace", unicode = "1f609", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f609),
    GrinningFaceWithSweat(plainName = "GrinningFaceWithSweat", unicode = "1f605", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f605),
    GrinningFaceWithSmilingEyes(plainName = "GrinningFaceWithSmilingEyes", unicode = "1f604", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f604),
    GrinningFaceWithBigEyes(plainName = "GrinningFaceWithBigEyes", unicode = "1f603", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f603),
    GrinningSquintingFace(plainName = "GrinningSquintingFace", unicode = "1f606", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f606),
    GrinningFace(plainName = "GrinningFace", unicode = "1f600", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f600),
    SmilingFaceWithHalo(plainName = "SmilingFaceWithHalo", unicode = "1f607", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f607),
    UpsideDownFace(plainName = "UpsideDownFace", unicode = "1f643", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f643),
    SlightlySmilingFace(plainName = "SlightlySmilingFace", unicode = "1f642", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f642),
    RollingOnTheFloorLaughing(plainName = "RollingOnTheFloorLaughing", unicode = "1f923", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceSmiling, resource = R.drawable.ic_1f923),
    // endregion

    // region Tongue
    WinkingFaceWithTongue(plainName = "WinkingFaceWithTongue", unicode = "1f61c", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f61c),
    FaceSavoringFood(plainName = "FaceSavoringFood", unicode = "1f60b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f60b),
    SquintingFaceWithTongue(plainName = "SquintingFaceWithTongue", unicode = "1f61d", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f61d),
    FaceWithTongue(plainName = "FaceWithTongue", unicode = "1f61b", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f61b),
    MoneyMouthFace(plainName = "MoneyMouthFace", unicode = "1f911", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f911),
    ZanyFace(plainName = "ZanyFace", unicode = "1f92a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceTongue, resource = R.drawable.ic_1f92a),
    // endregion

    // region Unwell
    FaceWithMedicalMask(plainName = "FaceWithMedicalMask", unicode = "1f637", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f637),
    DizzyFace(plainName = "DizzyFace", unicode = "1f635", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f635),
    FaceWithHeadBandage(plainName = "FaceWithHeadBandage", unicode = "1f915", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f915),
    FaceWithThermometer(plainName = "FaceWithThermometer", unicode = "1f912", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f912),
    NauseatedFace(plainName = "NauseatedFace", unicode = "1f922", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f922),
    FaceVomiting(plainName = "FaceVomiting", unicode = "1f92e", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f92e),
    SneezingFace(plainName = "SneezingFace", unicode = "1f927", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f927),
    HotFace(plainName = "HotFace", unicode = "1f975", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f975),
    ColdFace(plainName = "ColdFace", unicode = "1f976", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f976),
    WoozyFace(plainName = "WoozyFace", unicode = "1f974", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f974),
    ExplodingHead(plainName = "ExplodingHead", unicode = "1f92f", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.FaceUnwell, resource = R.drawable.ic_1f92f),
    // endregion

    // region Monkey face
    SeeNoEvilMonkey(plainName = "SeeNoEvilMonkey", unicode = "1f648", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.MonkeyFace, resource = R.drawable.ic_1f648),
    SpeakNoEvilMonkey(plainName = "SpeakNoEvilMonkey", unicode = "1f64a", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.MonkeyFace, resource = R.drawable.ic_1f64a),
    HearNoEvilMonkey(plainName = "HearNoEvilMonkey", unicode = "1f649", category = TwemojiCategory.SmileysAndEmotion, subcategory = TwemojiSubcategory.MonkeyFace, resource = R.drawable.ic_1f649),
    // endregion

    /**
     * Symbols
     */
    // region Alphanum
    OkButton(plainName = "OkButton", unicode = "1f197", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f197),
    SosButton(plainName = "SosButton", unicode = "1f198", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f198),
    CoolButton(plainName = "CoolButton", unicode = "1f192", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f192),
    UpButton(plainName = "UpButton", unicode = "1f199", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f199),
    NewButton(plainName = "NewButton", unicode = "1f195", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f195),
    FreeButton(plainName = "FreeButton", unicode = "1f193", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f193),
    AButtonBloodType(plainName = "AButtonBloodType", unicode = "1f170", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f170),
    JapaneseDiscountButton(plainName = "JapaneseDiscountButton", unicode = "1f239", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f239),
    BButtonBloodType(plainName = "BButtonBloodType", unicode = "1f171", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f171),
    CircledM(plainName = "CircledM", unicode = "24c2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_24c2),
    OButtonBloodType(plainName = "OButtonBloodType", unicode = "1f17e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f17e),
    IdButton(plainName = "IdButton", unicode = "1f194", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f194),
    JapaneseSecretButton(plainName = "JapaneseSecretButton", unicode = "3299", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_3299),
    JapaneseCongratulationsButton(plainName = "JapaneseCongratulationsButton", unicode = "3297", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_3297),
    Information(plainName = "Information", unicode = "2139", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_2139),
    VsButton(plainName = "VsButton", unicode = "1f19a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f19a),
    PButton(plainName = "PButton", unicode = "1f17f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f17f),
    JapaneseBargainButton(plainName = "JapaneseBargainButton", unicode = "1f250", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f250),
    NgButton(plainName = "NgButton", unicode = "1f196", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f196),
    JapaneseVacancyButton(plainName = "JapaneseVacancyButton", unicode = "1f233", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f233),
    AbButtonBloodType(plainName = "AbButtonBloodType", unicode = "1f18e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f18e),
    ClButton(plainName = "ClButton", unicode = "1f191", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f191),
    JapaneseOpenForBusinessButton(plainName = "JapaneseOpenForBusinessButton", unicode = "1f23a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f23a),
    JapaneseNotFreeOfChargeButton(plainName = "JapaneseNotFreeOfChargeButton", unicode = "1f236", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f236),
    JapaneseApplicationButton(plainName = "JapaneseApplicationButton", unicode = "1f238", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f238),
    JapaneseMonthlyAmountButton(plainName = "JapaneseMonthlyAmountButton", unicode = "1f237", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f237),
    InputNumbers(plainName = "InputNumbers", unicode = "1f522", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f522),
    JapaneseProhibitedButton(plainName = "JapaneseProhibitedButton", unicode = "1f232", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f232),
    JapaneseNoVacancyButton(plainName = "JapaneseNoVacancyButton", unicode = "1f235", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f235),
    JapaneseAcceptableButton(plainName = "JapaneseAcceptableButton", unicode = "1f251", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f251),
    JapanesePassingGradeButton(plainName = "JapanesePassingGradeButton", unicode = "1f234", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f234),
    JapaneseServiceChargeButton(plainName = "JapaneseServiceChargeButton", unicode = "1f202", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f202),
    InputLatinLetters(plainName = "InputLatinLetters", unicode = "1f524", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f524),
    InputLatinUppercase(plainName = "InputLatinUppercase", unicode = "1f520", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f520),
    InputSymbols(plainName = "InputSymbols", unicode = "1f523", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f523),
    InputLatinLowercase(plainName = "InputLatinLowercase", unicode = "1f521", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f521),
    JapaneseHereButton(plainName = "JapaneseHereButton", unicode = "1f201", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f201),
    JapaneseReservedButton(plainName = "JapaneseReservedButton", unicode = "1f22f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f22f),
    JapaneseFreeOfChargeButton(plainName = "JapaneseFreeOfChargeButton", unicode = "1f21a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f21a),
    // endregion

    // region Av
    PlayButton(plainName = "PlayButton", unicode = "25b6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_25b6),
    ReverseButton(plainName = "ReverseButton", unicode = "25c0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_25c0),
    FastForwardButton(plainName = "FastForwardButton", unicode = "23e9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23e9),
    RepeatButton(plainName = "RepeatButton", unicode = "1f501", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f501),
    FastReverseButton(plainName = "FastReverseButton", unicode = "23ea", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ea),
    BrightButton(plainName = "BrightButton", unicode = "1f506", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f506),
    UpwardsButton(plainName = "UpwardsButton", unicode = "1f53c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f53c),
    MobilePhoneOff(plainName = "MobilePhoneOff", unicode = "1f4f4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f4f4),
    FastUpButton(plainName = "FastUpButton", unicode = "23eb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23eb),
    AntennaBars(plainName = "AntennaBars", unicode = "1f4f6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f4f6),
    DimButton(plainName = "DimButton", unicode = "1f505", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f505),
    FastDownButton(plainName = "FastDownButton", unicode = "23ec", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ec),
    DownwardsButton(plainName = "DownwardsButton", unicode = "1f53d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f53d),
    Cinema(plainName = "Cinema", unicode = "1f3a6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f3a6),
    RepeatSingleButton(plainName = "RepeatSingleButton", unicode = "1f502", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f502),
    VibrationMode(plainName = "VibrationMode", unicode = "1f4f3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f4f3),
    ShuffleTracksButton(plainName = "ShuffleTracksButton", unicode = "1f500", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f500),
    RecordButton(plainName = "RecordButton", unicode = "23fa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23fa),
    StopButton(plainName = "StopButton", unicode = "23f9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23f9),
    PauseButton(plainName = "PauseButton", unicode = "23f8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23f8),
    PlayOrPauseButton(plainName = "PlayOrPauseButton", unicode = "23ef", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ef),
    LastTrackButton(plainName = "LastTrackButton", unicode = "23ee", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ee),
    NextTrackButton(plainName = "NextTrackButton", unicode = "23ed", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ed),
    EjectButton(plainName = "EjectButton", unicode = "23cf", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23cf),
    // endregion

    // region Gender
    FemaleSign(plainName = "FemaleSign", unicode = "2640", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Gender, resource = R.drawable.ic_2640),
    MaleSign(plainName = "MaleSign", unicode = "2642", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Gender, resource = R.drawable.ic_2642),
    // endregion

    // region Geometric
    RedCircle(plainName = "RedCircle", unicode = "1f534", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f534),
    SmallOrangeDiamond(plainName = "SmallOrangeDiamond", unicode = "1f538", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f538),
    BlackSmallSquare(plainName = "BlackSmallSquare", unicode = "25aa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25aa),
    BlueCircle(plainName = "BlueCircle", unicode = "1f535", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f535),
    BlackCircle(plainName = "BlackCircle", unicode = "26ab", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_26ab),
    WhiteCircle(plainName = "WhiteCircle", unicode = "26aa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_26aa),
    SmallBlueDiamond(plainName = "SmallBlueDiamond", unicode = "1f539", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f539),
    RadioButton(plainName = "RadioButton", unicode = "1f518", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f518),
    RedTrianglePointedUp(plainName = "RedTrianglePointedUp", unicode = "1f53a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f53a),
    RedTrianglePointedDown(plainName = "RedTrianglePointedDown", unicode = "1f53b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f53b),
    DiamondWithADot(plainName = "DiamondWithADot", unicode = "1f4a0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f4a0),
    LargeBlueDiamond(plainName = "LargeBlueDiamond", unicode = "1f537", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f537),
    LargeOrangeDiamond(plainName = "LargeOrangeDiamond", unicode = "1f536", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f536),
    BlackSquareButton(plainName = "BlackSquareButton", unicode = "1f532", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f532),
    WhiteSquareButton(plainName = "WhiteSquareButton", unicode = "1f533", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f533),
    BlackMediumSmallSquare(plainName = "BlackMediumSmallSquare", unicode = "25fe", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fe),
    WhiteSmallSquare(plainName = "WhiteSmallSquare", unicode = "25ab", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25ab),
    BlackMediumSquare(plainName = "BlackMediumSquare", unicode = "25fc", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fc),
    WhiteLargeSquare(plainName = "WhiteLargeSquare", unicode = "2b1c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_2b1c),
    WhiteMediumSquare(plainName = "WhiteMediumSquare", unicode = "25fb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fb),
    BlackLargeSquare(plainName = "BlackLargeSquare", unicode = "2b1b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_2b1b),
    WhiteMediumSmallSquare(plainName = "WhiteMediumSmallSquare", unicode = "25fd", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fd),
    OrangeCircle(plainName = "OrangeCircle", unicode = "1f7e0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e0),
    YellowCircle(plainName = "YellowCircle", unicode = "1f7e1", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e1),
    GreenCircle(plainName = "GreenCircle", unicode = "1f7e2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e2),
    PurpleCircle(plainName = "PurpleCircle", unicode = "1f7e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e3),
    BrownCircle(plainName = "BrownCircle", unicode = "1f7e4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e4),
    RedSquare(plainName = "RedSquare", unicode = "1f7e5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e5),
    OrangeSquare(plainName = "OrangeSquare", unicode = "1f7e7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e7),
    YellowSquare(plainName = "YellowSquare", unicode = "1f7e8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e8),
    GreenSquare(plainName = "GreenSquare", unicode = "1f7e9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e9),
    BlueSquare(plainName = "BlueSquare", unicode = "1f7e6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e6),
    // endregion

    // region Keycap
    Keycap10(plainName = "Keycap10", unicode = "1f51f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f51f),
    KeycapNumber(plainName = "KeycapNumber", unicode = "23-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_23_20e3),
    Keycap0(plainName = "Keycap0", unicode = "30-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_30_20e3),
    Keycap1(plainName = "Keycap1", unicode = "31-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_31_20e3),
    Keycap2(plainName = "Keycap2", unicode = "32-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_32_20e3),
    Keycap3(plainName = "Keycap3", unicode = "33-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_33_20e3),
    Keycap4(plainName = "Keycap4", unicode = "34-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_34_20e3),
    Keycap5(plainName = "Keycap5", unicode = "35-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_35_20e3),
    Keycap6(plainName = "Keycap6", unicode = "36-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_36_20e3),
    Keycap7(plainName = "Keycap7", unicode = "37-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_37_20e3),
    Keycap8(plainName = "Keycap8", unicode = "38-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_38_20e3),
    Keycap9(plainName = "Keycap9", unicode = "39-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_39_20e3),
    // endregion

    // region Other
    RecyclingSymbol(plainName = "RecyclingSymbol", unicode = "267b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_267b),
    CheckMark(plainName = "CheckMark", unicode = "2714", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2714),
    CheckMarkButton(plainName = "CheckMarkButton", unicode = "2705", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2705),
    CheckBoxWithCheck(plainName = "CheckBoxWithCheck", unicode = "2611", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2611),
    DoubleExclamationMark(plainName = "DoubleExclamationMark", unicode = "203c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_203c),
    CrossMark(plainName = "CrossMark", unicode = "274c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_274c),
    ExclamationMark(plainName = "ExclamationMark", unicode = "2757", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2757),
    MultiplicationSign(plainName = "MultiplicationSign", unicode = "2716", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2716),
    HollowRedCircle(plainName = "HollowRedCircle", unicode = "2b55", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2b55),
    QuestionMark(plainName = "QuestionMark", unicode = "2753", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2753),
    EightSpokedAsterisk(plainName = "EightSpokedAsterisk", unicode = "2733", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2733),
    WhiteExclamationMark(plainName = "WhiteExclamationMark", unicode = "2755", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2755),
    ExclamationQuestionMark(plainName = "ExclamationQuestionMark", unicode = "2049", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2049),
    TridentEmblem(plainName = "TridentEmblem", unicode = "1f531", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_1f531),
    CurlyLoop(plainName = "CurlyLoop", unicode = "27b0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_27b0),
    WavyDash(plainName = "WavyDash", unicode = "3030", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_3030),
    EightPointedStar(plainName = "EightPointedStar", unicode = "2734", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2734),
    PlusSign(plainName = "PlusSign", unicode = "2795", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2795),
    NameBadge(plainName = "NameBadge", unicode = "1f4db", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_1f4db),
    Sparkle(plainName = "Sparkle", unicode = "2747", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2747),
    MinusSign(plainName = "MinusSign", unicode = "2796", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2796),
    PartAlternationMark(plainName = "PartAlternationMark", unicode = "303d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_303d),
    CrossMarkButton(plainName = "CrossMarkButton", unicode = "274e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_274e),
    WhiteQuestionMark(plainName = "WhiteQuestionMark", unicode = "2754", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2754),
    JapaneseSymbolForBeginner(plainName = "JapaneseSymbolForBeginner", unicode = "1f530", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_1f530),
    DoubleCurlyLoop(plainName = "DoubleCurlyLoop", unicode = "27bf", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_27bf),
    DivisionSign(plainName = "DivisionSign", unicode = "2797", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2797),
    FleurDeLis(plainName = "FleurDeLis", unicode = "269c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_269c),
    TradeMark(plainName = "TradeMark", unicode = "2122", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2122),
    MedicalSymbol(plainName = "MedicalSymbol", unicode = "2695", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2695),
    Infinity(plainName = "Infinity", unicode = "267e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_267e),
    // endregion

    // region Religion
    DottedSixPointedStar(plainName = "DottedSixPointedStar", unicode = "1f52f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f52f),
    StarOfDavid(plainName = "StarOfDavid", unicode = "2721", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_2721),
    LatinCross(plainName = "LatinCross", unicode = "271d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_271d),
    AtomSymbol(plainName = "AtomSymbol", unicode = "269b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_269b),
    WheelOfDharma(plainName = "WheelOfDharma", unicode = "2638", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_2638),
    YinYang(plainName = "YinYang", unicode = "262f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_262f),
    PeaceSymbol(plainName = "PeaceSymbol", unicode = "262e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_262e),
    StarAndCrescent(plainName = "StarAndCrescent", unicode = "262a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_262a),
    OrthodoxCross(plainName = "OrthodoxCross", unicode = "2626", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_2626),
    PlaceOfWorship(plainName = "PlaceOfWorship", unicode = "1f6d0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f6d0),
    Menorah(plainName = "Menorah", unicode = "1f54e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f54e),
    Om(plainName = "Om", unicode = "1f549", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f549),
    // endregion

    // region Transport Sign
    LitterInBinSign(plainName = "LitterInBinSign", unicode = "1f6ae", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6ae),
    LeftLuggage(plainName = "LeftLuggage", unicode = "1f6c5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c5),
    Customs(plainName = "Customs", unicode = "1f6c3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c3),
    BabySymbol(plainName = "BabySymbol", unicode = "1f6bc", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6bc),
    WomenSRoom(plainName = "WomenSRoom", unicode = "1f6ba", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6ba),
    MenSRoom(plainName = "MenSRoom", unicode = "1f6b9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6b9),
    WheelchairSymbol(plainName = "WheelchairSymbol", unicode = "267f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_267f),
    AtmSign(plainName = "AtmSign", unicode = "1f3e7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f3e7),
    WaterCloset(plainName = "WaterCloset", unicode = "1f6be", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6be),
    Restroom(plainName = "Restroom", unicode = "1f6bb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6bb),
    PotableWater(plainName = "PotableWater", unicode = "1f6b0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6b0),
    PassportControl(plainName = "PassportControl", unicode = "1f6c2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c2),
    BaggageClaim(plainName = "BaggageClaim", unicode = "1f6c4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c4),
    // endregion

    // region Warning
    NoOneUnderEighteen(plainName = "NoOneUnderEighteen", unicode = "1f51e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f51e),
    Warning(plainName = "Warning", unicode = "26a0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_26a0),
    Prohibited(plainName = "Prohibited", unicode = "1f6ab", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6ab),
    NoEntry(plainName = "NoEntry", unicode = "26d4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_26d4),
    NoMobilePhones(plainName = "NoMobilePhones", unicode = "1f4f5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f4f5),
    NoSmoking(plainName = "NoSmoking", unicode = "1f6ad", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6ad),
    NoPedestrians(plainName = "NoPedestrians", unicode = "1f6b7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b7),
    ChildrenCrossing(plainName = "ChildrenCrossing", unicode = "1f6b8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b8),
    NoLittering(plainName = "NoLittering", unicode = "1f6af", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6af),
    NonPotableWater(plainName = "NonPotableWater", unicode = "1f6b1", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b1),
    NoBicycles(plainName = "NoBicycles", unicode = "1f6b3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b3),
    Biohazard(plainName = "Biohazard", unicode = "2623", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_2623),
    Radioactive(plainName = "Radioactive", unicode = "2622", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_2622),
    // endregion

    // region Zodiac
    Cancer(plainName = "Cancer", unicode = "264b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264b),
    Aquarius(plainName = "Aquarius", unicode = "2652", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2652),
    Aries(plainName = "Aries", unicode = "2648", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2648),
    Scorpio(plainName = "Scorpio", unicode = "264f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264f),
    Sagittarius(plainName = "Sagittarius", unicode = "2650", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2650),
    Leo(plainName = "Leo", unicode = "264c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264c),
    Gemini(plainName = "Gemini", unicode = "264a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264a),
    Taurus(plainName = "Taurus", unicode = "2649", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2649),
    Pisces(plainName = "Pisces", unicode = "2653", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2653),
    Capricorn(plainName = "Capricorn", unicode = "2651", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2651),
    Libra(plainName = "Libra", unicode = "264e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264e),
    Virgo(plainName = "Virgo", unicode = "264d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264d),
    Ophiuchus(plainName = "Ophiuchus", unicode = "26ce", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_26ce),
    // endregion

}
