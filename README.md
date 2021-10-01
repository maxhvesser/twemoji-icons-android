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

[![](https://jitpack.io/v/maxhvesser/twemoji-icons-android.svg)](https://jitpack.io/#maxhvesser/twemoji-icons-android)

In a basic sense this library is a wrapper class for [Twemoji](https://github.com/twitter/twemoji), targetting the Android platform. All icons have been split into their unicode-given categories and converted to WebP resources. Each category has a class which for now is a very basic object with `val` references to drawables. At the moment, subcategories are not accessible but are present, if there is a need for such granualarity then these can also be made available.

### But really...why does this library exist?

If you're like me and have lots of good app ideas but not enough artistic skill to draw yourself a set of icons then this might be the library for you! Imagine a registration form where users are required to sign up with their phone number. More than likely users are going to need to pick their country code and instead of display some simple digits, why not accompany those digits with a flag icon?

Due to the vast array and diverse pool of emoji these days it is only fitting that developers can use these emoji as icons, and instead of said developers having to do most of the work manually, picking out the icons they want, you could use this library to pick out the icon set(s) applicable for your project.

This project will be kept up-to-date and include new emoji as the unicode & Twemoji spec is updated and currently follows version v13.1.

### Sample

In this repository will you find the library itself (core project and categories) and in addition a sample app (written in Compose) which implements each module and loads the icons into a `LazyGrid`. Just in case you don't want to go and run the sample yourself, he's a couple of screenshots:

<p align="center">
    <img
        src="https://user-images.githubusercontent.com/46483870/129178025-a9e03f94-0d8d-4326-95e1-07a468979ba6.png"
        width="200">
    <img
        src="https://user-images.githubusercontent.com/46483870/129178037-aaca733f-7e1a-4cdc-88c9-d5549d70480c.png"
        width="200">
    <img 
        src="https://user-images.githubusercontent.com/46483870/129178045-9f124e12-3482-4207-bdcf-6bccb1a598f0.png"
        width="200">
    <img 
        src="https://user-images.githubusercontent.com/46483870/129178056-37312d84-7d29-41f9-82c2-3a754fbdb891.png"
        width="200">
</p>

### Available categories

- Smileys & emotion
- People & body
- Animals & nature
- Food & drink
- Travel & places
- Activities
- Objects
- Symbols
- Flags

Alternatively you can visit the [Category](https://github.com/maxhvesser/twemoji-icons-android/blob/main/core/src/main/java/no/mhl/twemojiiconsandroid/core/model/Category.kt) and [Subcategory](https://github.com/maxhvesser/twemoji-icons-android/blob/main/core/src/main/java/no/mhl/twemojiiconsandroid/core/model/Subcategory.kt) classes respectively, but please not that subcategories are not publicly accessible at the moment.

## How to

The library is currently provided via [JitPack](https://jitpack.io/#maxhvesser/twemoji-icons-android) so first be sure that your project is already setup for accessing JitPack dependencies. 

### Current version

The latest version of twemoji-icons-android is `0.2.0`.

### Gradle

If you would like to have access to the entire icons set then you can simple add the following to your apps `build.gradle` file, in the dependencies closure:

```
implementation 'com.github.maxhvesser:twemoji-icons-android:0.2.0'
```

If you would however like access to specific categories then you would need to add the following: 

```Gradle
// Abstract the version to your root build.gradle
ext {
  ...
  twemoji_icons_version = '0.2.0'
}

// Continue with app build.gradle dependencies

...
// The core dependency must be present because this is where the model classes live
implementation "com.github.maxhvesser.twemoji-icons-android:core:$twemoji_icons_version"

// Next you can add the categories you want access to
implementation "com.github.maxhvesser.twemoji-icons-android:smileys:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:people:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:animals:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:food:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:travel:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:activities:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:objects:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:symbols:$twemoji_icons_version"
implementation "com.github.maxhvesser.twemoji-icons-android:flags:$twemoji_icons_version"

```

### Providers

Each category (module) has it's own providing class that is an object with statically defined references, these providers can be accessed via the following:

```Kotlin
SmileysAndEmotion.all
PeopleAndBody.all
AnimalsAndNature.all
FoodAndDrink.all
TravelAndPlaces.all
Activities.all
Objects.all
Symbols.all
Flags.all
```

Whereby each provider, provides a `List<EmojiIcon>`, `EmojiIcon` provides the following properties: 

```Kotlin
/**
* @property name A camelCase string representation of the emoji icon aka it's name
* @property unicode The unicode equivalent of the emoji icon
* @property category The belonging-to-category
* @property subcategory The belonging-to-subcategory
* @property font The font set, which in this case is always Twemoji
* @property resource The drawable reference statically defined in the provider class
*/
data class EmojiIcon(
    val name: String,
    val unicode: String,
    val category: TwemojiCategory,
    val subcategory: TwemojiSubcategory,
    val font: Font,
    @DrawableRes val resource: Int
)
```

## License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
