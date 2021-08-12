<p align="center">
  </br>
  </br>
  <img src="https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/240/twitter/282/smiling-face-with-heart-eyes_1f60d.png" height="80"></img>
  </br>
  </br>
  </br>
  </br>
</p>

## Twemoji Icons Android

In a basic sense this library is a wrapper class for [Twemoji](https://github.com/twitter/twemoji), targetting the Android platform. All assets have been sorted into categories and converted to WebP resources. Each category has a following `provider` class which for now is a very basic object with references to drawables. At the moment, subcategories are not accessible but are present, if there is a need for such granualarity then these can also be made available.

### But really...why does this library exist?

If you're like me and have lots of good app ideas but not enough artistic skill to draw yourself a set of icons then this might be the library for you! Imagine a registration form where users are required to sign up with their phone number. More than likely users are going to need to pick their country code and instead of display some simple digits, why not accompany those digits with a flag icon?

Due to the vast array and diverse pool of emoji these days it is only fitting that developers can use these emoji as icons, and instead of said developers having to do most of the work manually, picking out the icons they want, you could use this library to pick out the icon set(s) applicable for your project.

This project will be kept up-to-date and include new emoji as the Twemoji spec is updated. All icons are currently provided in WebP format but if there is a greater need for SVG then these could be added in-addition-to or instead-of what is availble now.

### Sample

In this repository will you find the library itself (core project and categories) and in addition a sample app (written in Compose) which implements each module and loads the icons into a `LazyGrid`. Just in case you don't want to go and run the sample yourself, he's a couple of screenshots:

### Available categories

- Activities
- Animals & nature
- Component
- Flags
- Food & drinks
- Objects
- People & body
- Smileys & emotion
- Symbols
- Travel & places

Alternatively you can visit the [TwemojiCategory](https://github.com/maxhvesser/twemoji-icons-android/blob/main/core/src/main/java/no/mhl/twemojiiconsandroid/core/model/TwemojiCategory.kt) and [TwemojiSubcategory](https://github.com/maxhvesser/twemoji-icons-android/blob/main/core/src/main/java/no/mhl/twemojiiconsandroid/core/model/TwemojiSubcategory.kt) classes respectively, but please not that subcategories are not publicly accessible at the moment due to unsuruity surrounding the needed granulatiy of this library.

## How to

The library is currently provided via [JitPack](https://jitpack.io/#maxhvesser/twemoji-icons-android) for first be sure that your project is already setup for accessing JitPack dependencies. 

### Current version

The latest version of twemoji-icons-android is `0.1.6` and this is marked currenrtly as pre-release and should be considered as such due to lack of performance optimizations.

### Gradle

If you would like to have access to the entire icons set then you can simple add the following to your apps `build.gradle` file, in the dependencies closure:

```
implementation 'com.github.maxhvesser:twemoji-icons-android:0.1.6'
```

If you would however like access to specific categories then you would need to add the following: 

```Gradle
// Abstract the version to your root build.gradle
ext {
  ...
  twemoji_icons_version = '0.1.6'
}

// Continue with app build.gradle dependencies

...
// The core dependency must be present because this is where the model classes live
implementation "com.github.maxhvesser.twemoji-icons-android:core:$twemoji_icons_version"

// Next you can add the categories you want access to
implementation "com.github.maxhvesser.twemoji-icons-android:activities:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:animals:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:component:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:flags:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:food:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:objects:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:people:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:smileys:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:symbols:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:travel:$twemoji_icons_version"

```

### Providers

Each category (module) has it's own providing class that is an object with statically defined references, these providers can be accessed via the following:

```Kotlin
ActivitiesProvider.provideActivities()
AnimalsAndNatureProvider.provideAnimalsAndNature()
ComponentProvider.provideComponents()
FlagsProvider.provideFlags()
FoodAndDrinksProvider.provideFoodAndDrink()
ObjectsProvider.provideObjects()
PeopleAndBodyProvider.providePeopleAndBody()
SmileysAndEmotionProvider.provideSmileysAndEmotion()
SymbolsProvider.provideSymbols()
TravelAndPlacesProvider.provideTravelAndPlaces()
```

Whereby each `provider` provides a `List<TwemojiIcon>`, `TwemojiIcon` provides the following properties: 

```Kotlin
/**
* @property plainName A camelCase string representation of the emoji icon aka it's name
* @property unicode The unicode equivalent of the emoji icon
* @property category The belonging-to-category
* @property subcategory The belonging-to-subcategory
* @property resource The drawable reference statically defined in the provider class
*/
data class TwemojiIcon(
    val plainName: String,
    val unicode: String,
    val category: TwemojiCategory,
    val subcategory: TwemojiSubcategory,
    @DrawableRes val resource: Int
)
```
