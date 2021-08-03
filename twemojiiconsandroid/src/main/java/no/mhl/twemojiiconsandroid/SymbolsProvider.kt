package no.mhl.twemojiiconsandroid

object SymbolsProvider {

    // region All
    fun provideSymbols(): List<TwemojiIcon> = listOf(
        provideAlphanum(),
        provideArrow(),
        provideAv(),
        provideGender(),
        provideGeometric(),
        provideKeycap(),
        provideOther(),
        provideReligion(),
        provideTransportSign(),
        provideWarning(),
        provideZodiac()
    ).flatten()
    // endregion

    // region Alphanum
    fun provideAlphanum() = listOf(
        TwemojiIcon(plainName = "OkButton", unicode = "1f197", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f197),
        TwemojiIcon(plainName = "SosButton", unicode = "1f198", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f198),
        TwemojiIcon(plainName = "CoolButton", unicode = "1f192", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f192),
        TwemojiIcon(plainName = "UpButton", unicode = "1f199", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f199),
        TwemojiIcon(plainName = "NewButton", unicode = "1f195", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f195),
        TwemojiIcon(plainName = "FreeButton", unicode = "1f193", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f193),
        TwemojiIcon(plainName = "AButtonBloodType", unicode = "1f170", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f170),
        TwemojiIcon(plainName = "JapaneseDiscountButton", unicode = "1f239", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f239),
        TwemojiIcon(plainName = "BButtonBloodType", unicode = "1f171", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f171),
        TwemojiIcon(plainName = "CircledM", unicode = "24c2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_24c2),
        TwemojiIcon(plainName = "OButtonBloodType", unicode = "1f17e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f17e),
        TwemojiIcon(plainName = "IdButton", unicode = "1f194", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f194),
        TwemojiIcon(plainName = "JapaneseSecretButton", unicode = "3299", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_3299),
        TwemojiIcon(plainName = "JapaneseCongratulationsButton", unicode = "3297", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_3297),
        TwemojiIcon(plainName = "Information", unicode = "2139", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_2139),
        TwemojiIcon(plainName = "VsButton", unicode = "1f19a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f19a),
        TwemojiIcon(plainName = "PButton", unicode = "1f17f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f17f),
        TwemojiIcon(plainName = "JapaneseBargainButton", unicode = "1f250", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f250),
        TwemojiIcon(plainName = "NgButton", unicode = "1f196", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f196),
        TwemojiIcon(plainName = "JapaneseVacancyButton", unicode = "1f233", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f233),
        TwemojiIcon(plainName = "AbButtonBloodType", unicode = "1f18e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f18e),
        TwemojiIcon(plainName = "ClButton", unicode = "1f191", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f191),
        TwemojiIcon(plainName = "JapaneseOpenForBusinessButton", unicode = "1f23a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f23a),
        TwemojiIcon(plainName = "JapaneseNotFreeOfChargeButton", unicode = "1f236", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f236),
        TwemojiIcon(plainName = "JapaneseApplicationButton", unicode = "1f238", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f238),
        TwemojiIcon(plainName = "JapaneseMonthlyAmountButton", unicode = "1f237", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f237),
        TwemojiIcon(plainName = "InputNumbers", unicode = "1f522", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f522),
        TwemojiIcon(plainName = "JapaneseProhibitedButton", unicode = "1f232", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f232),
        TwemojiIcon(plainName = "JapaneseNoVacancyButton", unicode = "1f235", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f235),
        TwemojiIcon(plainName = "JapaneseAcceptableButton", unicode = "1f251", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f251),
        TwemojiIcon(plainName = "JapanesePassingGradeButton", unicode = "1f234", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f234),
        TwemojiIcon(plainName = "JapaneseServiceChargeButton", unicode = "1f202", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f202),
        TwemojiIcon(plainName = "InputLatinLetters", unicode = "1f524", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f524),
        TwemojiIcon(plainName = "InputLatinUppercase", unicode = "1f520", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f520),
        TwemojiIcon(plainName = "InputSymbols", unicode = "1f523", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f523),
        TwemojiIcon(plainName = "InputLatinLowercase", unicode = "1f521", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f521),
        TwemojiIcon(plainName = "JapaneseHereButton", unicode = "1f201", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f201),
        TwemojiIcon(plainName = "JapaneseReservedButton", unicode = "1f22f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f22f),
        TwemojiIcon(plainName = "JapaneseFreeOfChargeButton", unicode = "1f21a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Alphanum, resource = R.drawable.ic_1f21a)
    )
    // endregion

    // region Arrow
    fun provideArrow() = listOf(
        TwemojiIcon(plainName = "LeftArrow", unicode = "2b05", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2b05),
        TwemojiIcon(plainName = "LeftArrowCurvingRight", unicode = "21aa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_21aa),
        TwemojiIcon(plainName = "RightArrowCurvingLeft", unicode = "21a9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_21a9),
        TwemojiIcon(plainName = "RightArrow", unicode = "27a1", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_27a1),
        TwemojiIcon(plainName = "TopArrow", unicode = "1f51d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f51d),
        TwemojiIcon(plainName = "DownArrow", unicode = "2b07", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2b07),
        TwemojiIcon(plainName = "BackArrow", unicode = "1f519", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f519),
        TwemojiIcon(plainName = "ClockwiseVerticalArrows", unicode = "1f503", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f503),
        TwemojiIcon(plainName = "UpArrow", unicode = "2b06", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2b06),
        TwemojiIcon(plainName = "UpRightArrow", unicode = "2197", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2197),
        TwemojiIcon(plainName = "DownRightArrow", unicode = "2198", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2198),
        TwemojiIcon(plainName = "DownLeftArrow", unicode = "2199", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2199),
        TwemojiIcon(plainName = "UpLeftArrow", unicode = "2196", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2196),
        TwemojiIcon(plainName = "SoonArrow", unicode = "1f51c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f51c),
        TwemojiIcon(plainName = "RightArrowCurvingDown", unicode = "2935", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2935),
        TwemojiIcon(plainName = "UpDownArrow", unicode = "2195", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2195),
        TwemojiIcon(plainName = "CounterclockwiseArrowsButton", unicode = "1f504", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f504),
        TwemojiIcon(plainName = "RightArrowCurvingUp", unicode = "2934", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2934),
        TwemojiIcon(plainName = "OnArrow", unicode = "1f51b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f51b),
        TwemojiIcon(plainName = "EndArrow", unicode = "1f51a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_1f51a),
        TwemojiIcon(plainName = "LeftRightArrow", unicode = "2194", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Arrow, resource = R.drawable.ic_2194),
    )
    // endregion

    // region Av
    fun provideAv() = listOf(
        TwemojiIcon(plainName = "PlayButton", unicode = "25b6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_25b6),
        TwemojiIcon(plainName = "ReverseButton", unicode = "25c0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_25c0),
        TwemojiIcon(plainName = "FastForwardButton", unicode = "23e9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23e9),
        TwemojiIcon(plainName = "RepeatButton", unicode = "1f501", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f501),
        TwemojiIcon(plainName = "FastReverseButton", unicode = "23ea", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ea),
        TwemojiIcon(plainName = "BrightButton", unicode = "1f506", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f506),
        TwemojiIcon(plainName = "UpwardsButton", unicode = "1f53c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f53c),
        TwemojiIcon(plainName = "MobilePhoneOff", unicode = "1f4f4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f4f4),
        TwemojiIcon(plainName = "FastUpButton", unicode = "23eb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23eb),
        TwemojiIcon(plainName = "AntennaBars", unicode = "1f4f6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f4f6),
        TwemojiIcon(plainName = "DimButton", unicode = "1f505", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f505),
        TwemojiIcon(plainName = "FastDownButton", unicode = "23ec", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ec),
        TwemojiIcon(plainName = "DownwardsButton", unicode = "1f53d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f53d),
        TwemojiIcon(plainName = "Cinema", unicode = "1f3a6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f3a6),
        TwemojiIcon(plainName = "RepeatSingleButton", unicode = "1f502", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f502),
        TwemojiIcon(plainName = "VibrationMode", unicode = "1f4f3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f4f3),
        TwemojiIcon(plainName = "ShuffleTracksButton", unicode = "1f500", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_1f500),
        TwemojiIcon(plainName = "RecordButton", unicode = "23fa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23fa),
        TwemojiIcon(plainName = "StopButton", unicode = "23f9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23f9),
        TwemojiIcon(plainName = "PauseButton", unicode = "23f8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23f8),
        TwemojiIcon(plainName = "PlayOrPauseButton", unicode = "23ef", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ef),
        TwemojiIcon(plainName = "LastTrackButton", unicode = "23ee", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ee),
        TwemojiIcon(plainName = "NextTrackButton", unicode = "23ed", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23ed),
        TwemojiIcon(plainName = "EjectButton", unicode = "23cf", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.AvSymbol, resource = R.drawable.ic_23cf)
    )
    // endregion

    // region Gender
    fun provideGender() = listOf(
        TwemojiIcon(plainName = "FemaleSign", unicode = "2640", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Gender, resource = R.drawable.ic_2640),
        TwemojiIcon(plainName = "MaleSign", unicode = "2642", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Gender, resource = R.drawable.ic_2642)
    )
    // endregion

    // region Geometric
    fun provideGeometric() = listOf(
        TwemojiIcon(plainName = "RedCircle", unicode = "1f534", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f534),
        TwemojiIcon(plainName = "SmallOrangeDiamond", unicode = "1f538", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f538),
        TwemojiIcon(plainName = "BlackSmallSquare", unicode = "25aa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25aa),
        TwemojiIcon(plainName = "BlueCircle", unicode = "1f535", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f535),
        TwemojiIcon(plainName = "BlackCircle", unicode = "26ab", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_26ab),
        TwemojiIcon(plainName = "WhiteCircle", unicode = "26aa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_26aa),
        TwemojiIcon(plainName = "SmallBlueDiamond", unicode = "1f539", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f539),
        TwemojiIcon(plainName = "RadioButton", unicode = "1f518", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f518),
        TwemojiIcon(plainName = "RedTrianglePointedUp", unicode = "1f53a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f53a),
        TwemojiIcon(plainName = "RedTrianglePointedDown", unicode = "1f53b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f53b),
        TwemojiIcon(plainName = "DiamondWithADot", unicode = "1f4a0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f4a0),
        TwemojiIcon(plainName = "LargeBlueDiamond", unicode = "1f537", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f537),
        TwemojiIcon(plainName = "LargeOrangeDiamond", unicode = "1f536", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f536),
        TwemojiIcon(plainName = "BlackSquareButton", unicode = "1f532", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f532),
        TwemojiIcon(plainName = "WhiteSquareButton", unicode = "1f533", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f533),
        TwemojiIcon(plainName = "BlackMediumSmallSquare", unicode = "25fe", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fe),
        TwemojiIcon(plainName = "WhiteSmallSquare", unicode = "25ab", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25ab),
        TwemojiIcon(plainName = "BlackMediumSquare", unicode = "25fc", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fc),
        TwemojiIcon(plainName = "WhiteLargeSquare", unicode = "2b1c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_2b1c),
        TwemojiIcon(plainName = "WhiteMediumSquare", unicode = "25fb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fb),
        TwemojiIcon(plainName = "BlackLargeSquare", unicode = "2b1b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_2b1b),
        TwemojiIcon(plainName = "WhiteMediumSmallSquare", unicode = "25fd", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_25fd),
        TwemojiIcon(plainName = "OrangeCircle", unicode = "1f7e0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e0),
        TwemojiIcon(plainName = "YellowCircle", unicode = "1f7e1", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e1),
        TwemojiIcon(plainName = "GreenCircle", unicode = "1f7e2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e2),
        TwemojiIcon(plainName = "PurpleCircle", unicode = "1f7e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e3),
        TwemojiIcon(plainName = "BrownCircle", unicode = "1f7e4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e4),
        TwemojiIcon(plainName = "RedSquare", unicode = "1f7e5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e5),
        TwemojiIcon(plainName = "OrangeSquare", unicode = "1f7e7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e7),
        TwemojiIcon(plainName = "YellowSquare", unicode = "1f7e8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e8),
        TwemojiIcon(plainName = "GreenSquare", unicode = "1f7e9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e9),
        TwemojiIcon(plainName = "PurpleSquare", unicode = "1f7ea", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7ea),
        TwemojiIcon(plainName = "BrownSquare", unicode = "1f7eb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7eb),
        TwemojiIcon(plainName = "BlueSquare", unicode = "1f7e6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Geometric, resource = R.drawable.ic_1f7e6)
    )
    // endregion

    // region Keycap
    fun provideKeycap() = listOf(
        TwemojiIcon(plainName = "KeycapAsterix", unicode = "2a-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_2a_20e3),
        TwemojiIcon(plainName = "Keycap10", unicode = "1f51f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f51f),
        TwemojiIcon(plainName = "KeycapNumber", unicode = "23-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_23_20e3),
        TwemojiIcon(plainName = "Keycap0", unicode = "30-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_30_20e3),
        TwemojiIcon(plainName = "Keycap1", unicode = "31-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_31_20e3),
        TwemojiIcon(plainName = "Keycap2", unicode = "32-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_32_20e3),
        TwemojiIcon(plainName = "Keycap3", unicode = "33-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_33_20e3),
        TwemojiIcon(plainName = "Keycap4", unicode = "34-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_34_20e3),
        TwemojiIcon(plainName = "Keycap5", unicode = "35-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_35_20e3),
        TwemojiIcon(plainName = "Keycap6", unicode = "36-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_36_20e3),
        TwemojiIcon(plainName = "Keycap7", unicode = "37-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_37_20e3),
        TwemojiIcon(plainName = "Keycap8", unicode = "38-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_38_20e3),
        TwemojiIcon(plainName = "Keycap9", unicode = "39-20e3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_39_20e3),
        TwemojiIcon(plainName = "KeycapA", unicode = "1f1e6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1e6),
        TwemojiIcon(plainName = "KeycapB", unicode = "1f1e7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1e7),
        TwemojiIcon(plainName = "KeycapC", unicode = "1f1e8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1e8),
        TwemojiIcon(plainName = "KeycapD", unicode = "1f1e9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1e9),
        TwemojiIcon(plainName = "KeycapE", unicode = "1f1ea", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1ea),
        TwemojiIcon(plainName = "KeycapF", unicode = "1f1eb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1eb),
        TwemojiIcon(plainName = "KeycapG", unicode = "1f1ec", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1ec),
        TwemojiIcon(plainName = "KeycapH", unicode = "1f1ed", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1ed),
        TwemojiIcon(plainName = "KeycapI", unicode = "1f1ee", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1ee),
        TwemojiIcon(plainName = "KeycapJ", unicode = "1f1ef", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1ef),
        TwemojiIcon(plainName = "KeycapK", unicode = "1f1f0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f0),
        TwemojiIcon(plainName = "KeycapL", unicode = "1f1f1", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f1),
        TwemojiIcon(plainName = "KeycapM", unicode = "1f1f2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f2),
        TwemojiIcon(plainName = "KeycapN", unicode = "1f1f3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f3),
        TwemojiIcon(plainName = "KeycapO", unicode = "1f1f4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f4),
        TwemojiIcon(plainName = "KeycapP", unicode = "1f1f5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f5),
        TwemojiIcon(plainName = "KeycapQ", unicode = "1f1f6", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f6),
        TwemojiIcon(plainName = "KeycapR", unicode = "1f1f7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f7),
        TwemojiIcon(plainName = "KeycapS", unicode = "1f1f8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f8),
        TwemojiIcon(plainName = "KeycapT", unicode = "1f1f9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1f9),
        TwemojiIcon(plainName = "KeycapU", unicode = "1f1fa", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1fa),
        TwemojiIcon(plainName = "KeycapV", unicode = "1f1fb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1fb),
        TwemojiIcon(plainName = "KeycapW", unicode = "1f1fc", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1fc),
        TwemojiIcon(plainName = "KeycapX", unicode = "1f1fd", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1fd),
        TwemojiIcon(plainName = "KeycapY", unicode = "1f1fe", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1fe),
        TwemojiIcon(plainName = "KeycapZ", unicode = "1f1ff", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Keycap, resource = R.drawable.ic_1f1ff)
    )
    // endregion

    // region Other
    fun provideOther() = listOf(
        TwemojiIcon(plainName = "RecyclingSymbol", unicode = "267b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_267b),
        TwemojiIcon(plainName = "CheckMark", unicode = "2714", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2714),
        TwemojiIcon(plainName = "CheckMarkButton", unicode = "2705", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2705),
        TwemojiIcon(plainName = "CheckBoxWithCheck", unicode = "2611", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2611),
        TwemojiIcon(plainName = "DoubleExclamationMark", unicode = "203c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_203c),
        TwemojiIcon(plainName = "CrossMark", unicode = "274c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_274c),
        TwemojiIcon(plainName = "ExclamationMark", unicode = "2757", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2757),
        TwemojiIcon(plainName = "MultiplicationSign", unicode = "2716", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2716),
        TwemojiIcon(plainName = "HollowRedCircle", unicode = "2b55", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2b55),
        TwemojiIcon(plainName = "QuestionMark", unicode = "2753", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2753),
        TwemojiIcon(plainName = "EightSpokedAsterisk", unicode = "2733", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2733),
        TwemojiIcon(plainName = "WhiteExclamationMark", unicode = "2755", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2755),
        TwemojiIcon(plainName = "ExclamationQuestionMark", unicode = "2049", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2049),
        TwemojiIcon(plainName = "TridentEmblem", unicode = "1f531", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_1f531),
        TwemojiIcon(plainName = "CurlyLoop", unicode = "27b0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_27b0),
        TwemojiIcon(plainName = "WavyDash", unicode = "3030", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_3030),
        TwemojiIcon(plainName = "EightPointedStar", unicode = "2734", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2734),
        TwemojiIcon(plainName = "PlusSign", unicode = "2795", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2795),
        TwemojiIcon(plainName = "NameBadge", unicode = "1f4db", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_1f4db),
        TwemojiIcon(plainName = "Sparkle", unicode = "2747", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2747),
        TwemojiIcon(plainName = "MinusSign", unicode = "2796", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2796),
        TwemojiIcon(plainName = "PartAlternationMark", unicode = "303d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_303d),
        TwemojiIcon(plainName = "CrossMarkButton", unicode = "274e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_274e),
        TwemojiIcon(plainName = "WhiteQuestionMark", unicode = "2754", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2754),
        TwemojiIcon(plainName = "JapaneseSymbolForBeginner", unicode = "1f530", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_1f530),
        TwemojiIcon(plainName = "DoubleCurlyLoop", unicode = "27bf", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_27bf),
        TwemojiIcon(plainName = "DivisionSign", unicode = "2797", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2797),
        TwemojiIcon(plainName = "FleurDeLis", unicode = "269c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_269c),
        TwemojiIcon(plainName = "TradeMark", unicode = "2122", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2122),
        TwemojiIcon(plainName = "Registered", unicode = "ae", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_ae),
        TwemojiIcon(plainName = "Copyright", unicode = "a9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_a9),
        TwemojiIcon(plainName = "MedicalSymbol", unicode = "2695", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_2695),
        TwemojiIcon(plainName = "TransgenderSymbol", unicode = "26a7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_26a7),
        TwemojiIcon(plainName = "Infinity", unicode = "267e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.OtherSymbol, resource = R.drawable.ic_267e)
    )
    // endregion

    // region Religion
    fun provideReligion() = listOf(
        TwemojiIcon(plainName = "DottedSixPointedStar", unicode = "1f52f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f52f),
        TwemojiIcon(plainName = "StarOfDavid", unicode = "2721", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_2721),
        TwemojiIcon(plainName = "LatinCross", unicode = "271d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_271d),
        TwemojiIcon(plainName = "AtomSymbol", unicode = "269b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_269b),
        TwemojiIcon(plainName = "WheelOfDharma", unicode = "2638", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_2638),
        TwemojiIcon(plainName = "YinYang", unicode = "262f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_262f),
        TwemojiIcon(plainName = "PeaceSymbol", unicode = "262e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_262e),
        TwemojiIcon(plainName = "StarAndCrescent", unicode = "262a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_262a),
        TwemojiIcon(plainName = "OrthodoxCross", unicode = "2626", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_2626),
        TwemojiIcon(plainName = "PlaceOfWorship", unicode = "1f6d0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f6d0),
        TwemojiIcon(plainName = "Menorah", unicode = "1f54e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f54e),
        TwemojiIcon(plainName = "Om", unicode = "1f549", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Religion, resource = R.drawable.ic_1f549)
    )
    // endregion

    // region Transport sign
    fun provideTransportSign() = listOf(
        TwemojiIcon(plainName = "LitterInBinSign", unicode = "1f6ae", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6ae),
        TwemojiIcon(plainName = "LeftLuggage", unicode = "1f6c5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c5),
        TwemojiIcon(plainName = "Customs", unicode = "1f6c3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c3),
        TwemojiIcon(plainName = "BabySymbol", unicode = "1f6bc", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6bc),
        TwemojiIcon(plainName = "WomenSRoom", unicode = "1f6ba", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6ba),
        TwemojiIcon(plainName = "MenSRoom", unicode = "1f6b9", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6b9),
        TwemojiIcon(plainName = "WheelchairSymbol", unicode = "267f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_267f),
        TwemojiIcon(plainName = "AtmSign", unicode = "1f3e7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f3e7),
        TwemojiIcon(plainName = "WaterCloset", unicode = "1f6be", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6be),
        TwemojiIcon(plainName = "Restroom", unicode = "1f6bb", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6bb),
        TwemojiIcon(plainName = "PotableWater", unicode = "1f6b0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6b0),
        TwemojiIcon(plainName = "PassportControl", unicode = "1f6c2", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c2),
        TwemojiIcon(plainName = "Elevator", unicode = "1f6d7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6d7),
        TwemojiIcon(plainName = "BaggageClaim", unicode = "1f6c4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.TransportSign, resource = R.drawable.ic_1f6c4)
    )
    // endregion

    // region Warning
    fun provideWarning() = listOf(
        TwemojiIcon(plainName = "NoOneUnderEighteen", unicode = "1f51e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f51e),
        TwemojiIcon(plainName = "Warning", unicode = "26a0", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_26a0),
        TwemojiIcon(plainName = "Prohibited", unicode = "1f6ab", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6ab),
        TwemojiIcon(plainName = "NoEntry", unicode = "26d4", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_26d4),
        TwemojiIcon(plainName = "NoMobilePhones", unicode = "1f4f5", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f4f5),
        TwemojiIcon(plainName = "NoSmoking", unicode = "1f6ad", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6ad),
        TwemojiIcon(plainName = "NoPedestrians", unicode = "1f6b7", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b7),
        TwemojiIcon(plainName = "ChildrenCrossing", unicode = "1f6b8", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b8),
        TwemojiIcon(plainName = "NoLittering", unicode = "1f6af", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6af),
        TwemojiIcon(plainName = "NonPotableWater", unicode = "1f6b1", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b1),
        TwemojiIcon(plainName = "NoBicycles", unicode = "1f6b3", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_1f6b3),
        TwemojiIcon(plainName = "Biohazard", unicode = "2623", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_2623),
        TwemojiIcon(plainName = "Radioactive", unicode = "2622", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Warning, resource = R.drawable.ic_2622)
    )
    // endregion

    // region Zodiac
    fun provideZodiac() = listOf(
        TwemojiIcon(plainName = "Cancer", unicode = "264b", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264b),
        TwemojiIcon(plainName = "Aquarius", unicode = "2652", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2652),
        TwemojiIcon(plainName = "Aries", unicode = "2648", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2648),
        TwemojiIcon(plainName = "Scorpio", unicode = "264f", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264f),
        TwemojiIcon(plainName = "Sagittarius", unicode = "2650", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2650),
        TwemojiIcon(plainName = "Leo", unicode = "264c", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264c),
        TwemojiIcon(plainName = "Gemini", unicode = "264a", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264a),
        TwemojiIcon(plainName = "Taurus", unicode = "2649", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2649),
        TwemojiIcon(plainName = "Pisces", unicode = "2653", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2653),
        TwemojiIcon(plainName = "Capricorn", unicode = "2651", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_2651),
        TwemojiIcon(plainName = "Libra", unicode = "264e", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264e),
        TwemojiIcon(plainName = "Virgo", unicode = "264d", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_264d),
        TwemojiIcon(plainName = "Ophiuchus", unicode = "26ce", category = TwemojiCategory.Symbols, subcategory = TwemojiSubcategory.Zodiac, resource = R.drawable.ic_26ce)
    )
    // endregion

}