package no.mhl.twemojiiconsandroid.smileys

import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Font
import no.mhl.twemojiiconsandroid.core.model.Subcategory

object SmileysAndEmotion {

    // region All
    fun all(): List<EmojiIcon> = listOf(
        faceSmiling()
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
    fun faceAffection(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceTongue
    fun faceTongue(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceHand
    fun faceHand(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceNeutralSkeptical
    fun faceNeutralSkeptical(): List<EmojiIcon> = listOf()
    // endregion

    // region FaceSleepy
    fun faceSleepy(): List<EmojiIcon> = listOf()
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