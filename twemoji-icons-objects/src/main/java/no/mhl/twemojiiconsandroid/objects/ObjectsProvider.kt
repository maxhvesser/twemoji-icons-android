package no.mhl.twemojiiconsandroid.objects

import no.mhl.twemojiiconsandroid.core.model.TwemojiCategory
import no.mhl.twemojiiconsandroid.core.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.core.model.TwemojiSubcategory

object ObjectsProvider {

    // region All
    fun provideObjects(): List<TwemojiIcon> = listOf(
        provideBookPaper(),
        provideClothing(),
        provideComputer(),
        provideHousehold(),
        provideLightAndVideo(),
        provideLock(),
        provideMail(),
        provideMedical(),
        provideMoney(),
        provideMusic(),
        provideMusicalInstruments(),
        provideOffice(),
        provideOther(),
        providePhone(),
        provideScience(),
        provideSound(),
        provideTool(),
        provideWriting()
    ).flatten()
    // endregion

    // region Book paper
    private fun provideBookPaper(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "ClosedBook", unicode = "1f4d5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d5),
        TwemojiIcon(plainName = "Books", unicode = "1f4da", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4da),
        TwemojiIcon(plainName = "OpenBook", unicode = "1f4d6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d6),
        TwemojiIcon(plainName = "Newspaper", unicode = "1f4f0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4f0),
        TwemojiIcon(plainName = "Notebook", unicode = "1f4d3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d3),
        TwemojiIcon(plainName = "Ledger", unicode = "1f4d2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d2),
        TwemojiIcon(plainName = "BlueBook", unicode = "1f4d8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d8),
        TwemojiIcon(plainName = "GreenBook", unicode = "1f4d7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d7),
        TwemojiIcon(plainName = "Scroll", unicode = "1f4dc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4dc),
        TwemojiIcon(plainName = "PageFacingUp", unicode = "1f4c4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4c4),
        TwemojiIcon(plainName = "Bookmark", unicode = "1f516", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f516),
        TwemojiIcon(plainName = "BookmarkTabs", unicode = "1f4d1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d1),
        TwemojiIcon(plainName = "PageWithCurl", unicode = "1f4c3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4c3),
        TwemojiIcon(plainName = "OrangeBook", unicode = "1f4d9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d9),
        TwemojiIcon(plainName = "NotebookWithDecorativeCover", unicode = "1f4d4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f4d4),
        TwemojiIcon(plainName = "RolledUpNewspaper", unicode = "1f5de", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f5de),
        TwemojiIcon(plainName = "Label", unicode = "1f3f7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.BookPaper, resource = R.drawable.ic_1f3f7)
    )
    // endregion

    // region Clothing
    private fun provideClothing(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Crown", unicode = "1f451", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f451),
        TwemojiIcon(plainName = "GemStone", unicode = "1f48e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f48e),
        TwemojiIcon(plainName = "Ring", unicode = "1f48d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f48d),
        TwemojiIcon(plainName = "Lipstick", unicode = "1f484", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f484),
        TwemojiIcon(plainName = "GraduationCap", unicode = "1f393", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f393),
        TwemojiIcon(plainName = "HighHeeledShoe", unicode = "1f460", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f460),
        TwemojiIcon(plainName = "Bikini", unicode = "1f459", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f459),
        TwemojiIcon(plainName = "Glasses", unicode = "1f453", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f453),
        TwemojiIcon(plainName = "RunningShoe", unicode = "1f45f", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f45f),
        TwemojiIcon(plainName = "ThongSandal", unicode = "1fa74", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1fa74),
        TwemojiIcon(plainName = "TopHat", unicode = "1f3a9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f3a9),
        TwemojiIcon(plainName = "Dress", unicode = "1f457", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f457),
        TwemojiIcon(plainName = "Jeans", unicode = "1f456", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f456),
        TwemojiIcon(plainName = "Necktie", unicode = "1f454", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f454),
        TwemojiIcon(plainName = "TShirt", unicode = "1f455", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f455),
        TwemojiIcon(plainName = "WomanSHat", unicode = "1f452", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f452),
        TwemojiIcon(plainName = "ManSShoe", unicode = "1f45e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f45e),
        TwemojiIcon(plainName = "Handbag", unicode = "1f45c", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f45c),
        TwemojiIcon(plainName = "Purse", unicode = "1f45b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f45b),
        TwemojiIcon(plainName = "Kimono", unicode = "1f458", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f458),
        TwemojiIcon(plainName = "WomanSBoot", unicode = "1f462", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f462),
        TwemojiIcon(plainName = "Backpack", unicode = "1f392", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f392),
        TwemojiIcon(plainName = "WomanSSandal", unicode = "1f461", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f461),
        TwemojiIcon(plainName = "WomanSClothes", unicode = "1f45a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f45a),
        TwemojiIcon(plainName = "ClutchBag", unicode = "1f45d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f45d),
        TwemojiIcon(plainName = "Sunglasses", unicode = "1f576", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f576),
        TwemojiIcon(plainName = "ShoppingBags", unicode = "1f6cd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f6cd),
        TwemojiIcon(plainName = "PrayerBeads", unicode = "1f4ff", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f4ff),
        TwemojiIcon(plainName = "RescueWorkerSHelmet", unicode = "26d1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_26d1),
        TwemojiIcon(plainName = "Goggles", unicode = "1f97d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f97d),
        TwemojiIcon(plainName = "LabCoat", unicode = "1f97c", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f97c),
        TwemojiIcon(plainName = "SafetyVest", unicode = "1f9ba", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f9ba),
        TwemojiIcon(plainName = "Scarf", unicode = "1f9e3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f9e3),
        TwemojiIcon(plainName = "Gloves", unicode = "1f9e4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f9e4),
        TwemojiIcon(plainName = "Coat", unicode = "1f9e5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f9e5),
        TwemojiIcon(plainName = "Socks", unicode = "1f9e6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f9e6),
        TwemojiIcon(plainName = "Sari", unicode = "1f97b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f97b),
        TwemojiIcon(plainName = "OnePieceSwimsuit", unicode = "1fa71", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1fa71),
        TwemojiIcon(plainName = "Briefs", unicode = "1fa72", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1fa72),
        TwemojiIcon(plainName = "Shorts", unicode = "1fa73", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1fa73),
        TwemojiIcon(plainName = "HikingBoot", unicode = "1f97e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f97e),
        TwemojiIcon(plainName = "FlatShoe", unicode = "1f97f", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f97f),
        TwemojiIcon(plainName = "BalletShoes", unicode = "1fa70", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1fa70),
        TwemojiIcon(plainName = "MilitaryHelmet", unicode = "1fa96", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1fa96),
        TwemojiIcon(plainName = "BilledCap", unicode = "1f9e2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Clothing, resource = R.drawable.ic_1f9e2)
    )
    // endregion

    // region Computer
    private fun provideComputer(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "OpticalDisk", unicode = "1f4bf", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f4bf),
        TwemojiIcon(plainName = "Laptop", unicode = "1f4bb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f4bb),
        TwemojiIcon(plainName = "Battery", unicode = "1f50b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f50b),
        TwemojiIcon(plainName = "ElectricPlug", unicode = "1f50c", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f50c),
        TwemojiIcon(plainName = "Dvd", unicode = "1f4c0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f4c0),
        TwemojiIcon(plainName = "ComputerDisk", unicode = "1f4bd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f4bd),
        TwemojiIcon(plainName = "FloppyDisk", unicode = "1f4be", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f4be),
        TwemojiIcon(plainName = "Keyboard", unicode = "2328", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_2328),
        TwemojiIcon(plainName = "Trackball", unicode = "1f5b2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f5b2),
        TwemojiIcon(plainName = "ComputerMouse", unicode = "1f5b1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f5b1),
        TwemojiIcon(plainName = "Printer", unicode = "1f5a8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f5a8),
        TwemojiIcon(plainName = "DesktopComputer", unicode = "1f5a5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f5a5),
        TwemojiIcon(plainName = "Abacus", unicode = "1f9ee", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Computer, resource = R.drawable.ic_1f9ee)
    )
    // endregion

    // region Household
    private fun provideHousehold(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Shower", unicode = "1f6bf", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6bf),
        TwemojiIcon(plainName = "Door", unicode = "1f6aa", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6aa),
        TwemojiIcon(plainName = "Toilet", unicode = "1f6bd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6bd),
        TwemojiIcon(plainName = "Bathtub", unicode = "1f6c1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6c1),
        TwemojiIcon(plainName = "Mirror", unicode = "1fa9e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1fa9e),
        TwemojiIcon(plainName = "Window", unicode = "1fa9f", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1fa9f),
        TwemojiIcon(plainName = "Bed", unicode = "1f6cf", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6cf),
        TwemojiIcon(plainName = "CouchAndLamp", unicode = "1f6cb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6cb),
        TwemojiIcon(plainName = "Chair", unicode = "1fa91", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1fa91),
        TwemojiIcon(plainName = "Razor", unicode = "1fa92", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1fa92),
        TwemojiIcon(plainName = "LotionBottle", unicode = "1f9f4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9f4),
        TwemojiIcon(plainName = "SafetyPin", unicode = "1f9f7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9f7),
        TwemojiIcon(plainName = "Broom", unicode = "1f9f9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9f9),
        TwemojiIcon(plainName = "Basket", unicode = "1f9fa", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9fa),
        TwemojiIcon(plainName = "RollOfPaper", unicode = "1f9fb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9fb),
        TwemojiIcon(plainName = "Soap", unicode = "1f9fc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9fc),
        TwemojiIcon(plainName = "Toothbrush", unicode = "1faa5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1faa5),
        TwemojiIcon(plainName = "Sponge", unicode = "1f9fd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9fd),
        TwemojiIcon(plainName = "FireExtinguisher", unicode = "1f9ef", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f9ef),
        TwemojiIcon(plainName = "ShoppingCart", unicode = "1f6d2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Household, resource = R.drawable.ic_1f6d2)
    )
    // endregion

    // region Light and video
    private fun provideLightAndVideo(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Camera", unicode = "1f4f7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4f7),
        TwemojiIcon(plainName = "MovieCamera", unicode = "1f3a5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f3a5),
        TwemojiIcon(plainName = "ClapperBoard", unicode = "1f3ac", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f3ac),
        TwemojiIcon(plainName = "VideoCamera", unicode = "1f4f9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4f9),
        TwemojiIcon(plainName = "Television", unicode = "1f4fa", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4fa),
        TwemojiIcon(plainName = "LightBulb", unicode = "1f4a1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4a1),
        TwemojiIcon(plainName = "MagnifyingGlassTiltedRight", unicode = "1f50e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f50e),
        TwemojiIcon(plainName = "MagnifyingGlassTiltedLeft", unicode = "1f50d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f50d),
        TwemojiIcon(plainName = "Flashlight", unicode = "1f526", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f526),
        TwemojiIcon(plainName = "Videocassette", unicode = "1f4fc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4fc),
        TwemojiIcon(plainName = "RedPaperLantern", unicode = "1f3ee", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f3ee),
        TwemojiIcon(plainName = "Candle", unicode = "1f56f", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f56f),
        TwemojiIcon(plainName = "FilmProjector", unicode = "1f4fd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4fd),
        TwemojiIcon(plainName = "CameraWithFlash", unicode = "1f4f8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f4f8),
        TwemojiIcon(plainName = "FilmFrames", unicode = "1f39e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1f39e),
        TwemojiIcon(plainName = "DiyaLamp", unicode = "1fa94", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.LightAndVideo, resource = R.drawable.ic_1fa94)
    )
    // endregion

    // region Lock
    private fun provideLock(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Key", unicode = "1f511", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Lock, resource = R.drawable.ic_1f511),
        TwemojiIcon(plainName = "LockedWithKey", unicode = "1f510", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Lock, resource = R.drawable.ic_1f510),
        TwemojiIcon(plainName = "Locked", unicode = "1f512", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Lock, resource = R.drawable.ic_1f512),
        TwemojiIcon(plainName = "Unlocked", unicode = "1f513", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Lock, resource = R.drawable.ic_1f513),
        TwemojiIcon(plainName = "LockedWithPen", unicode = "1f50f", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Lock, resource = R.drawable.ic_1f50f),
        TwemojiIcon(plainName = "OldKey", unicode = "1f5dd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Lock, resource = R.drawable.ic_1f5dd)
    )
    // endregion

    // region Mail
    private fun provideMail(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "InboxTray", unicode = "1f4e5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4e5),
        TwemojiIcon(plainName = "EnvelopeWithArrow", unicode = "1f4e9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4e9),
        TwemojiIcon(plainName = "Package", unicode = "1f4e6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4e6),
        TwemojiIcon(plainName = "Postbox", unicode = "1f4ee", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4ee),
        TwemojiIcon(plainName = "EMail", unicode = "1f4e7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4e7),
        TwemojiIcon(plainName = "OpenMailboxWithRaisedFlag", unicode = "1f4ec", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4ec),
        TwemojiIcon(plainName = "IncomingEnvelope", unicode = "1f4e8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4e8),
        TwemojiIcon(plainName = "OutboxTray", unicode = "1f4e4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4e4),
        TwemojiIcon(plainName = "ClosedMailboxWithRaisedFlag", unicode = "1f4eb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4eb),
        TwemojiIcon(plainName = "ClosedMailboxWithLoweredFlag", unicode = "1f4ea", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4ea),
        TwemojiIcon(plainName = "OpenMailboxWithLoweredFlag", unicode = "1f4ed", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f4ed),
        TwemojiIcon(plainName = "BallotBoxWithBallot", unicode = "1f5f3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_1f5f3),
        TwemojiIcon(plainName = "Envelope", unicode = "2709", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Mail, resource = R.drawable.ic_2709)
    )
    // endregion

    // region Medical
    private fun provideMedical(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Syringe", unicode = "1f489", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Medical, resource = R.drawable.ic_1f489),
        TwemojiIcon(plainName = "Pill", unicode = "1f48a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Medical, resource = R.drawable.ic_1f48a),
        TwemojiIcon(plainName = "DropOfBlood", unicode = "1fa78", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Medical, resource = R.drawable.ic_1fa78),
        TwemojiIcon(plainName = "AdhesiveBandage", unicode = "1fa79", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Medical, resource = R.drawable.ic_1fa79),
        TwemojiIcon(plainName = "Stethoscope", unicode = "1fa7a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Medical, resource = R.drawable.ic_1fa7a)
    )
    // endregion

    // region Money
    private fun provideMoney(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "MoneyBag", unicode = "1f4b0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b0),
        TwemojiIcon(plainName = "MoneyWithWings", unicode = "1f4b8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b8),
        TwemojiIcon(plainName = "DollarBanknote", unicode = "1f4b5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b5),
        TwemojiIcon(plainName = "Coin", unicode = "1fa99", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1fa99),
        TwemojiIcon(plainName = "HeavyDollarSign", unicode = "1f4b2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b2),
        TwemojiIcon(plainName = "CreditCard", unicode = "1f4b3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b3),
        TwemojiIcon(plainName = "PoundBanknote", unicode = "1f4b7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b7),
        TwemojiIcon(plainName = "EuroBanknote", unicode = "1f4b6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b6),
        TwemojiIcon(plainName = "YenBanknote", unicode = "1f4b4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b4),
        TwemojiIcon(plainName = "CurrencyExchange", unicode = "1f4b1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b1),
        TwemojiIcon(plainName = "ChartIncreasingWithYen", unicode = "1f4b9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f4b9),
        TwemojiIcon(plainName = "Receipt", unicode = "1f9fe", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Money, resource = R.drawable.ic_1f9fe)
    )
    // endregion

    // region Music
    private fun provideMusic(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "MusicalNotes", unicode = "1f3b6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f3b6),
        TwemojiIcon(plainName = "Headphone", unicode = "1f3a7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f3a7),
        TwemojiIcon(plainName = "MusicalNote", unicode = "1f3b5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f3b5),
        TwemojiIcon(plainName = "Microphone", unicode = "1f3a4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f3a4),
        TwemojiIcon(plainName = "MusicalScore", unicode = "1f3bc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f3bc),
        TwemojiIcon(plainName = "Radio", unicode = "1f4fb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f4fb),
        TwemojiIcon(plainName = "ControlKnobs", unicode = "1f39b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f39b),
        TwemojiIcon(plainName = "LevelSlider", unicode = "1f39a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f39a),
        TwemojiIcon(plainName = "StudioMicrophone", unicode = "1f399", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Music, resource = R.drawable.ic_1f399)
    )
    // endregion

    // region Musical instruments
    private fun provideMusicalInstruments(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Guitar", unicode = "1f3b8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1f3b8),
        TwemojiIcon(plainName = "MusicalKeyboard", unicode = "1f3b9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1f3b9),
        TwemojiIcon(plainName = "Saxophone", unicode = "1f3b7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1f3b7),
        TwemojiIcon(plainName = "Trumpet", unicode = "1f3ba", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1f3ba),
        TwemojiIcon(plainName = "Violin", unicode = "1f3bb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1f3bb),
        TwemojiIcon(plainName = "Drum", unicode = "1f941", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1f941),
        TwemojiIcon(plainName = "LongDrum", unicode = "1fa98", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1fa98),
        TwemojiIcon(plainName = "Accordion", unicode = "1fa97", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1fa97),
        TwemojiIcon(plainName = "Banjo", unicode = "1fa95", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.MusicalInstrument, resource = R.drawable.ic_1fa95)
    )
    // endregion

    // region Office
    private fun provideOffice(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Scissors", unicode = "2702", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_2702),
        TwemojiIcon(plainName = "RoundPushpin", unicode = "1f4cd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4cd),
        TwemojiIcon(plainName = "Pushpin", unicode = "1f4cc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4cc),
        TwemojiIcon(plainName = "Calendar", unicode = "1f4c5", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c5),
        TwemojiIcon(plainName = "TearOffCalendar", unicode = "1f4c6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c6),
        TwemojiIcon(plainName = "Briefcase", unicode = "1f4bc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4bc),
        TwemojiIcon(plainName = "ChartIncreasing", unicode = "1f4c8", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c8),
        TwemojiIcon(plainName = "Paperclip", unicode = "1f4ce", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4ce),
        TwemojiIcon(plainName = "ChartDecreasing", unicode = "1f4c9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c9),
        TwemojiIcon(plainName = "Clipboard", unicode = "1f4cb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4cb),
        TwemojiIcon(plainName = "Placard", unicode = "1faa7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1faa7),
        TwemojiIcon(plainName = "BarChart", unicode = "1f4ca", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4ca),
        TwemojiIcon(plainName = "TriangularRuler", unicode = "1f4d0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4d0),
        TwemojiIcon(plainName = "StraightRuler", unicode = "1f4cf", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4cf),
        TwemojiIcon(plainName = "OpenFileFolder", unicode = "1f4c2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c2),
        TwemojiIcon(plainName = "FileFolder", unicode = "1f4c1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c1),
        TwemojiIcon(plainName = "CardIndex", unicode = "1f4c7", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f4c7),
        TwemojiIcon(plainName = "SpiralCalendar", unicode = "1f5d3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f5d3),
        TwemojiIcon(plainName = "SpiralNotepad", unicode = "1f5d2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f5d2),
        TwemojiIcon(plainName = "Wastebasket", unicode = "1f5d1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f5d1),
        TwemojiIcon(plainName = "FileCabinet", unicode = "1f5c4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f5c4),
        TwemojiIcon(plainName = "CardFileBox", unicode = "1f5c3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f5c3),
        TwemojiIcon(plainName = "CardIndexDividers", unicode = "1f5c2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f5c2),
        TwemojiIcon(plainName = "LinkedPaperclips", unicode = "1f587", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Office, resource = R.drawable.ic_1f587)
    )
    // endregion

    // region Other
    private fun provideOther(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Cigarette", unicode = "1f6ac", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.OtherObject, resource = R.drawable.ic_1f6ac),
        TwemojiIcon(plainName = "Moai", unicode = "1f5ff", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.OtherObject, resource = R.drawable.ic_1f5ff),
        TwemojiIcon(plainName = "FuneralUrn", unicode = "26b1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.OtherObject, resource = R.drawable.ic_26b1),
        TwemojiIcon(plainName = "MouseTrap", unicode = "1faa4", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.OtherObject, resource = R.drawable.ic_1faa4),
        TwemojiIcon(plainName = "Headstone", unicode = "1faa6", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.OtherObject, resource = R.drawable.ic_1faa6),
        TwemojiIcon(plainName = "Coffin", unicode = "26b0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.OtherObject, resource = R.drawable.ic_26b0)
    )
    // endregion

    // region Phone
    private fun providePhone(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Telephone", unicode = "260e", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Phone, resource = R.drawable.ic_260e),
        TwemojiIcon(plainName = "MobilePhoneWithArrow", unicode = "1f4f2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Phone, resource = R.drawable.ic_1f4f2),
        TwemojiIcon(plainName = "MobilePhone", unicode = "1f4f1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Phone, resource = R.drawable.ic_1f4f1),
        TwemojiIcon(plainName = "TelephoneReceiver", unicode = "1f4de", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Phone, resource = R.drawable.ic_1f4de),
        TwemojiIcon(plainName = "FaxMachine", unicode = "1f4e0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Phone, resource = R.drawable.ic_1f4e0),
        TwemojiIcon(plainName = "Pager", unicode = "1f4df", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Phone, resource = R.drawable.ic_1f4df)
    )
    // endregion

    // region Science
    private fun provideScience(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "SatelliteAntenna", unicode = "1f4e1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_1f4e1),
        TwemojiIcon(plainName = "Telescope", unicode = "1f52d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_1f52d),
        TwemojiIcon(plainName = "Microscope", unicode = "1f52c", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_1f52c),
        TwemojiIcon(plainName = "Alembic", unicode = "2697", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_2697),
        TwemojiIcon(plainName = "TestTube", unicode = "1f9ea", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_1f9ea),
        TwemojiIcon(plainName = "PetriDish", unicode = "1f9eb", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_1f9eb),
        TwemojiIcon(plainName = "Dna", unicode = "1f9ec", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Science, resource = R.drawable.ic_1f9ec)
    )
    // endregion

    // region Sound
    private fun provideSound(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "SpeakerHighVolume", unicode = "1f50a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f50a),
        TwemojiIcon(plainName = "Loudspeaker", unicode = "1f4e2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f4e2),
        TwemojiIcon(plainName = "Megaphone", unicode = "1f4e3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f4e3),
        TwemojiIcon(plainName = "Bell", unicode = "1f514", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f514),
        TwemojiIcon(plainName = "BellWithSlash", unicode = "1f515", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f515),
        TwemojiIcon(plainName = "MutedSpeaker", unicode = "1f507", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f507),
        TwemojiIcon(plainName = "SpeakerMediumVolume", unicode = "1f509", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f509),
        TwemojiIcon(plainName = "SpeakerLowVolume", unicode = "1f508", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f508),
        TwemojiIcon(plainName = "PostalHorn", unicode = "1f4ef", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Sound, resource = R.drawable.ic_1f4ef)
    )
    // endregion

    // region Tool
    private fun provideTool(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Pistol", unicode = "1f52b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f52b),
        TwemojiIcon(plainName = "Link", unicode = "1f517", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f517),
        TwemojiIcon(plainName = "Hammer", unicode = "1f528", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f528),
        TwemojiIcon(plainName = "NutAndBolt", unicode = "1f529", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f529),
        TwemojiIcon(plainName = "Wrench", unicode = "1f527", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f527),
        TwemojiIcon(plainName = "CarpentrySaw", unicode = "1fa9a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1fa9a),
        TwemojiIcon(plainName = "Screwdriver", unicode = "1fa9b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1fa9b),
        TwemojiIcon(plainName = "Ladder", unicode = "1fa9c", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1fa9c),
        TwemojiIcon(plainName = "Hook", unicode = "1fa9d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1fa9d),
        TwemojiIcon(plainName = "Plunger", unicode = "1faa0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1faa0),
        TwemojiIcon(plainName = "Bucket", unicode = "1faa3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1faa3),
        TwemojiIcon(plainName = "Gear", unicode = "2699", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_2699),
        TwemojiIcon(plainName = "BalanceScale", unicode = "2696", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_2696),
        TwemojiIcon(plainName = "CrossedSwords", unicode = "2694", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_2694),
        TwemojiIcon(plainName = "Shield", unicode = "1f6e1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f6e1),
        TwemojiIcon(plainName = "HammerAndWrench", unicode = "1f6e0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f6e0),
        TwemojiIcon(plainName = "Dagger", unicode = "1f5e1", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f5e1),
        TwemojiIcon(plainName = "Clamp", unicode = "1f5dc", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f5dc),
        TwemojiIcon(plainName = "BowAndArrow", unicode = "1f3f9", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f3f9),
        TwemojiIcon(plainName = "Chains", unicode = "26d3", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_26d3),
        TwemojiIcon(plainName = "Knot", unicode = "1faa2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1faa2),
        TwemojiIcon(plainName = "Pick", unicode = "26cf", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_26cf),
        TwemojiIcon(plainName = "HammerAndPick", unicode = "2692", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_2692),
        TwemojiIcon(plainName = "Axe", unicode = "1fa93", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1fa93),
        TwemojiIcon(plainName = "ProbingCane", unicode = "1f9af", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f9af),
        TwemojiIcon(plainName = "Toolbox", unicode = "1f9f0", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f9f0),
        TwemojiIcon(plainName = "Boomerang", unicode = "1fa83", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1fa83),
        TwemojiIcon(plainName = "Magnet", unicode = "1f9f2", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Tool, resource = R.drawable.ic_1f9f2)
    )
    // endregion

    // region Writing
    private fun provideWriting(): List<TwemojiIcon> = listOf(
        TwemojiIcon(plainName = "Memo", unicode = "1f4dd", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_1f4dd),
        TwemojiIcon(plainName = "Pencil", unicode = "270f", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_270f),
        TwemojiIcon(plainName = "BlackNib", unicode = "2712", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_2712),
        TwemojiIcon(plainName = "Crayon", unicode = "1f58d", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_1f58d),
        TwemojiIcon(plainName = "Paintbrush", unicode = "1f58c", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_1f58c),
        TwemojiIcon(plainName = "FountainPen", unicode = "1f58b", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_1f58b),
        TwemojiIcon(plainName = "Pen", unicode = "1f58a", category = TwemojiCategory.Objects, subcategory = TwemojiSubcategory.Writing, resource = R.drawable.ic_1f58a)
    )
    // endregion

}