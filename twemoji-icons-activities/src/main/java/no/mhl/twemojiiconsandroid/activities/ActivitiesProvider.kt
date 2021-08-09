package no.mhl.twemojiiconsandroid.activities

import no.mhl.twemojiiconsandroid.core.model.TwemojiIcon

object ActivitiesProver {

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
    private fun provideArtsAndCrafts(): List<TwemojiIcon> = emptyList()
    // endregion

    // region Award medals
    private fun provideAwardMedals(): List<TwemojiIcon> = emptyList()
    // endregion

    // region Events
    private fun provideEvents(): List<TwemojiIcon> = emptyList()
    // endregion

    // region Games
    private fun provideGames(): List<TwemojiIcon> = emptyList()
    // endregion

    // region Sports
    private fun provideSports(): List<TwemojiIcon> = emptyList()
    // endregion

}