package no.mhl.twemojiiconsandroid.categories

import no.mhl.twemojiiconsandroid.R
import no.mhl.twemojiiconsandroid.core.model.TwemojiCategory
import no.mhl.twemojiiconsandroid.core.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.core.model.TwemojiSubcategory

internal object ComponentProvider {

    // region ALl
    fun provideComponents(): List<TwemojiIcon> = listOf(
        provideHairStyles(),
        provideSkinTones()
    ).flatten()
    // endregion

    // region Hair styles
    fun provideHairStyles() = listOf(
        TwemojiIcon(plainName = "RedHair", unicode = "1f9b0", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.HairStyle, resource = R.drawable.ic_1f9b0),
        TwemojiIcon(plainName = "CurlyHair", unicode = "1f9b1", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.HairStyle, resource = R.drawable.ic_1f9b1),
        TwemojiIcon(plainName = "WhiteHair", unicode = "1f9b3", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.HairStyle, resource = R.drawable.ic_1f9b3),
        TwemojiIcon(plainName = "Bald", unicode = "1f9b2", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.HairStyle, resource = R.drawable.ic_1f9b2)
    )
    // endregion

    // region Skin tones
    fun provideSkinTones() = listOf(
        TwemojiIcon(plainName = "LightSkinTone", unicode = "1f3fb", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.SkinTone, resource = R.drawable.ic_1f3fb),
        TwemojiIcon(plainName = "MediumLightSkinTone", unicode = "1f3fc", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.SkinTone, resource = R.drawable.ic_1f3fc),
        TwemojiIcon(plainName = "MediumSkinTone", unicode = "1f3fd", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.SkinTone, resource = R.drawable.ic_1f3fd),
        TwemojiIcon(plainName = "MediumDarkSkinTone", unicode = "1f3fe", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.SkinTone, resource = R.drawable.ic_1f3fe),
        TwemojiIcon(plainName = "DarkSkinTone", unicode = "1f3ff", category = TwemojiCategory.Component, subcategory = TwemojiSubcategory.SkinTone, resource = R.drawable.ic_1f3ff)
    )
    // endregion

}