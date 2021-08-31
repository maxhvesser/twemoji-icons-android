package no.mhl.twemojiiconsandroid.activities

import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.Subcategory
import no.mhl.twemojiiconsandroid.core.model.Font

object Activities {

    // region Event
    private val event: List<EmojiIcon> = listOf(
        EmojiIcon("JackOLantern", "1f383", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f383),
        EmojiIcon("ChristmasTree", "1f384", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f384),
        EmojiIcon("Fireworks", "1f386", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f386),
        EmojiIcon("Sparkler", "1f387", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f387),
        EmojiIcon("Firecracker", "1f9e8", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f9e8),
        EmojiIcon("Sparkles", "2728", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_2728),
        EmojiIcon("Balloon", "1f388", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f388),
        EmojiIcon("PartyPopper", "1f389", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f389),
        EmojiIcon("ConfettiBall", "1f38a", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f38a),
        EmojiIcon("TanabataTree", "1f38b", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f38b),
        EmojiIcon("PineDecoration", "1f38d", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f38d),
        EmojiIcon("JapaneseDolls", "1f38e", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f38e),
        EmojiIcon("CarpStreamer", "1f38f", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f38f),
        EmojiIcon("WindChime", "1f390", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f390),
        EmojiIcon("MoonViewingCeremony", "1f391", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f391),
        EmojiIcon("RedEnvelope", "1f9e7", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f9e7),
        EmojiIcon("Ribbon", "1f380", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f380),
        EmojiIcon("WrappedGift", "1f381", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f381),
        EmojiIcon("ReminderRibbon", "1f397", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f397),
        EmojiIcon("AdmissionTickets", "1f39f", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f39f),
        EmojiIcon("Ticket", "1f3ab", Category.Activities, Subcategory.Event, Font.Twemoji, R.drawable.ic_1f3ab)
    )
    // endregion

    // region Award medal
    private val awardMedal: List<EmojiIcon> = listOf(
        EmojiIcon("MilitaryMedal", "1f396", Category.Activities, Subcategory.AwardMedal, Font.Twemoji, R.drawable.ic_1f396),
        EmojiIcon("Trophy", "1f3c6", Category.Activities, Subcategory.AwardMedal, Font.Twemoji, R.drawable.ic_1f3c6),
        EmojiIcon("SportsMedal", "1f3c5", Category.Activities, Subcategory.AwardMedal, Font.Twemoji, R.drawable.ic_1f3c5),
        EmojiIcon("FirstPlaceMedal", "1f947", Category.Activities, Subcategory.AwardMedal, Font.Twemoji, R.drawable.ic_1f947),
        EmojiIcon("SecondPlaceMedal", "1f948", Category.Activities, Subcategory.AwardMedal, Font.Twemoji, R.drawable.ic_1f948),
        EmojiIcon("ThirdPlaceMedal", "1f949", Category.Activities, Subcategory.AwardMedal, Font.Twemoji, R.drawable.ic_1f949)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        event,
        awardMedal
    ).flatten()
    // endregion

}