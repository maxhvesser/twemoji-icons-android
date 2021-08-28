package no.mhl.twemojiiconsandroid.animals

import no.mhl.twemojiiconsandroid.core.model.Category
import no.mhl.twemojiiconsandroid.core.model.EmojiIcon
import no.mhl.twemojiiconsandroid.core.model.Font
import no.mhl.twemojiiconsandroid.core.model.Subcategory

object AnimalsAndNature {

    // region Animal mammal
    private val animalMammal: List<EmojiIcon> = listOf(
        EmojiIcon("MonkeyFace", "1f435", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f435),
        EmojiIcon("Monkey", "1f412", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f412),
        EmojiIcon("Gorilla", "1f98d", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f98d),
        EmojiIcon("Orangutan", "1f9a7", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9a7),
        EmojiIcon("DogFace", "1f436", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f436),
        EmojiIcon("Dog", "1f415", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f415),
        EmojiIcon("GuideDog", "1f9ae", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9ae),
        EmojiIcon("ServiceDog", "1f415-200d-1f9ba", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f415_200d_1f9ba),
        EmojiIcon("Poodle", "1f429", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f429),
        EmojiIcon("Wolf", "1f43a", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43a),
        EmojiIcon("Fox", "1f98a", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f98a),
        EmojiIcon("Raccoon", "1f99d", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f99d),
        EmojiIcon("CatFace", "1f431", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f431),
        EmojiIcon("Cat", "1f408", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f408),
        EmojiIcon("BlackCat", "1f408-200d-2b1b", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f408_200d_2b1b),
        EmojiIcon("Lion", "1f981", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f981),
        EmojiIcon("TigerFace", "1f42f", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f42f),
        EmojiIcon("Tiger", "1f405", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f405),
        EmojiIcon("Leopard", "1f406", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f406),
        EmojiIcon("HorseFace", "1f434", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f434),
        EmojiIcon("Horse", "1f40e", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f40e),
        EmojiIcon("Unicorn", "1f984", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f984),
        EmojiIcon("Zebra", "1f993", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f993),
        EmojiIcon("Deer", "1f98c", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f98c),
        EmojiIcon("Bison", "1f9ac", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9ac),
        EmojiIcon("CowFace", "1f42e", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f42e),
        EmojiIcon("Ox", "1f402", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f402),
        EmojiIcon("WaterBuffalo", "1f403", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f403),
        EmojiIcon("Cow", "1f404", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f404),
        EmojiIcon("PigFace", "1f437", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f437),
        EmojiIcon("Pig", "1f416", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f416),
        EmojiIcon("Boar", "1f417", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f417),
        EmojiIcon("PigNose", "1f43d", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43d),
        EmojiIcon("Ram", "1f40f", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f40f),
        EmojiIcon("Ewe", "1f411", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f411),
        EmojiIcon("Goat", "1f410", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f410),
        EmojiIcon("Camel", "1f42a", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f42a),
        EmojiIcon("TwoHumpCamel", "1f42b", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f42b),
        EmojiIcon("Llama", "1f999", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f999),
        EmojiIcon("Giraffe", "1f992", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f992),
        EmojiIcon("Elephant", "1f418", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f418),
        EmojiIcon("Mammoth", "1f9a3", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9a3),
        EmojiIcon("Rhinoceros", "1f98f", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f98f),
        EmojiIcon("Hippopotamus", "1f99b", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f99b),
        EmojiIcon("MouseFace", "1f42d", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f42d),
        EmojiIcon("Mouse", "1f401", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f401),
        EmojiIcon("Rat", "1f400", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f400),
        EmojiIcon("Hamster", "1f439", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f439),
        EmojiIcon("RabbitFace", "1f430", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f430),
        EmojiIcon("Rabbit", "1f407", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f407),
        EmojiIcon("Chipmunk", "1f43f", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43f),
        EmojiIcon("Beaver", "1f9ab", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9ab),
        EmojiIcon("Hedgehog", "1f994", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f994),
        EmojiIcon("Bat", "1f987", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f987),
        EmojiIcon("Bear", "1f43b", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43b),
        EmojiIcon("PolarBear", "1f43b-200d-2744-fe0f", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43b_200d_2744_fe0f),
        EmojiIcon("Koala", "1f428", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f428),
        EmojiIcon("Panda", "1f43c", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43c),
        EmojiIcon("Sloth", "1f9a5", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9a5),
        EmojiIcon("Otter", "1f9a6", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9a6),
        EmojiIcon("Skunk", "1f9a8", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9a8),
        EmojiIcon("Kangaroo", "1f998", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f998),
        EmojiIcon("Badger", "1f9a1", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f9a1),
        EmojiIcon("PawPrints", "1f43e", Category.AnimalsAndNature, Subcategory.AnimalMammal, Font.Twemoji, R.drawable.ic_1f43e)
    )
    // endregion

