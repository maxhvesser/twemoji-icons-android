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

    // region Musical instruments
    private val musicalInstruments: List<EmojiIcon> = listOf(
        EmojiIcon("Saxophone", "1f3b7", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1f3b7),
        EmojiIcon("Accordion", "1fa97", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1fa97),
        EmojiIcon("Guitar", "1f3b8", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1f3b8),
        EmojiIcon("MusicalKeyboard", "1f3b9", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1f3b9),
        EmojiIcon("Trumpet", "1f3ba", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1f3ba),
        EmojiIcon("Violin", "1f3bb", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1f3bb),
        EmojiIcon("Banjo", "1fa95", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1fa95),
        EmojiIcon("Drum", "1f941", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1f941),
        EmojiIcon("LongDrum", "1fa98", Category.Objects, Subcategory.MusicalInstrument, Font.Twemoji, R.drawable.ic_1fa98)
    )
    // endregion

    // region Phone
    private val phone: List<EmojiIcon> = listOf(
        EmojiIcon("MobilePhone", "1f4f1", Category.Objects, Subcategory.Phone, Font.Twemoji, R.drawable.ic_1f4f1),
        EmojiIcon("MobilePhoneWithArrow", "1f4f2", Category.Objects, Subcategory.Phone, Font.Twemoji, R.drawable.ic_1f4f2),
        EmojiIcon("Telephone", "260e", Category.Objects, Subcategory.Phone, Font.Twemoji, R.drawable.ic_260e),
        EmojiIcon("TelephoneReceiver", "1f4de", Category.Objects, Subcategory.Phone, Font.Twemoji, R.drawable.ic_1f4de),
        EmojiIcon("Pager", "1f4df", Category.Objects, Subcategory.Phone, Font.Twemoji, R.drawable.ic_1f4df),
        EmojiIcon("FaxMachine", "1f4e0", Category.Objects, Subcategory.Phone, Font.Twemoji, R.drawable.ic_1f4e0)
    )
    // endregion

    // region Computer
    private val computer: List<EmojiIcon> = listOf(
        EmojiIcon("Battery", "1f50b", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f50b),
        EmojiIcon("ElectricPlug", "1f50c", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f50c),
        EmojiIcon("Laptop", "1f4bb", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f4bb),
        EmojiIcon("DesktopComputer", "1f5a5", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f5a5),
        EmojiIcon("Printer", "1f5a8", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f5a8),
        EmojiIcon("Keyboard", "2328", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_2328),
        EmojiIcon("ComputerMouse", "1f5b1", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f5b1),
        EmojiIcon("Trackball", "1f5b2", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f5b2),
        EmojiIcon("ComputerDisk", "1f4bd", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f4bd),
        EmojiIcon("FloppyDisk", "1f4be", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f4be),
        EmojiIcon("OpticalDisk", "1f4bf", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f4bf),
        EmojiIcon("Dvd", "1f4c0", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f4c0),
        EmojiIcon("Abacus", "1f9ee", Category.Objects, Subcategory.Computer, Font.Twemoji, R.drawable.ic_1f9ee)
    )
    // endregion

    // region Light and video
    private val lightAndVideo: List<EmojiIcon> = listOf(
        EmojiIcon("MovieCamera", "1f3a5", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f3a5),
        EmojiIcon("FilmFrames", "1f39e", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f39e),
        EmojiIcon("FilmProjector", "1f4fd", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4fd),
        EmojiIcon("ClapperBoard", "1f3ac", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f3ac),
        EmojiIcon("Television", "1f4fa", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4fa),
        EmojiIcon("Camera", "1f4f7", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4f7),
        EmojiIcon("CameraWithFlash", "1f4f8", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4f8),
        EmojiIcon("VideoCamera", "1f4f9", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4f9),
        EmojiIcon("Videocassette", "1f4fc", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4fc),
        EmojiIcon("MagnifyingGlassTiltedLeft", "1f50d", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f50d),
        EmojiIcon("MagnifyingGlassTiltedRight", "1f50e", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f50e),
        EmojiIcon("Candle", "1f56f", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f56f),
        EmojiIcon("LightBulb", "1f4a1", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f4a1),
        EmojiIcon("Flashlight", "1f526", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f526),
        EmojiIcon("RedPaperLantern", "1f3ee", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1f3ee),
        EmojiIcon("DiyaLamp", "1fa94", Category.Objects, Subcategory.LightAndVideo, Font.Twemoji, R.drawable.ic_1fa94)
    )
    // endregion

    // region Book paper
    private val bookPaper: List<EmojiIcon> = listOf(
        EmojiIcon("NotebookWithDecorativeCover", "1f4d4", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d4),
        EmojiIcon("ClosedBook", "1f4d5", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d5),
        EmojiIcon("OpenBook", "1f4d6", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d6),
        EmojiIcon("GreenBook", "1f4d7", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d7),
        EmojiIcon("BlueBook", "1f4d8", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d8),
        EmojiIcon("OrangeBook", "1f4d9", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d9),
        EmojiIcon("Books", "1f4da", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4da),
        EmojiIcon("Notebook", "1f4d3", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d3),
        EmojiIcon("Ledger", "1f4d2", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d2),
        EmojiIcon("PageWithCurl", "1f4c3", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4c3),
        EmojiIcon("Scroll", "1f4dc", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4dc),
        EmojiIcon("PageFacingUp", "1f4c4", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4c4),
        EmojiIcon("Newspaper", "1f4f0", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4f0),
        EmojiIcon("RolledUpNewspaper", "1f5de", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f5de),
        EmojiIcon("BookmarkTabs", "1f4d1", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f4d1),
        EmojiIcon("Bookmark", "1f516", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f516),
        EmojiIcon("Label", "1f3f7", Category.Objects, Subcategory.BookPaper, Font.Twemoji, R.drawable.ic_1f3f7)
    )
    // endregion

    // region Money
    private val money: List<EmojiIcon> = listOf(
        EmojiIcon("MoneyBag", "1f4b0", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b0),
        EmojiIcon("Coin", "1fa99", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1fa99),
        EmojiIcon("YenBanknote", "1f4b4", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b4),
        EmojiIcon("DollarBanknote", "1f4b5", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b5),
        EmojiIcon("EuroBanknote", "1f4b6", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b6),
        EmojiIcon("PoundBanknote", "1f4b7", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b7),
        EmojiIcon("MoneyWithWings", "1f4b8", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b8),
        EmojiIcon("CreditCard", "1f4b3", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b3),
        EmojiIcon("Receipt", "1f9fe", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f9fe),
        EmojiIcon("ChartIncreasingWithYen", "1f4b9", Category.Objects, Subcategory.Money, Font.Twemoji, R.drawable.ic_1f4b9)
    )
    // endregion

    // region Mail
    private val mail: List<EmojiIcon> = listOf(
        EmojiIcon("Envelope", "2709", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_2709),
        EmojiIcon("EMail", "1f4e7", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4e7),
        EmojiIcon("IncomingEnvelope", "1f4e8", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4e8),
        EmojiIcon("EnvelopeWithArrow", "1f4e9", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4e9),
        EmojiIcon("OutboxTray", "1f4e4", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4e4),
        EmojiIcon("InboxTray", "1f4e5", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4e5),
        EmojiIcon("Package", "1f4e6", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4e6),
        EmojiIcon("ClosedMailboxWithRaisedFlag", "1f4eb", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4eb),
        EmojiIcon("ClosedMailboxWithLoweredFlag", "1f4ea", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4ea),
        EmojiIcon("OpenMailboxWithRaisedFlag", "1f4ec", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4ec),
        EmojiIcon("OpenMailboxWithLoweredFlag", "1f4ed", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4ed),
        EmojiIcon("Postbox", "1f4ee", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f4ee),
        EmojiIcon("BallotBoxWithBallot", "1f5f3", Category.Objects, Subcategory.Mail, Font.Twemoji, R.drawable.ic_1f5f3)
    )
    // endregion

    // region Writing
    private val writing: List<EmojiIcon> = listOf(
        EmojiIcon("Pencil", "270f", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_270f),
        EmojiIcon("BlackNib", "2712", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_2712),
        EmojiIcon("FountainPen", "1f58b", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_1f58b),
        EmojiIcon("Pen", "1f58a", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_1f58a),
        EmojiIcon("Paintbrush", "1f58c", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_1f58c),
        EmojiIcon("Crayon", "1f58d", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_1f58d),
        EmojiIcon("Memo", "1f4dd", Category.Objects, Subcategory.Writing, Font.Twemoji, R.drawable.ic_1f4dd)
    )
    // endregion

    // region Office
    private val office: List<EmojiIcon> = listOf(
        EmojiIcon("Briefcase", "1f4bc", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4bc),
        EmojiIcon("FileFolder", "1f4c1", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c1),
        EmojiIcon("OpenFileFolder", "1f4c2", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c2),
        EmojiIcon("CardIndexDividers", "1f5c2", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f5c2),
        EmojiIcon("Calendar", "1f4c5", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c5),
        EmojiIcon("TearOffCalendar", "1f4c6", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c6),
        EmojiIcon("SpiralNotepad", "1f5d2", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f5d2),
        EmojiIcon("SpiralCalendar", "1f5d3", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f5d3),
        EmojiIcon("CardIndex", "1f4c7", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c7),
        EmojiIcon("ChartIncreasing", "1f4c8", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c8),
        EmojiIcon("ChartDecreasing", "1f4c9", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4c9),
        EmojiIcon("BarChart", "1f4ca", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4ca),
        EmojiIcon("Clipboard", "1f4cb", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4cb),
        EmojiIcon("Pushpin", "1f4cc", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4cc),
        EmojiIcon("RoundPushpin", "1f4cd", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4cd),
        EmojiIcon("Paperclip", "1f4ce", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4ce),
        EmojiIcon("LinkedPaperclips", "1f587", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f587),
        EmojiIcon("StraightRuler", "1f4cf", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4cf),
        EmojiIcon("TriangularRuler", "1f4d0", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f4d0),
        EmojiIcon("Scissors", "2702", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_2702),
        EmojiIcon("CardFileBox", "1f5c3", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f5c3),
        EmojiIcon("FileCabinet", "1f5c4", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f5c4),
        EmojiIcon("Wastebasket", "1f5d1", Category.Objects, Subcategory.Office, Font.Twemoji, R.drawable.ic_1f5d1)
    )
    // endregion

    // region Lock
    private val lock: List<EmojiIcon> = listOf(
        EmojiIcon("Locked", "1f512", Category.Objects, Subcategory.Lock, Font.Twemoji, R.drawable.ic_1f512),
        EmojiIcon("Unlocked", "1f513", Category.Objects, Subcategory.Lock, Font.Twemoji, R.drawable.ic_1f513),
        EmojiIcon("LockedWithPen", "1f50f", Category.Objects, Subcategory.Lock, Font.Twemoji, R.drawable.ic_1f50f),
        EmojiIcon("LockedWithKey", "1f510", Category.Objects, Subcategory.Lock, Font.Twemoji, R.drawable.ic_1f510),
        EmojiIcon("Key", "1f511", Category.Objects, Subcategory.Lock, Font.Twemoji, R.drawable.ic_1f511),
        EmojiIcon("OldKey", "1f5dd", Category.Objects, Subcategory.Lock, Font.Twemoji, R.drawable.ic_1f5dd)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        clothing,
        sound,
        music,
        musicalInstruments,
        phone,
        computer,
        lightAndVideo,
        bookPaper,
        money,
        mail,
        writing,
        office,
        lock
    ).flatten()
    // endregion

}