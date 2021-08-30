package no.mhl.twemojiiconsandroid.travel

import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.Subcategory
import no.mhl.twemojiiconsandroid.core.model.Font

object TravelAndPlaces {

    // region Place map
    private val placeMap: List<EmojiIcon> = listOf(
        EmojiIcon("GlobeShowingEuropeAfrica", "1f30d", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f30d),
        EmojiIcon("GlobeShowingAmericas", "1f30e", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f30e),
        EmojiIcon("GlobeShowingAsiaAustralia", "1f30f", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f30f),
        EmojiIcon("GlobeWithMeridians", "1f310", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f310),
        EmojiIcon("WorldMap", "1f5fa", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f5fa),
        EmojiIcon("MapOfJapan", "1f5fe", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f5fe),
        EmojiIcon("Compass", "1f9ed", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f9ed)
    )
    // endregion

    // region Place geographic
    private val placeGeographic: List<EmojiIcon> = listOf(
        EmojiIcon("SnowCappedMountain", "1f3d4", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f3d4),
        EmojiIcon("Mountain", "26f0", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_26f0),
        EmojiIcon("Volcano", "1f30b", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f30b),
        EmojiIcon("MountFuji", "1f5fb", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f5fb),
        EmojiIcon("Camping", "1f3d5", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f3d5),
        EmojiIcon("BeachWithUmbrella", "1f3d6", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f3d6),
        EmojiIcon("Desert", "1f3dc", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f3dc),
        EmojiIcon("DesertIsland", "1f3dd", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f3dd),
        EmojiIcon("NationalPark", "1f3de", Category.TravelAndPlaces, Subcategory.PlaceMap, Font.Twemoji, R.drawable.ic_1f3de)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        placeMap,
        placeGeographic
    ).flatten()
    // endregion

}