    // region Animal bird
    private val animalBird: List<EmojiIcon> = listOf(
        EmojiIcon("Turkey", "1f983", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f983),
        EmojiIcon("Chicken", "1f414", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f414),
        EmojiIcon("Rooster", "1f413", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f413),
        EmojiIcon("HatchingChick", "1f423", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f423),
        EmojiIcon("BabyChick", "1f424", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f424),
        EmojiIcon("FrontFacingBabyChick", "1f425", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f425),
        EmojiIcon("Bird", "1f426", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f426),
        EmojiIcon("Penguin", "1f427", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f427),
        EmojiIcon("Dove", "1f54a", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f54a),
        EmojiIcon("Eagle", "1f985", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f985),
        EmojiIcon("Duck", "1f986", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f986),
        EmojiIcon("Swan", "1f9a2", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f9a2),
        EmojiIcon("Owl", "1f989", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f989),
        EmojiIcon("Dodo", "1f9a4", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f9a4),
        EmojiIcon("Feather", "1fab6", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1fab6),
        EmojiIcon("Flamingo", "1f9a9", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f9a9),
        EmojiIcon("Peacock", "1f99a", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f99a),
        EmojiIcon("Parrot", "1f99c", Category.AnimalsAndNature, Subcategory.AnimalBird, Font.Twemoji, R.drawable.ic_1f99c)
    )
    // endregion

    // region Animal amphibian
    private val animalAmphibian: List<EmojiIcon> = listOf(
        EmojiIcon("Frog", "1f438", Category.AnimalsAndNature, Subcategory.AnimalAmphibian, Font.Twemoji, R.drawable.ic_1f438)
    )
    // endregion

    // region Animal reptile
    private val animalReptile: List<EmojiIcon> = listOf(
        EmojiIcon("Crocodile", "1f40a", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f40a),
        EmojiIcon("Turtle", "1f422", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f422),
        EmojiIcon("Lizard", "1f98e", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f98e),
        EmojiIcon("Snake", "1f40d", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f40d),
        EmojiIcon("DragonFace", "1f432", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f432),
        EmojiIcon("Dragon", "1f409", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f409),
        EmojiIcon("Sauropod", "1f995", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f995),
        EmojiIcon("TRex", "1f996", Category.AnimalsAndNature, Subcategory.AnimalReptile, Font.Twemoji, R.drawable.ic_1f996)
    )
    // endregion

    // region Animal marine
    private val animalMarine: List<EmojiIcon> = listOf(
        EmojiIcon("SpoutingWhale", "1f433", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f433),
        EmojiIcon("Whale", "1f40b", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f40b),
        EmojiIcon("Dolphin", "1f42c", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f42c),
        EmojiIcon("Seal", "1f9ad", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f9ad),
        EmojiIcon("Fish", "1f41f", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f41f),
        EmojiIcon("TropicalFish", "1f420", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f420),
        EmojiIcon("Blowfish", "1f421", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f421),
        EmojiIcon("Shark", "1f988", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f988),
        EmojiIcon("Octopus", "1f419", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f419),
        EmojiIcon("SpiralShell", "1f41a", Category.AnimalsAndNature, Subcategory.AnimalMarine, Font.Twemoji, R.drawable.ic_1f41a)
    )
    // endregion

    // region All
    val all: List<EmojiIcon> = listOf(
        animalMammal,
        animalBird,
        animalAmphibian,
        animalReptile,
        animalMarine
    ).flatten()
    // endregion

}