package no.mhl.twemojiiconsandroid

object TravelAndPlacesProvider {

    // region All
    fun provideTravelAndPlaces(): List<TwemojiIcon> = listOf(
        provideHotel(),
        providePlaceBuilding(),
        providePlaceGeographic(),
        providePlaceMap(),
        providePlaceReligious(),
        provideSkyAndWeather(),
        provideTime(),
        provideTransportAir(),
        provideTransportGround(),
        provideTransportWater()
    ).flatten()
    // endregion

    // region Hotel
    fun provideHotel() = listOf(
        TwemojiIcon(plainName = "BellhopBell", unicode = "1f6ce", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Hotel, resource = R.drawable.ic_1f6ce),
        TwemojiIcon(plainName = "Luggage", unicode = "1f9f3", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Hotel, resource = R.drawable.ic_1f9f3)
    )
    // endregion

    // region Place building
    fun providePlaceBuilding() = listOf(
        TwemojiIcon(plainName = "HouseWithGarden", unicode = "1f3e1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e1),
        TwemojiIcon(plainName = "House", unicode = "1f3e0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e0),
        TwemojiIcon(plainName = "Wedding", unicode = "1f492", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f492),
        TwemojiIcon(plainName = "ConvenienceStore", unicode = "1f3ea", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3ea),
        TwemojiIcon(plainName = "StatueOfLiberty", unicode = "1f5fd", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f5fd),
        TwemojiIcon(plainName = "Hospital", unicode = "1f3e5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e5),
        TwemojiIcon(plainName = "OfficeBuilding", unicode = "1f3e2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e2),
        TwemojiIcon(plainName = "LoveHotel", unicode = "1f3e9", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e9),
        TwemojiIcon(plainName = "School", unicode = "1f3eb", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3eb),
        TwemojiIcon(plainName = "TokyoTower", unicode = "1f5fc", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f5fc),
        TwemojiIcon(plainName = "Castle", unicode = "1f3f0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3f0),
        TwemojiIcon(plainName = "PostOffice", unicode = "1f3e4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e4),
        TwemojiIcon(plainName = "DepartmentStore", unicode = "1f3ec", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3ec),
        TwemojiIcon(plainName = "Hotel", unicode = "1f3e8", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e8),
        TwemojiIcon(plainName = "Bank", unicode = "1f3e6", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e6),
        TwemojiIcon(plainName = "JapaneseCastle", unicode = "1f3ef", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3ef),
        TwemojiIcon(plainName = "JapanesePostOffice", unicode = "1f3e3", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3e3),
        TwemojiIcon(plainName = "Factory", unicode = "1f3ed", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3ed),
        TwemojiIcon(plainName = "Stadium", unicode = "1f3df", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3df),
        TwemojiIcon(plainName = "ClassicalBuilding", unicode = "1f3db", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3db),
        TwemojiIcon(plainName = "DerelictHouse", unicode = "1f3da", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3da),
        TwemojiIcon(plainName = "Houses", unicode = "1f3d8", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3d8),
        TwemojiIcon(plainName = "BuildingConstruction", unicode = "1f3d7", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f3d7),
        TwemojiIcon(plainName = "Brick", unicode = "1f9f1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceBuilding, resource = R.drawable.ic_1f9f1)
    )
    // endregion

    // region Place geographic
    fun providePlaceGeographic() = listOf(
        TwemojiIcon(plainName = "Volcano", unicode = "1f30b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f30b),
        TwemojiIcon(plainName = "MountFuji", unicode = "1f5fb", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f5fb),
        TwemojiIcon(plainName = "NationalPark", unicode = "1f3de", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f3de),
        TwemojiIcon(plainName = "DesertIsland", unicode = "1f3dd", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f3dd),
        TwemojiIcon(plainName = "Desert", unicode = "1f3dc", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f3dc),
        TwemojiIcon(plainName = "BeachWithUmbrella", unicode = "1f3d6", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f3d6),
        TwemojiIcon(plainName = "Camping", unicode = "1f3d5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f3d5),
        TwemojiIcon(plainName = "SnowCappedMountain", unicode = "1f3d4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_1f3d4),
        TwemojiIcon(plainName = "Mountain", unicode = "26f0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceGeographic, resource = R.drawable.ic_26f0)
    )
    // endregion

    // region Place map
    fun providePlaceMap() = listOf(
        TwemojiIcon(plainName = "GlobeShowingEuropeAfrica", unicode = "1f30d", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f30d),
        TwemojiIcon(plainName = "GlobeShowingAmericas", unicode = "1f30e", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f30e),
        TwemojiIcon(plainName = "GlobeShowingAsiaAustralia", unicode = "1f30f", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f30f),
        TwemojiIcon(plainName = "GlobeWithMeridians", unicode = "1f310", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f310),
        TwemojiIcon(plainName = "MapOfJapan", unicode = "1f5fe", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f5fe),
        TwemojiIcon(plainName = "WorldMap", unicode = "1f5fa", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f5fa),
        TwemojiIcon(plainName = "Compass", unicode = "1f9ed", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceMap, resource = R.drawable.ic_1f9ed)
    )
    // endregion

    // region Place other
    fun providePlaceOther() = listOf(
        TwemojiIcon(plainName = "HotSprings", unicode = "2668", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_2668),
        TwemojiIcon(plainName = "Sunrise", unicode = "1f305", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f305),
        TwemojiIcon(plainName = "NightWithStars", unicode = "1f303", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f303),
        TwemojiIcon(plainName = "SunriseOverMountains", unicode = "1f304", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f304),
        TwemojiIcon(plainName = "Sunset", unicode = "1f307", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f307),
        TwemojiIcon(plainName = "CityscapeAtDusk", unicode = "1f306", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f306),
        TwemojiIcon(plainName = "FerrisWheel", unicode = "1f3a1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f3a1),
        TwemojiIcon(plainName = "BarberPole", unicode = "1f488", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f488),
        TwemojiIcon(plainName = "RollerCoaster", unicode = "1f3a2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f3a2),
        TwemojiIcon(plainName = "BridgeAtNight", unicode = "1f309", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f309),
        TwemojiIcon(plainName = "Tent", unicode = "26fa", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_26fa),
        TwemojiIcon(plainName = "CircusTent", unicode = "1f3aa", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f3aa),
        TwemojiIcon(plainName = "Foggy", unicode = "1f301", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f301),
        TwemojiIcon(plainName = "CarouselHorse", unicode = "1f3a0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f3a0),
        TwemojiIcon(plainName = "Fountain", unicode = "26f2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_26f2),
        TwemojiIcon(plainName = "Cityscape", unicode = "1f3d9", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceOther, resource = R.drawable.ic_1f3d9)
    )
    // endregion

    // region Place religious
    fun providePlaceReligious() = listOf(
        TwemojiIcon(plainName = "Church", unicode = "26ea", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceReligious, resource = R.drawable.ic_26ea),
        TwemojiIcon(plainName = "Synagogue", unicode = "1f54d", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceReligious, resource = R.drawable.ic_1f54d),
        TwemojiIcon(plainName = "Mosque", unicode = "1f54c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceReligious, resource = R.drawable.ic_1f54c),
        TwemojiIcon(plainName = "Kaaba", unicode = "1f54b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceReligious, resource = R.drawable.ic_1f54b),
        TwemojiIcon(plainName = "ShintoShrine", unicode = "2.6e+10", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceReligious, resource = R.drawable.ic_26e9),
        TwemojiIcon(plainName = "HinduTemple", unicode = "1f6d5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.PlaceReligious, resource = R.drawable.ic_1f6d5)
    )
    // endregion

    // region Sky and weather
    fun provideSkyAndWeather() = listOf(
        TwemojiIcon(plainName = "Fire", unicode = "1f525", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f525),
        TwemojiIcon(plainName = "Sun", unicode = "2600", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2600),
        TwemojiIcon(plainName = "NewMoonFace", unicode = "1f31a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f31a),
        TwemojiIcon(plainName = "GlowingStar", unicode = "1f31f", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f31f),
        TwemojiIcon(plainName = "SunWithFace", unicode = "1f31e", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f31e),
        TwemojiIcon(plainName = "Star", unicode = "2b50", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2b50),
        TwemojiIcon(plainName = "Cloud", unicode = "2601", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2601),
        TwemojiIcon(plainName = "Snowflake", unicode = "2744", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2744),
        TwemojiIcon(plainName = "Rainbow", unicode = "1f308", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f308),
        TwemojiIcon(plainName = "CrescentMoon", unicode = "1f319", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f319),
        TwemojiIcon(plainName = "HighVoltage", unicode = "26a1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_26a1),
        TwemojiIcon(plainName = "FullMoonFace", unicode = "1f31d", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f31d),
        TwemojiIcon(plainName = "WaterWave", unicode = "1f30a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f30a),
        TwemojiIcon(plainName = "Cyclone", unicode = "1f300", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f300),
        TwemojiIcon(plainName = "UmbrellaWithRainDrops", unicode = "2614", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2614),
        TwemojiIcon(plainName = "SnowmanWithoutSnow", unicode = "26c4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_26c4),
        TwemojiIcon(plainName = "SunBehindCloud", unicode = "26c5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_26c5),
        TwemojiIcon(plainName = "MilkyWay", unicode = "1f30c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f30c),
        TwemojiIcon(plainName = "ShootingStar", unicode = "1f320", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f320),
        TwemojiIcon(plainName = "Droplet", unicode = "1f4a7", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f4a7),
        TwemojiIcon(plainName = "FirstQuarterMoonFace", unicode = "1f31b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f31b),
        TwemojiIcon(plainName = "NewMoon", unicode = "1f311", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f311),
        TwemojiIcon(plainName = "LastQuarterMoonFace", unicode = "1f31c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f31c),
        TwemojiIcon(plainName = "FullMoon", unicode = "1f315", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f315),
        TwemojiIcon(plainName = "WaxingCrescentMoon", unicode = "1f312", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f312),
        TwemojiIcon(plainName = "FirstQuarterMoon", unicode = "1f313", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f313),
        TwemojiIcon(plainName = "WaxingGibbousMoon", unicode = "1f314", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f314),
        TwemojiIcon(plainName = "WaningCrescentMoon", unicode = "1f318", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f318),
        TwemojiIcon(plainName = "LastQuarterMoon", unicode = "1f317", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f317),
        TwemojiIcon(plainName = "WaningGibbousMoon", unicode = "1f316", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f316),
        TwemojiIcon(plainName = "ClosedUmbrella", unicode = "1f302", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f302),
        TwemojiIcon(plainName = "Thermometer", unicode = "1f321", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f321),
        TwemojiIcon(plainName = "Comet", unicode = "2604", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2604),
        TwemojiIcon(plainName = "WindFace", unicode = "1f32c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f32c),
        TwemojiIcon(plainName = "Fog", unicode = "1f32b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f32b),
        TwemojiIcon(plainName = "Tornado", unicode = "1f32a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f32a),
        TwemojiIcon(plainName = "CloudWithLightning", unicode = "1f329", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f329),
        TwemojiIcon(plainName = "CloudWithSnow", unicode = "1f328", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f328),
        TwemojiIcon(plainName = "CloudWithRain", unicode = "1f327", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f327),
        TwemojiIcon(plainName = "SunBehindRainCloud", unicode = "1f326", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f326),
        TwemojiIcon(plainName = "SunBehindLargeCloud", unicode = "1f325", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f325),
        TwemojiIcon(plainName = "SunBehindSmallCloud", unicode = "1f324", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1f324),
        TwemojiIcon(plainName = "UmbrellaOnGround", unicode = "26f1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_26f1),
        TwemojiIcon(plainName = "CloudWithLightningAndRain", unicode = "26c8", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_26c8),
        TwemojiIcon(plainName = "RingedPlanet", unicode = "1fa90", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_1fa90),
        TwemojiIcon(plainName = "Umbrella", unicode = "2602", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2602),
        TwemojiIcon(plainName = "Snowman", unicode = "2603", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.SkyAndWeather, resource = R.drawable.ic_2603)
    )
    // endregion

    // region Time
    fun provideTime() = listOf(
        TwemojiIcon(plainName = "Watch", unicode = "231a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_231a),
        TwemojiIcon(plainName = "AlarmClock", unicode = "23f0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_23f0),
        TwemojiIcon(plainName = "HourglassNotDone", unicode = "23f3", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_23f3),
        TwemojiIcon(plainName = "SixOClock", unicode = "1f555", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f555),
        TwemojiIcon(plainName = "HourglassDone", unicode = "231b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_231b),
        TwemojiIcon(plainName = "ElevenThirty", unicode = "1f566", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f566),
        TwemojiIcon(plainName = "TwelveOClock", unicode = "1f55b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f55b),
        TwemojiIcon(plainName = "ThreeOClock", unicode = "1f552", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f552),
        TwemojiIcon(plainName = "OneOClock", unicode = "1f550", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f550),
        TwemojiIcon(plainName = "TwoOClock", unicode = "1f551", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f551),
        TwemojiIcon(plainName = "FourOClock", unicode = "1f553", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f553),
        TwemojiIcon(plainName = "FiveOClock", unicode = "1f554", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f554),
        TwemojiIcon(plainName = "TenOClock", unicode = "1f559", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f559),
        TwemojiIcon(plainName = "NineOClock", unicode = "1f558", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f558),
        TwemojiIcon(plainName = "EightOClock", unicode = "1f557", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f557),
        TwemojiIcon(plainName = "ElevenOClock", unicode = "1f55a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f55a),
        TwemojiIcon(plainName = "SevenOClock", unicode = "1f556", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f556),
        TwemojiIcon(plainName = "OneThirty", unicode = "1f55c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f55c),
        TwemojiIcon(plainName = "NineThirty", unicode = "1f564", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f564),
        TwemojiIcon(plainName = "TwoThirty", unicode = "1f55d", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f55d),
        TwemojiIcon(plainName = "TwelveThirty", unicode = "1f567", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f567),
        TwemojiIcon(plainName = "TenThirty", unicode = "1f565", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f565),
        TwemojiIcon(plainName = "FourThirty", unicode = "1f55f", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f55f),
        TwemojiIcon(plainName = "ThreeThirty", unicode = "1f55e", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f55e),
        TwemojiIcon(plainName = "SevenThirty", unicode = "1f562", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f562),
        TwemojiIcon(plainName = "FiveThirty", unicode = "1f560", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f560),
        TwemojiIcon(plainName = "EightThirty", unicode = "1f563", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f563),
        TwemojiIcon(plainName = "SixThirty", unicode = "1f561", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f561),
        TwemojiIcon(plainName = "MantelpieceClock", unicode = "1f570", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_1f570),
        TwemojiIcon(plainName = "TimerClock", unicode = "23f2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_23f2),
        TwemojiIcon(plainName = "Stopwatch", unicode = "23f1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.Time, resource = R.drawable.ic_23f1)
    )
    // endregion

    // region Transport air
    fun provideTransportAir() = listOf(
        TwemojiIcon(plainName = "Airplane", unicode = "2708", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_2708),
        TwemojiIcon(plainName = "Rocket", unicode = "1f680", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f680),
        TwemojiIcon(plainName = "Seat", unicode = "1f4ba", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f4ba),
        TwemojiIcon(plainName = "Helicopter", unicode = "1f681", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f681),
        TwemojiIcon(plainName = "AerialTramway", unicode = "1f6a1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6a1),
        TwemojiIcon(plainName = "MountainCableway", unicode = "1f6a0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6a0),
        TwemojiIcon(plainName = "SuspensionRailway", unicode = "1f69f", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f69f),
        TwemojiIcon(plainName = "Satellite", unicode = "1f6f0", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6f0),
        TwemojiIcon(plainName = "AirplaneArrival", unicode = "1f6ec", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6ec),
        TwemojiIcon(plainName = "AirplaneDeparture", unicode = "1f6eb", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6eb),
        TwemojiIcon(plainName = "SmallAirplane", unicode = "1f6e9", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6e9),
        TwemojiIcon(plainName = "Parachute", unicode = "1fa82", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1fa82),
        TwemojiIcon(plainName = "FlyingSaucer", unicode = "1f6f8", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportAir, resource = R.drawable.ic_1f6f8)
    )
    // endregion

    // region Transport ground
    fun provideTransportGround() = listOf(
        TwemojiIcon(plainName = "PoliceCarLight", unicode = "1f6a8", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6a8),
        TwemojiIcon(plainName = "Automobile", unicode = "1f697", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f697),
        TwemojiIcon(plainName = "VerticalTrafficLight", unicode = "1f6a6", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6a6),
        TwemojiIcon(plainName = "OncomingAutomobile", unicode = "1f698", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f698),
        TwemojiIcon(plainName = "FuelPump", unicode = "26fd", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_26fd),
        TwemojiIcon(plainName = "SportUtilityVehicle", unicode = "1f699", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f699),
        TwemojiIcon(plainName = "Bicycle", unicode = "1f6b2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6b2),
        TwemojiIcon(plainName = "Bus", unicode = "1f68c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f68c),
        TwemojiIcon(plainName = "Locomotive", unicode = "1f682", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f682),
        TwemojiIcon(plainName = "OncomingPoliceCar", unicode = "1f694", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f694),
        TwemojiIcon(plainName = "FireEngine", unicode = "1f692", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f692),
        TwemojiIcon(plainName = "PoliceCar", unicode = "1f693", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f693),
        TwemojiIcon(plainName = "OncomingTaxi", unicode = "1f696", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f696),
        TwemojiIcon(plainName = "Ambulance", unicode = "1f691", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f691),
        TwemojiIcon(plainName = "Taxi", unicode = "1f695", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f695),
        TwemojiIcon(plainName = "OncomingBus", unicode = "1f68d", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f68d),
        TwemojiIcon(plainName = "Construction", unicode = "1f6a7", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6a7),
        TwemojiIcon(plainName = "DeliveryTruck", unicode = "1f69a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f69a),
        TwemojiIcon(plainName = "RailwayCar", unicode = "1f683", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f683),
        TwemojiIcon(plainName = "HighSpeedTrain", unicode = "1f684", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f684),
        TwemojiIcon(plainName = "Tractor", unicode = "1f69c", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f69c),
        TwemojiIcon(plainName = "Metro", unicode = "1f687", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f687),
        TwemojiIcon(plainName = "Station", unicode = "1f689", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f689),
        TwemojiIcon(plainName = "ArticulatedLorry", unicode = "1f69b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f69b),
        TwemojiIcon(plainName = "BulletTrain", unicode = "1f685", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f685),
        TwemojiIcon(plainName = "Minibus", unicode = "1f690", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f690),
        TwemojiIcon(plainName = "Tram", unicode = "1f68a", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f68a),
        TwemojiIcon(plainName = "HorizontalTrafficLight", unicode = "1f6a5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6a5),
        TwemojiIcon(plainName = "TramCar", unicode = "1f68b", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f68b),
        TwemojiIcon(plainName = "Trolleybus", unicode = "1f68e", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f68e),
        TwemojiIcon(plainName = "Train", unicode = "1f686", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f686),
        TwemojiIcon(plainName = "LightRail", unicode = "1f688", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f688),
        TwemojiIcon(plainName = "BusStop", unicode = "1f68f", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f68f),
        TwemojiIcon(plainName = "Monorail", unicode = "1f69d", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f69d),
        TwemojiIcon(plainName = "MountainRailway", unicode = "1f69e", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f69e),
        TwemojiIcon(plainName = "OilDrum", unicode = "1f6e2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6e2),
        TwemojiIcon(plainName = "RailwayTrack", unicode = "1f6e4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6e4),
        TwemojiIcon(plainName = "Motorway", unicode = "1f6e3", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6e3),
        TwemojiIcon(plainName = "RacingCar", unicode = "1f3ce", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f3ce),
        TwemojiIcon(plainName = "Motorcycle", unicode = "1f3cd", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f3cd),
        TwemojiIcon(plainName = "StopSign", unicode = "1f6d1", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6d1),
        TwemojiIcon(plainName = "MotorScooter", unicode = "1f6f5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6f5),
        TwemojiIcon(plainName = "ManualWheelchair", unicode = "1f9bd", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f9bd),
        TwemojiIcon(plainName = "MotorizedWheelchair", unicode = "1f9bc", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f9bc),
        TwemojiIcon(plainName = "AutoRickshaw", unicode = "1f6fa", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6fa),
        TwemojiIcon(plainName = "KickScooter", unicode = "1f6f4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6f4),
        TwemojiIcon(plainName = "Skateboard", unicode = "1f6f9", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportGround, resource = R.drawable.ic_1f6f9)
    )
    // endregion

    // region Transport water
    fun provideTransportWater() = listOf(
        TwemojiIcon(plainName = "Anchor", unicode = "2693", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_2693),
        TwemojiIcon(plainName = "Sailboat", unicode = "26f5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_26f5),
        TwemojiIcon(plainName = "Ship", unicode = "1f6a2", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_1f6a2),
        TwemojiIcon(plainName = "Speedboat", unicode = "1f6a4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_1f6a4),
        TwemojiIcon(plainName = "PassengerShip", unicode = "1f6f3", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_1f6f3),
        TwemojiIcon(plainName = "MotorBoat", unicode = "1f6e5", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_1f6e5),
        TwemojiIcon(plainName = "Ferry", unicode = "26f4", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_26f4),
        TwemojiIcon(plainName = "Canoe", unicode = "1f6f6", category = TwemojiCategory.TravelAndPlaces, subcategory = TwemojiSubcategory.TransportWater, resource = R.drawable.ic_1f6f6)
    )
    // endregion
    
}