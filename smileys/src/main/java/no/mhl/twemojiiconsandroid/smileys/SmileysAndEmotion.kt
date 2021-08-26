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
        faceSleepy()
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
    fun faceUnwell(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceHat
    fun faceHat(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceGlasses
    fun faceGlasses(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceConcerned
    fun faceConcerned(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceNegative
    fun faceNegative(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceCostume
    fun faceCostume(): List<EmojiIcon> = listOf()
    // endregion

    // region CatFace
    fun catFace(): List<EmojiIcon> = listOf()
    // endregion

    // region MonkeyFace
    fun monkeyFace(): List<EmojiIcon> = listOf()
    // endregion

    // region Emotion
    fun emotion(): List<EmojiIcon> = listOf()
    // endregion

}