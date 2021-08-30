package no.mhl.twemojiiconsandroid.food

import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Font
import no.mhl.twemojiiconsandroid.core.model.Subcategory

object FoodAndDrink {

    // region Food fruit
    private val foodFruit: List<EmojiIcon> = listOf(
        EmojiIcon("Grapes", "1f347", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f347),
        EmojiIcon("Melon", "1f348", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f348),
        EmojiIcon("Watermelon", "1f349", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f349),
        EmojiIcon("Tangerine", "1f34a", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f34a),
        EmojiIcon("Lemon", "1f34b", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f34b),
        EmojiIcon("Banana", "1f34c", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f34c),
        EmojiIcon("Pineapple", "1f34d", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f34d),
        EmojiIcon("Mango", "1f96d", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f96d),
        EmojiIcon("RedApple", "1f34e", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f34e),
        EmojiIcon("GreenApple", "1f34f", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f34f),
        EmojiIcon("Pear", "1f350", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f350),
        EmojiIcon("Peach", "1f351", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f351),
        EmojiIcon("Cherries", "1f352", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f352),
        EmojiIcon("Strawberry", "1f353", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f353),
        EmojiIcon("Blueberries", "1fad0", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1fad0),
        EmojiIcon("KiwiFruit", "1f95d", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f95d),
        EmojiIcon("Tomato", "1f345", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f345),
        EmojiIcon("Olive", "1fad2", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1fad2),
        EmojiIcon("Coconut", "1f965", Category.FoodAndDrink, Subcategory.FoodFruit, Font.Twemoji, R.drawable.ic_1f965)
    )
    // endregion

    // region Food vegetable
    private val foodVegetable: List<EmojiIcon> = listOf(
        EmojiIcon("Avocado", "1f951", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f951),
        EmojiIcon("Eggplant", "1f346", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f346),
        EmojiIcon("Potato", "1f954", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f954),
        EmojiIcon("Carrot", "1f955", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f955),
        EmojiIcon("EarOfCorn", "1f33d", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f33d),
        EmojiIcon("HotPepper", "1f336", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f336),
        EmojiIcon("BellPepper", "1fad1", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1fad1),
        EmojiIcon("Cucumber", "1f952", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f952),
        EmojiIcon("LeafyGreen", "1f96c", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f96c),
        EmojiIcon("Broccoli", "1f966", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f966),
        EmojiIcon("Garlic", "1f9c4", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f9c4),
        EmojiIcon("Onion", "1f9c5", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f9c5),
        EmojiIcon("Mushroom", "1f344", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f344),
        EmojiIcon("Peanuts", "1f95c", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f95c),
        EmojiIcon("Chestnut", "1f330", Category.FoodAndDrink, Subcategory.FoodVegetable, Font.Twemoji, R.drawable.ic_1f330)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        foodFruit,
        foodVegetable
    ).flatten()
    // endregion

}