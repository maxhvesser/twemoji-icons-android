package no.mhl.twemojiiconsandroid

object ActivitiesProvider {

    // region All
    fun provideActivities(): List<TwemojiIcon> = listOf(
        provideArtsAndCrafts(),
        provideAwardMedals(),
        provideEvents(),
        provideGames(),
        provideSports()
    ).flatten()
    // endregion

    // region Arts and crafts
    fun provideArtsAndCrafts() = listOf(
        TwemojiIcon(plainName = "ArtistPalette", unicode = "1f3a8", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.ArtsAndCrafts, resource = R.drawable.ic_1f3a8),
        TwemojiIcon(plainName = "PerformingArts", unicode = "1f3ad", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.ArtsAndCrafts, resource = R.drawable.ic_1f3ad),
        TwemojiIcon(plainName = "FramedPicture", unicode = "1f5bc", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.ArtsAndCrafts, resource = R.drawable.ic_1f5bc),
        TwemojiIcon(plainName = "Thread", unicode = "1f9f5", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.ArtsAndCrafts, resource = R.drawable.ic_1f9f5),
        TwemojiIcon(plainName = "Yarn", unicode = "1f9f6", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.ArtsAndCrafts, resource = R.drawable.ic_1f9f6)
    )
    // endregion

    // region Award medals
    fun provideAwardMedals() = listOf(
        TwemojiIcon(plainName = "Trophy", unicode = "1f3c6", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.AwardMedal, resource = R.drawable.ic_1f3c6),
        TwemojiIcon(plainName = "SportsMedal", unicode = "1f3c5", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.AwardMedal, resource = R.drawable.ic_1f3c5),
        TwemojiIcon(plainName = "MilitaryMedal", unicode = "1f396", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.AwardMedal, resource = R.drawable.ic_1f396),
        TwemojiIcon(plainName = "FirstPlaceMedal", unicode = "1f947", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.AwardMedal, resource = R.drawable.ic_1f947),
        TwemojiIcon(plainName = "SecondPlaceMedal", unicode = "1f948", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.AwardMedal, resource = R.drawable.ic_1f948),
        TwemojiIcon(plainName = "ThirdPlaceMedal", unicode = "1f949", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.AwardMedal, resource = R.drawable.ic_1f949)
    )
    // endregion

    // region Events
    fun provideEvents() = listOf(
        TwemojiIcon(plainName = "Sparkles", unicode = "2728", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_2728),
        TwemojiIcon(plainName = "PartyPopper", unicode = "1f389", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f389),
        TwemojiIcon(plainName = "Balloon", unicode = "1f388", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f388),
        TwemojiIcon(plainName = "Ribbon", unicode = "1f380", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f380),
        TwemojiIcon(plainName = "WrappedGift", unicode = "1f381", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f381),
        TwemojiIcon(plainName = "ChristmasTree", unicode = "1f384", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f384),
        TwemojiIcon(plainName = "ConfettiBall", unicode = "1f38a", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f38a),
        TwemojiIcon(plainName = "JackOLantern", unicode = "1f383", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f383),
        TwemojiIcon(plainName = "Fireworks", unicode = "1f386", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f386),
        TwemojiIcon(plainName = "WindChime", unicode = "1f390", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f390),
        TwemojiIcon(plainName = "Sparkler", unicode = "1f387", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f387),
        TwemojiIcon(plainName = "JapaneseDolls", unicode = "1f38e", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f38e),
        TwemojiIcon(plainName = "TanabataTree", unicode = "1f38b", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f38b),
        TwemojiIcon(plainName = "PineDecoration", unicode = "1f38d", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f38d),
        TwemojiIcon(plainName = "Ticket", unicode = "1f3ab", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f3ab),
        TwemojiIcon(plainName = "CarpStreamer", unicode = "1f38f", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f38f),
        TwemojiIcon(plainName = "MoonViewingCeremony", unicode = "1f391", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f391),
        TwemojiIcon(plainName = "AdmissionTickets", unicode = "1f39f", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f39f),
        TwemojiIcon(plainName = "ReminderRibbon", unicode = "1f397", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f397),
        TwemojiIcon(plainName = "Firecracker", unicode = "1f9e8", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f9e8),
        TwemojiIcon(plainName = "RedEnvelope", unicode = "1f9e7", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Event, resource = R.drawable.ic_1f9e7)
    )
    // endregion

