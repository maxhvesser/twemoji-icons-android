package no.mhl.twemojiiconsandroid.categories

import no.mhl.twemojiiconsandroid.R
import no.mhl.twemojiiconsandroid.core.model.TwemojiCategory
import no.mhl.twemojiiconsandroid.core.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.core.model.TwemojiSubcategory

internal object FoodAndDrinkProvider {

    // region All
    fun provideFoodAndDrink(): List<TwemojiIcon> = listOf(
        provideDishware(),
        provideDrinks(),
        provideAsian(),
        provideFruit(),
        provideMarine(),
        providePrepared(),
        provideSweets(),
        provideVegetables()
    ).flatten()
    // endregion

    // region Dishware
    fun provideDishware() = listOf(
        TwemojiIcon(plainName = "KitchenKnife", unicode = "1f52a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Dishware, resource = R.drawable.ic_1f52a),
        TwemojiIcon(plainName = "ForkAndKnife", unicode = "1f374", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Dishware, resource = R.drawable.ic_1f374),
        TwemojiIcon(plainName = "Amphora", unicode = "1f3fa", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Dishware, resource = R.drawable.ic_1f3fa),
        TwemojiIcon(plainName = "ForkAndKnifeWithPlate", unicode = "1f37d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Dishware, resource = R.drawable.ic_1f37d),
        TwemojiIcon(plainName = "Chopsticks", unicode = "1f962", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Dishware, resource = R.drawable.ic_1f962),
        TwemojiIcon(plainName = "Spoon", unicode = "1f944", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Dishware, resource = R.drawable.ic_1f944)
    )
    // endregion

    // region Drinks
    fun provideDrinks() = listOf(
        TwemojiIcon(plainName = "ClinkingBeerMugs", unicode = "1f37b", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f37b),
        TwemojiIcon(plainName = "HotBeverage", unicode = "2615", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_2615),
        TwemojiIcon(plainName = "BeerMug", unicode = "1f37a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f37a),
        TwemojiIcon(plainName = "WineGlass", unicode = "1f377", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f377),
        TwemojiIcon(plainName = "TropicalDrink", unicode = "1f379", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f379),
        TwemojiIcon(plainName = "CocktailGlass", unicode = "1f378", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f378),
        TwemojiIcon(plainName = "BabyBottle", unicode = "1f37c", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f37c),
        TwemojiIcon(plainName = "TeacupWithoutHandle", unicode = "1f375", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f375),
        TwemojiIcon(plainName = "BubbleTea", unicode = "1f9cb", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f9cb),
        TwemojiIcon(plainName = "Teapot", unicode = "1fad6", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1fad6),
        TwemojiIcon(plainName = "Sake", unicode = "1f376", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f376),
        TwemojiIcon(plainName = "BottleWithPoppingCork", unicode = "1f37e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f37e),
        TwemojiIcon(plainName = "GlassOfMilk", unicode = "1f95b", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f95b),
        TwemojiIcon(plainName = "ClinkingGlasses", unicode = "1f942", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f942),
        TwemojiIcon(plainName = "TumblerGlass", unicode = "1f943", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f943),
        TwemojiIcon(plainName = "CupWithStraw", unicode = "1f964", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f964),
        TwemojiIcon(plainName = "BeverageBox", unicode = "1f9c3", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f9c3),
        TwemojiIcon(plainName = "Mate", unicode = "1f9c9", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f9c9),
        TwemojiIcon(plainName = "Ice", unicode = "1f9ca", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.Drink, resource = R.drawable.ic_1f9ca)
    )
    // endregion

    // region Asian
    fun provideAsian() = listOf(
        TwemojiIcon(plainName = "Spaghetti", unicode = "1f35d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f35d),
        TwemojiIcon(plainName = "FishCakeWithSwirl", unicode = "1f365", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f365),
        TwemojiIcon(plainName = "SteamingBowl", unicode = "1f35c", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f35c),
        TwemojiIcon(plainName = "BentoBox", unicode = "1f371", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f371),
        TwemojiIcon(plainName = "CookedRice", unicode = "1f35a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f35a),
        TwemojiIcon(plainName = "FriedShrimp", unicode = "1f364", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f364),
        TwemojiIcon(plainName = "Sushi", unicode = "1f363", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f363),
        TwemojiIcon(plainName = "CurryRice", unicode = "1f35b", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f35b),
        TwemojiIcon(plainName = "Dango", unicode = "1f361", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f361),
        TwemojiIcon(plainName = "RiceBall", unicode = "1f359", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f359),
        TwemojiIcon(plainName = "Oden", unicode = "1f362", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f362),
        TwemojiIcon(plainName = "RoastedSweetPotato", unicode = "1f360", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f360),
        TwemojiIcon(plainName = "RiceCracker", unicode = "1f358", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f358),
        TwemojiIcon(plainName = "MoonCake", unicode = "1f96e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f96e),
        TwemojiIcon(plainName = "Dumpling", unicode = "1f95f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f95f),
        TwemojiIcon(plainName = "FortuneCookie", unicode = "1f960", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f960),
        TwemojiIcon(plainName = "TakeoutBox", unicode = "1f961", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodAsian, resource = R.drawable.ic_1f961)
    )
    // endregion

    // region Fruit
    fun provideFruit() = listOf(
        TwemojiIcon(plainName = "Strawberry", unicode = "1f353", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f353),
        TwemojiIcon(plainName = "Banana", unicode = "1f34c", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f34c),
        TwemojiIcon(plainName = "Watermelon", unicode = "1f349", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f349),
        TwemojiIcon(plainName = "Peach", unicode = "1f351", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f351),
        TwemojiIcon(plainName = "Cherries", unicode = "1f352", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f352),
        TwemojiIcon(plainName = "Pineapple", unicode = "1f34d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f34d),
        TwemojiIcon(plainName = "Grapes", unicode = "1f347", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f347),
        TwemojiIcon(plainName = "RedApple", unicode = "1f34e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f34e),
        TwemojiIcon(plainName = "Tangerine", unicode = "1f34a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f34a),
        TwemojiIcon(plainName = "Lemon", unicode = "1f34b", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f34b),
        TwemojiIcon(plainName = "GreenApple", unicode = "1f34f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f34f),
        TwemojiIcon(plainName = "Tomato", unicode = "1f345", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f345),
        TwemojiIcon(plainName = "Pear", unicode = "1f350", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f350),
        TwemojiIcon(plainName = "Melon", unicode = "1f348", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f348),
        TwemojiIcon(plainName = "Mango", unicode = "1f96d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f96d),
        TwemojiIcon(plainName = "KiwiFruit", unicode = "1f95d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f95d),
        TwemojiIcon(plainName = "Blueberries", unicode = "1fad0", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1fad0),
        TwemojiIcon(plainName = "BellPepper", unicode = "1fad1", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1fad1),
        TwemojiIcon(plainName = "Olive", unicode = "1fad2", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1fad2),
        TwemojiIcon(plainName = "Coconut", unicode = "1f965", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodFruit, resource = R.drawable.ic_1f965)
    )
    // endregion

    // region Marine
    fun provideMarine() = listOf(
        TwemojiIcon(plainName = "Crab", unicode = "1f980", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodMarine, resource = R.drawable.ic_1f980),
        TwemojiIcon(plainName = "Lobster", unicode = "1f99e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodMarine, resource = R.drawable.ic_1f99e),
        TwemojiIcon(plainName = "Shrimp", unicode = "1f990", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodMarine, resource = R.drawable.ic_1f990),
        TwemojiIcon(plainName = "Squid", unicode = "1f991", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodMarine, resource = R.drawable.ic_1f991),
        TwemojiIcon(plainName = "Oyster", unicode = "1f9aa", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodMarine, resource = R.drawable.ic_1f9aa)
    )
    // endregion

    // region Prepared
    fun providePrepared() = listOf(
        TwemojiIcon(plainName = "Pizza", unicode = "1f355", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f355),
        TwemojiIcon(plainName = "FrenchFries", unicode = "1f35f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f35f),
        TwemojiIcon(plainName = "Hamburger", unicode = "1f354", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f354),
        TwemojiIcon(plainName = "PoultryLeg", unicode = "1f357", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f357),
        TwemojiIcon(plainName = "Cooking", unicode = "1f373", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f373),
        TwemojiIcon(plainName = "Bread", unicode = "1f35e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f35e),
        TwemojiIcon(plainName = "FlatBread", unicode = "1fad3", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1fad3),
        TwemojiIcon(plainName = "MeatOnBone", unicode = "1f356", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f356),
        TwemojiIcon(plainName = "PotOfFood", unicode = "1f372", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f372),
        TwemojiIcon(plainName = "CheeseWedge", unicode = "1f9c0", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f9c0),
        TwemojiIcon(plainName = "Popcorn", unicode = "1f37f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f37f),
        TwemojiIcon(plainName = "Burrito", unicode = "1f32f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f32f),
        TwemojiIcon(plainName = "Taco", unicode = "1f32e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f32e),
        TwemojiIcon(plainName = "HotDog", unicode = "1f32d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f32d),
        TwemojiIcon(plainName = "Egg", unicode = "1f95a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f95a),
        TwemojiIcon(plainName = "Croissant", unicode = "1f950", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f950),
        TwemojiIcon(plainName = "BaguetteBread", unicode = "1f956", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f956),
        TwemojiIcon(plainName = "Pretzel", unicode = "1f968", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f968),
        TwemojiIcon(plainName = "Bagel", unicode = "1f96f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f96f),
        TwemojiIcon(plainName = "Pancakes", unicode = "1f95e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f95e),
        TwemojiIcon(plainName = "Waffle", unicode = "1f9c7", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f9c7),
        TwemojiIcon(plainName = "CutOfMeat", unicode = "1f969", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f969),
        TwemojiIcon(plainName = "Bacon", unicode = "1f953", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f953),
        TwemojiIcon(plainName = "Sandwich", unicode = "1f96a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f96a),
        TwemojiIcon(plainName = "StuffedFlatbread", unicode = "1f959", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f959),
        TwemojiIcon(plainName = "Falafel", unicode = "1f9c6", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f9c6),
        TwemojiIcon(plainName = "ShallowPanOfFood", unicode = "1f958", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f958),
        TwemojiIcon(plainName = "BowlWithSpoon", unicode = "1f963", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f963),
        TwemojiIcon(plainName = "GreenSalad", unicode = "1f957", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f957),
        TwemojiIcon(plainName = "Butter", unicode = "1f9c8", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f9c8),
        TwemojiIcon(plainName = "Salt", unicode = "1f9c2", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f9c2),
        TwemojiIcon(plainName = "Tamale", unicode = "1fad4", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1fad4),
        TwemojiIcon(plainName = "Fondue", unicode = "1fad5", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1fad5),
        TwemojiIcon(plainName = "CannedFood", unicode = "1f96b", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodPrepared, resource = R.drawable.ic_1f96b)
    )
    // endregion

    // region Sweets
    fun provideSweets() = listOf(
        TwemojiIcon(plainName = "BirthdayCake", unicode = "1f382", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f382),
        TwemojiIcon(plainName = "Doughnut", unicode = "1f369", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f369),
        TwemojiIcon(plainName = "Lollipop", unicode = "1f36d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f36d),
        TwemojiIcon(plainName = "Candy", unicode = "1f36c", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f36c),
        TwemojiIcon(plainName = "SoftIceCream", unicode = "1f366", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f366),
        TwemojiIcon(plainName = "ChocolateBar", unicode = "1f36b", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f36b),
        TwemojiIcon(plainName = "Shortcake", unicode = "1f370", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f370),
        TwemojiIcon(plainName = "Cookie", unicode = "1f36a", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f36a),
        TwemojiIcon(plainName = "ShavedIce", unicode = "1f367", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f367),
        TwemojiIcon(plainName = "IceCream", unicode = "1f368", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f368),
        TwemojiIcon(plainName = "HoneyPot", unicode = "1f36f", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f36f),
        TwemojiIcon(plainName = "Custard", unicode = "1f36e", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f36e),
        TwemojiIcon(plainName = "Cupcake", unicode = "1f9c1", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f9c1),
        TwemojiIcon(plainName = "Pie", unicode = "1f967", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodSweet, resource = R.drawable.ic_1f967)
    )
    // endregion

    // region Vegetables
    fun provideVegetables() = listOf(
        TwemojiIcon(plainName = "Eggplant", unicode = "1f346", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f346),
        TwemojiIcon(plainName = "Mushroom", unicode = "1f344", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f344),
        TwemojiIcon(plainName = "EarOfCorn", unicode = "1f33d", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f33d),
        TwemojiIcon(plainName = "Chestnut", unicode = "1f330", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f330),
        TwemojiIcon(plainName = "HotPepper", unicode = "1f336", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f336),
        TwemojiIcon(plainName = "Avocado", unicode = "1f951", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f951),
        TwemojiIcon(plainName = "Potato", unicode = "1f954", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f954),
        TwemojiIcon(plainName = "Carrot", unicode = "1f955", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f955),
        TwemojiIcon(plainName = "Cucumber", unicode = "1f952", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f952),
        TwemojiIcon(plainName = "LeafyGreen", unicode = "1f96c", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f96c),
        TwemojiIcon(plainName = "Broccoli", unicode = "1f966", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f966),
        TwemojiIcon(plainName = "Garlic", unicode = "1f9c4", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f9c4),
        TwemojiIcon(plainName = "Onion", unicode = "1f9c5", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f9c5),
        TwemojiIcon(plainName = "Peanuts", unicode = "1f95c", category = TwemojiCategory.FoodAndDrink, subcategory = TwemojiSubcategory.FoodVegetable, resource = R.drawable.ic_1f95c)
    )
    // endregion

}