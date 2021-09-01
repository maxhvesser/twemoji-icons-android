package no.mhl.twemojiiconsandroid.objects

import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.Subcategory
import no.mhl.twemojiiconsandroid.core.model.Font

object Objects {

    // region Clothing
    private val clothing: List<EmojiIcon> = listOf(
        EmojiIcon("Glasses", "1f453", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f453),
        EmojiIcon("Sunglasses", "1f576", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f576),
        EmojiIcon("Goggles", "1f97d", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f97d),
        EmojiIcon("LabCoat", "1f97c", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f97c),
        EmojiIcon("SafetyVest", "1f9ba", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f9ba),
        EmojiIcon("Necktie", "1f454", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f454),
        EmojiIcon("TShirt", "1f455", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f455),
        EmojiIcon("Jeans", "1f456", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f456),
        EmojiIcon("Scarf", "1f9e3", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f9e3),
        EmojiIcon("Gloves", "1f9e4", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f9e4),
        EmojiIcon("Coat", "1f9e5", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f9e5),
        EmojiIcon("Socks", "1f9e6", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f9e6),
        EmojiIcon("Dress", "1f457", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f457),
        EmojiIcon("Kimono", "1f458", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f458),
        EmojiIcon("Sari", "1f97b", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f97b),
        EmojiIcon("OnePieceSwimsuit", "1fa71", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1fa71),
        EmojiIcon("Briefs", "1fa72", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1fa72),
        EmojiIcon("Shorts", "1fa73", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1fa73),
        EmojiIcon("Bikini", "1f459", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f459),
        EmojiIcon("Woman’SClothes", "1f45a", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f45a),
        EmojiIcon("Purse", "1f45b", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f45b),
        EmojiIcon("Handbag", "1f45c", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f45c),
        EmojiIcon("ClutchBag", "1f45d", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f45d),
        EmojiIcon("ShoppingBags", "1f6cd", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f6cd),
        EmojiIcon("Backpack", "1f392", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f392),
        EmojiIcon("ThongSandal", "1fa74", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1fa74),
        EmojiIcon("Man’SShoe", "1f45e", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f45e),
        EmojiIcon("RunningShoe", "1f45f", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f45f),
        EmojiIcon("HikingBoot", "1f97e", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f97e),
        EmojiIcon("FlatShoe", "1f97f", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f97f),
        EmojiIcon("HighHeeledShoe", "1f460", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f460),
        EmojiIcon("Woman’SSandal", "1f461", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f461),
        EmojiIcon("BalletShoes", "1fa70", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1fa70),
        EmojiIcon("Woman’SBoot", "1f462", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f462),
        EmojiIcon("Crown", "1f451", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f451),
        EmojiIcon("Woman’SHat", "1f452", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f452),
        EmojiIcon("TopHat", "1f3a9", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f3a9),
        EmojiIcon("GraduationCap", "1f393", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f393),
        EmojiIcon("BilledCap", "1f9e2", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f9e2),
        EmojiIcon("MilitaryHelmet", "1fa96", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1fa96),
        EmojiIcon("RescueWorker’SHelmet", "26d1", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_26d1),
        EmojiIcon("PrayerBeads", "1f4ff", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f4ff),
        EmojiIcon("Lipstick", "1f484", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f484),
        EmojiIcon("Ring", "1f48d", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f48d),
        EmojiIcon("GemStone", "1f48e", Category.Objects, Subcategory.Clothing, Font.Twemoji, R.drawable.ic_1f48e)
    )
    // endregion

    // region Sound
    private val sound: List<EmojiIcon> = listOf(
        EmojiIcon("MutedSpeaker", "1f507", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f507),
        EmojiIcon("SpeakerLowVolume", "1f508", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f508),
        EmojiIcon("SpeakerMediumVolume", "1f509", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f509),
        EmojiIcon("SpeakerHighVolume", "1f50a", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f50a),
        EmojiIcon("Loudspeaker", "1f4e2", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f4e2),
        EmojiIcon("Megaphone", "1f4e3", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f4e3),
        EmojiIcon("PostalHorn", "1f4ef", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f4ef),
        EmojiIcon("Bell", "1f514", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f514),
        EmojiIcon("BellWithSlash", "1f515", Category.Objects, Subcategory.Sound, Font.Twemoji, R.drawable.ic_1f515)
    )
    // endregion

    // region Music
    private val music: List<EmojiIcon> = listOf(
        EmojiIcon("MusicalScore", "1f3bc", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f3bc),
        EmojiIcon("MusicalNote", "1f3b5", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f3b5),
        EmojiIcon("MusicalNotes", "1f3b6", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f3b6),
        EmojiIcon("StudioMicrophone", "1f399", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f399),
        EmojiIcon("LevelSlider", "1f39a", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f39a),
        EmojiIcon("ControlKnobs", "1f39b", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f39b),
        EmojiIcon("Microphone", "1f3a4", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f3a4),
        EmojiIcon("Headphone", "1f3a7", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f3a7),
        EmojiIcon("Radio", "1f4fb", Category.Objects, Subcategory.Music, Font.Twemoji, R.drawable.ic_1f4fb)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        clothing,
        sound,
        music
    ).flatten()
    // endregion

}