    // region Games
    fun provideGames() = listOf(
        TwemojiIcon(plainName = "CrystalBall", unicode = "1f52e", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f52e),
        TwemojiIcon(plainName = "VideoGame", unicode = "1f3ae", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f3ae),
        TwemojiIcon(plainName = "DirectHit", unicode = "1f3af", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f3af),
        TwemojiIcon(plainName = "GameDie", unicode = "1f3b2", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f3b2),
        TwemojiIcon(plainName = "Pool8Ball", unicode = "1f3b1", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f3b1),
        TwemojiIcon(plainName = "Joker", unicode = "1f0cf", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f0cf),
        TwemojiIcon(plainName = "SlotMachine", unicode = "1f3b0", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f3b0),
        TwemojiIcon(plainName = "FlowerPlayingCards", unicode = "1f3b4", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f3b4),
        TwemojiIcon(plainName = "MahjongRedDragon", unicode = "1f004", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f004),
        TwemojiIcon(plainName = "Joystick", unicode = "1f579", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f579),
        TwemojiIcon(plainName = "SpadeSuit", unicode = "2660", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_2660),
        TwemojiIcon(plainName = "HeartSuit", unicode = "2665", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_2665),
        TwemojiIcon(plainName = "DiamondSuit", unicode = "2666", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_2666),
        TwemojiIcon(plainName = "ClubSuit", unicode = "2663", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_2663),
        TwemojiIcon(plainName = "YoYo", unicode = "1fa80", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1fa80),
        TwemojiIcon(plainName = "Kite", unicode = "1fa81", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1fa81),
        TwemojiIcon(plainName = "NazarAmulet", unicode = "1f9ff", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f9ff),
        TwemojiIcon(plainName = "PuzzlePiece", unicode = "1f9e9", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f9e9),
        TwemojiIcon(plainName = "TeddyBear", unicode = "1f9f8", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_1f9f8),
        TwemojiIcon(plainName = "ChessPawn", unicode = "265f", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Game, resource = R.drawable.ic_265f)
    )
    // endregion

    // region Sports
    fun provideSports() = listOf(
        TwemojiIcon(plainName = "SoccerBall", unicode = "26bd", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_26bd),
        TwemojiIcon(plainName = "Basketball", unicode = "1f3c0", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3c0),
        TwemojiIcon(plainName = "AmericanFootball", unicode = "1f3c8", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3c8),
        TwemojiIcon(plainName = "Tennis", unicode = "1f3be", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3be),
        TwemojiIcon(plainName = "FlagInHole", unicode = "26f3", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_26f3),
        TwemojiIcon(plainName = "FishingPole", unicode = "1f3a3", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3a3),
        TwemojiIcon(plainName = "Bowling", unicode = "1f3b3", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3b3),
        TwemojiIcon(plainName = "RugbyFootball", unicode = "1f3c9", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3c9),
        TwemojiIcon(plainName = "Skis", unicode = "1f3bf", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3bf),
        TwemojiIcon(plainName = "RunningShirt", unicode = "1f3bd", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3bd),
        TwemojiIcon(plainName = "Badminton", unicode = "1f3f8", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3f8),
        TwemojiIcon(plainName = "PingPong", unicode = "1f3d3", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3d3),
        TwemojiIcon(plainName = "IceHockey", unicode = "1f3d2", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3d2),
        TwemojiIcon(plainName = "FieldHockey", unicode = "1f3d1", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3d1),
        TwemojiIcon(plainName = "Volleyball", unicode = "1f3d0", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3d0),
        TwemojiIcon(plainName = "CricketGame", unicode = "1f3cf", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f3cf),
        TwemojiIcon(plainName = "IceSkate", unicode = "26f8", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_26f8),
        TwemojiIcon(plainName = "Baseball", unicode = "26be", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_26be),
        TwemojiIcon(plainName = "Softball", unicode = "1f94e", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f94e),
        TwemojiIcon(plainName = "FlyingDisc", unicode = "1f94f", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f94f),
        TwemojiIcon(plainName = "Lacrosse", unicode = "1f94d", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f94d),
        TwemojiIcon(plainName = "BoxingGlove", unicode = "1f94a", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f94a),
        TwemojiIcon(plainName = "MartialArtsUniform", unicode = "1f94b", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f94b),
        TwemojiIcon(plainName = "GoalNet", unicode = "1f945", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f945),
        TwemojiIcon(plainName = "DivingMask", unicode = "1f93f", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f93f),
        TwemojiIcon(plainName = "Sled", unicode = "1f6f7", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f6f7),
        TwemojiIcon(plainName = "CurlingStone", unicode = "1f94c", category = TwemojiCategory.Activities, subcategory = TwemojiSubcategory.Sport, resource = R.drawable.ic_1f94c)
    )
    // endregion

}