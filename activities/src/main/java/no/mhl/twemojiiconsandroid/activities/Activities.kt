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

    // region Sport
    private val sport: List<EmojiIcon> = listOf(
        EmojiIcon("SoccerBall", "26bd", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_26bd),
        EmojiIcon("Baseball", "26be", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_26be),
        EmojiIcon("Softball", "1f94e", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f94e),
        EmojiIcon("Basketball", "1f3c0", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3c0),
        EmojiIcon("Volleyball", "1f3d0", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3d0),
        EmojiIcon("AmericanFootball", "1f3c8", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3c8),
        EmojiIcon("RugbyFootball", "1f3c9", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3c9),
        EmojiIcon("Tennis", "1f3be", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3be),
        EmojiIcon("FlyingDisc", "1f94f", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f94f),
        EmojiIcon("Bowling", "1f3b3", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3b3),
        EmojiIcon("CricketGame", "1f3cf", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3cf),
        EmojiIcon("FieldHockey", "1f3d1", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3d1),
        EmojiIcon("IceHockey", "1f3d2", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3d2),
        EmojiIcon("Lacrosse", "1f94d", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f94d),
        EmojiIcon("PingPong", "1f3d3", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3d3),
        EmojiIcon("Badminton", "1f3f8", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3f8),
        EmojiIcon("BoxingGlove", "1f94a", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f94a),
        EmojiIcon("MartialArtsUniform", "1f94b", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f94b),
        EmojiIcon("GoalNet", "1f945", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f945),
        EmojiIcon("FlagInHole", "26f3", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_26f3),
        EmojiIcon("IceSkate", "26f8", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_26f8),
        EmojiIcon("FishingPole", "1f3a3", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3a3),
        EmojiIcon("DivingMask", "1f93f", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f93f),
        EmojiIcon("RunningShirt", "1f3bd", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3bd),
        EmojiIcon("Skis", "1f3bf", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f3bf),
        EmojiIcon("Sled", "1f6f7", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f6f7),
        EmojiIcon("CurlingStone", "1f94c", Category.Activities, Subcategory.Sport, Font.Twemoji, R.drawable.ic_1f94c)
    )
    // endregion

    // region Game
    private val game: List<EmojiIcon> = listOf(
        EmojiIcon("Bullseye", "1f3af", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f3af),
        EmojiIcon("YoYo", "1fa80", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1fa80),
        EmojiIcon("Kite", "1fa81", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1fa81),
        EmojiIcon("PoolBall", "1f3b1", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f3b1),
        EmojiIcon("CrystalBall", "1f52e", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f52e),
        EmojiIcon("MagicWand", "1fa84", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1fa84),
        EmojiIcon("NazarAmulet", "1f9ff", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f9ff),
        EmojiIcon("VideoGame", "1f3ae", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f3ae),
        EmojiIcon("Joystick", "1f579", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f579),
        EmojiIcon("SlotMachine", "1f3b0", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f3b0),
        EmojiIcon("GameDie", "1f3b2", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f3b2),
        EmojiIcon("PuzzlePiece", "1f9e9", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f9e9),
        EmojiIcon("TeddyBear", "1f9f8", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f9f8),
        EmojiIcon("Piñata", "1fa85", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1fa85),
        EmojiIcon("NestingDolls", "1fa86", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1fa86),
        EmojiIcon("SpadeSuit", "2660", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_2660),
        EmojiIcon("HeartSuit", "2665", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_2665),
        EmojiIcon("DiamondSuit", "2666", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_2666),
        EmojiIcon("ClubSuit", "2663", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_2663),
        EmojiIcon("ChessPawn", "265f", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_265f),
        EmojiIcon("Joker", "1f0cf", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f0cf),
        EmojiIcon("MahjongRedDragon", "1f004", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f004),
        EmojiIcon("FlowerPlayingCards", "1f3b4", Category.Activities, Subcategory.Game, Font.Twemoji, R.drawable.ic_1f3b4)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        event,
        awardMedal,
        sport,
        game
    ).flatten()
    // endregion

}