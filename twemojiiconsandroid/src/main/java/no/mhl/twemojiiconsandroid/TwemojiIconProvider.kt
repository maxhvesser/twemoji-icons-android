package no.mhl.twemojiiconsandroid

import no.mhl.twemojiiconsandroid.categories.*
import no.mhl.twemojiiconsandroid.model.TwemojiIcon

class TwemojiIconProvider {

    // region Category providers
    private val activitiesProvider = ActivitiesProvider
    private val animalsAndNatureProvider = AnimalsAndNatureProvider
    private val componentProvider = ComponentProvider
    private val flagsProvider = FlagsProvider
    private val foodAndDrinkProvider = FoodAndDrinkProvider
    private val objectsProvider = ObjectsProvider
    private val peopleAndBodyProvider = PeopleAndBodyProvider
    private val smileysAndEmotionProvider = SmileysAndEmotionProvider
    private val symbolsProvider = SymbolsProvider
    private val travelAndPlacesProvider = TravelAndPlacesProvider
    // endregion

    // region All
    fun provideAll(): List<TwemojiIcon> = listOf(
        provideActivities(),
        provideAnimalsAndNature(),
        provideComponents(),
        provideFlags(),
        provideFoodAndDrink(),
        provideObjects(),
        providePeopleAndBody(),
        provideSmileysAndEmotion(),
        provideSymbols(),
        provideTravelAndPlaces()
    ).flatten()
    // endregion

    // region Activities
    fun provideActivities() = activitiesProvider.provideActivities()
    // endregion

    // region Animals and nature
    fun provideAnimalsAndNature() = animalsAndNatureProvider.provideAnimalsAndNature()
    // endregion

    // region Component
    fun provideComponents() = componentProvider.provideComponents()
    // endregion

    // region Flags
    fun provideFlags() = flagsProvider.provideFlags()
    // endregion

    // region Food and drink
    fun provideFoodAndDrink() = foodAndDrinkProvider.provideFoodAndDrink()
    // endregion

    // region Objects
    fun provideObjects() = objectsProvider.provideObjects()
    // endregion

    // region People and body
    fun providePeopleAndBody() = peopleAndBodyProvider.providePeopleAndBody()
    // endregion

    // region Smileys and emotion
    fun provideSmileysAndEmotion() = smileysAndEmotionProvider.provideSmileysAndEmotion()
    // endregion

    // region Symbols
    fun provideSymbols() = symbolsProvider.provideSymbols()
    // endregion

    // region Travel and places
    fun provideTravelAndPlaces() = travelAndPlacesProvider.provideTravelAndPlaces()
    // endregion

}