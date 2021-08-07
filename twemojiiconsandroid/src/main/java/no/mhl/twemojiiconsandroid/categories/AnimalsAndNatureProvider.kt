package no.mhl.twemojiiconsandroid.categories

import no.mhl.twemojiiconsandroid.R
import no.mhl.twemojiiconsandroid.core.model.TwemojiCategory
import no.mhl.twemojiiconsandroid.core.model.TwemojiIcon
import no.mhl.twemojiiconsandroid.core.model.TwemojiSubcategory

internal object AnimalsAndNatureProvider {

    // region All
    fun provideAnimalsAndNature(): List<TwemojiIcon> = listOf(
        provideAmphibian(),
        provideBirds(),
        provideBugs(),
        provideMammals(),
        provideMarine(),
        provideReptiles(),
        provideFlowers(),
        provideOthers()
    ).flatten()
    // endregion

    // region Amphibians
    fun provideAmphibian() = listOf(
        TwemojiIcon(plainName = "Frog", unicode = "1f438", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalAmphibian, resource = R.drawable.ic_1f438)
    )
    // endregion

    // region Birds
    fun provideBirds() = listOf(
        TwemojiIcon(plainName = "Penguin", unicode = "1f427", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f427),
        TwemojiIcon(plainName = "HatchingChick", unicode = "1f423", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f423),
        TwemojiIcon(plainName = "FrontFacingBabyChick", unicode = "1f425", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f425),
        TwemojiIcon(plainName = "Bird", unicode = "1f426", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f426),
        TwemojiIcon(plainName = "Chicken", unicode = "1f414", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f414),
        TwemojiIcon(plainName = "BabyChick", unicode = "1f424", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f424),
        TwemojiIcon(plainName = "Rooster", unicode = "1f413", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f413),
        TwemojiIcon(plainName = "Turkey", unicode = "1f983", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f983),
        TwemojiIcon(plainName = "Dove", unicode = "1f54a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f54a),
        TwemojiIcon(plainName = "Eagle", unicode = "1f985", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f985),
        TwemojiIcon(plainName = "Duck", unicode = "1f986", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f986),
        TwemojiIcon(plainName = "Swan", unicode = "1f9a2", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f9a2),
        TwemojiIcon(plainName = "Owl", unicode = "1f989", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f989),
        TwemojiIcon(plainName = "Flamingo", unicode = "1f9a9", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f9a9),
        TwemojiIcon(plainName = "Dodo", unicode = "1f9a4", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f9a4),
        TwemojiIcon(plainName = "Peacock", unicode = "1f99a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f99a),
        TwemojiIcon(plainName = "Feather", unicode = "1fab6", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1fab6),
        TwemojiIcon(plainName = "Parrot", unicode = "1f99c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBird, resource = R.drawable.ic_1f99c)
    )
    // endregion

    // region Bugs
    fun provideBugs() = listOf(
        TwemojiIcon(plainName = "Honeybee", unicode = "1f41d", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f41d),
        TwemojiIcon(plainName = "Bug", unicode = "1f41b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f41b),
        TwemojiIcon(plainName = "LadyBeetle", unicode = "1f41e", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f41e),
        TwemojiIcon(plainName = "Ant", unicode = "1f41c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f41c),
        TwemojiIcon(plainName = "Snail", unicode = "1f40c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f40c),
        TwemojiIcon(plainName = "Scorpion", unicode = "1f982", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f982),
        TwemojiIcon(plainName = "SpiderWeb", unicode = "1f578", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f578),
        TwemojiIcon(plainName = "Spider", unicode = "1f577", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f577),
        TwemojiIcon(plainName = "Butterfly", unicode = "1f98b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f98b),
        TwemojiIcon(plainName = "Cricket", unicode = "1f997", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f997),
        TwemojiIcon(plainName = "Mosquito", unicode = "1f99f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f99f),
        TwemojiIcon(plainName = "Fly", unicode = "1fab0", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1fab0),
        TwemojiIcon(plainName = "Worm", unicode = "1fab1", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1fab1),
        TwemojiIcon(plainName = "Beetle", unicode = "1fab2", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1fab2),
        TwemojiIcon(plainName = "Cockroach", unicode = "1fab3", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1fab3),
        TwemojiIcon(plainName = "Microbe", unicode = "1f9a0", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalBug, resource = R.drawable.ic_1f9a0)
    )
    // endregion

    // region Mammals
    fun provideMammals() = listOf(
        TwemojiIcon(plainName = "DogFace", unicode = "1f436", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f436),
        TwemojiIcon(plainName = "CatFace", unicode = "1f431", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f431),
        TwemojiIcon(plainName = "PigFace", unicode = "1f437", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f437),
        TwemojiIcon(plainName = "Panda", unicode = "1f43c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43c),
        TwemojiIcon(plainName = "PawPrints", unicode = "1f43e", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43e),
        TwemojiIcon(plainName = "RabbitFace", unicode = "1f430", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f430),
        TwemojiIcon(plainName = "Bear", unicode = "1f43b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43b),
        TwemojiIcon(plainName = "PolarBear", unicode = "1f43b-200d-2744-fe0f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43b_200d_2744_fe0f),
        TwemojiIcon(plainName = "TigerFace", unicode = "1f42f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f42f),
        TwemojiIcon(plainName = "Monkey", unicode = "1f412", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f412),
        TwemojiIcon(plainName = "Elephant", unicode = "1f418", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f418),
        TwemojiIcon(plainName = "Mammoth", unicode = "1f9a3", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9a3),
        TwemojiIcon(plainName = "Goat", unicode = "1f410", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f410),
        TwemojiIcon(plainName = "PigNose", unicode = "1f43d", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43d),
        TwemojiIcon(plainName = "Koala", unicode = "1f428", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f428),
        TwemojiIcon(plainName = "HorseFace", unicode = "1f434", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f434),
        TwemojiIcon(plainName = "MonkeyFace", unicode = "1f435", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f435),
        TwemojiIcon(plainName = "Wolf", unicode = "1f43a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43a),
        TwemojiIcon(plainName = "CowFace", unicode = "1f42e", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f42e),
        TwemojiIcon(plainName = "Hamster", unicode = "1f439", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f439),
        TwemojiIcon(plainName = "MouseFace", unicode = "1f42d", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f42d),
        TwemojiIcon(plainName = "Ewe", unicode = "1f411", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f411),
        TwemojiIcon(plainName = "Horse", unicode = "1f40e", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f40e),
        TwemojiIcon(plainName = "Rabbit", unicode = "1f407", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f407),
        TwemojiIcon(plainName = "Dog", unicode = "1f415", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f415),
        TwemojiIcon(plainName = "Cat", unicode = "1f408", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f408),
        TwemojiIcon(plainName = "BlackCat", unicode = "1f408-200d-2b1b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f408_200d_2b1b),
        TwemojiIcon(plainName = "Poodle", unicode = "1f429", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f429),
        TwemojiIcon(plainName = "TwoHumpCamel", unicode = "1f42b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f42b),
        TwemojiIcon(plainName = "Camel", unicode = "1f42a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f42a),
        TwemojiIcon(plainName = "Cow", unicode = "1f404", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f404),
        TwemojiIcon(plainName = "Pig", unicode = "1f416", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f416),
        TwemojiIcon(plainName = "Rat", unicode = "1f400", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f400),
        TwemojiIcon(plainName = "Ram", unicode = "1f40f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f40f),
        TwemojiIcon(plainName = "Tiger", unicode = "1f405", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f405),
        TwemojiIcon(plainName = "Boar", unicode = "1f417", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f417),
        TwemojiIcon(plainName = "Ox", unicode = "1f402", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f402),
        TwemojiIcon(plainName = "Leopard", unicode = "1f406", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f406),
        TwemojiIcon(plainName = "WaterBuffalo", unicode = "1f403", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f403),
        TwemojiIcon(plainName = "Bison", unicode = "1f9ac", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9ac),
        TwemojiIcon(plainName = "Mouse", unicode = "1f401", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f401),
        TwemojiIcon(plainName = "Unicorn", unicode = "1f984", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f984),
        TwemojiIcon(plainName = "Lion", unicode = "1f981", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f981),
        TwemojiIcon(plainName = "Chipmunk", unicode = "1f43f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f43f),
        TwemojiIcon(plainName = "Beaver", unicode = "1f9ab", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9ab),
        TwemojiIcon(plainName = "Gorilla", unicode = "1f98d", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f98d),
        TwemojiIcon(plainName = "Orangutan", unicode = "1f9a7", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9a7),
        TwemojiIcon(plainName = "GuideDog", unicode = "1f9ae", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9ae),
        TwemojiIcon(plainName = "ServiceDog", unicode = "1f415-200d-1f9ba", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f415_200d_1f9ba),
        TwemojiIcon(plainName = "Fox", unicode = "1f98a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f98a),
        TwemojiIcon(plainName = "Raccoon", unicode = "1f99d", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f99d),
        TwemojiIcon(plainName = "Zebra", unicode = "1f993", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f993),
        TwemojiIcon(plainName = "Deer", unicode = "1f98c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f98c),
        TwemojiIcon(plainName = "Llama", unicode = "1f999", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f999),
        TwemojiIcon(plainName = "Giraffe", unicode = "1f992", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f992),
        TwemojiIcon(plainName = "Rhinoceros", unicode = "1f98f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f98f),
        TwemojiIcon(plainName = "Hippopotamus", unicode = "1f99b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f99b),
        TwemojiIcon(plainName = "Hedgehog", unicode = "1f994", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f994),
        TwemojiIcon(plainName = "Bat", unicode = "1f987", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f987),
        TwemojiIcon(plainName = "Sloth", unicode = "1f9a5", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9a5),
        TwemojiIcon(plainName = "Otter", unicode = "1f9a6", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9a6),
        TwemojiIcon(plainName = "Skunk", unicode = "1f9a8", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9a8),
        TwemojiIcon(plainName = "Kangaroo", unicode = "1f998", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f998),
        TwemojiIcon(plainName = "Badger", unicode = "1f9a1", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMammal, resource = R.drawable.ic_1f9a1)
    )
    // endregion

    // region Marine
    fun provideMarine() = listOf(
        TwemojiIcon(plainName = "Octopus", unicode = "1f419", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f419),
        TwemojiIcon(plainName = "SpoutingWhale", unicode = "1f433", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f433),
        TwemojiIcon(plainName = "Dolphin", unicode = "1f42c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f42c),
        TwemojiIcon(plainName = "TropicalFish", unicode = "1f420", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f420),
        TwemojiIcon(plainName = "Fish", unicode = "1f41f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f41f),
        TwemojiIcon(plainName = "Whale", unicode = "1f40b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f40b),
        TwemojiIcon(plainName = "SpiralShell", unicode = "1f41a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f41a),
        TwemojiIcon(plainName = "Blowfish", unicode = "1f421", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f421),
        TwemojiIcon(plainName = "Seal", unicode = "1f9ad", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f9ad),
        TwemojiIcon(plainName = "Shark", unicode = "1f988", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalMarine, resource = R.drawable.ic_1f988)
    )
    // endregion

    // region Reptiles
    fun provideReptiles() = listOf(
        TwemojiIcon(plainName = "Snake", unicode = "1f40d", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f40d),
        TwemojiIcon(plainName = "Turtle", unicode = "1f422", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f422),
        TwemojiIcon(plainName = "Dragon", unicode = "1f409", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f409),
        TwemojiIcon(plainName = "Crocodile", unicode = "1f40a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f40a),
        TwemojiIcon(plainName = "DragonFace", unicode = "1f432", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f432),
        TwemojiIcon(plainName = "Lizard", unicode = "1f98e", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f98e),
        TwemojiIcon(plainName = "Sauropod", unicode = "1f995", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f995),
        TwemojiIcon(plainName = "TRex", unicode = "1f996", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.AnimalReptile, resource = R.drawable.ic_1f996)
    )
    // endregion

    // region Flowers
    fun provideFlowers() = listOf(
        TwemojiIcon(plainName = "CherryBlossom", unicode = "1f338", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f338),
        TwemojiIcon(plainName = "Rose", unicode = "1f339", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f339),
        TwemojiIcon(plainName = "Hibiscus", unicode = "1f33a", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f33a),
        TwemojiIcon(plainName = "Sunflower", unicode = "1f33b", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f33b),
        TwemojiIcon(plainName = "Bouquet", unicode = "1f490", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f490),
        TwemojiIcon(plainName = "Tulip", unicode = "1f337", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f337),
        TwemojiIcon(plainName = "Blossom", unicode = "1f33c", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f33c),
        TwemojiIcon(plainName = "WhiteFlower", unicode = "1f4ae", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f4ae),
        TwemojiIcon(plainName = "Rosette", unicode = "1f3f5", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f3f5),
        TwemojiIcon(plainName = "WiltedFlower", unicode = "1f940", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantFlower, resource = R.drawable.ic_1f940)
    )
    // endregion

    // region Others
    fun provideOthers() = listOf(
        TwemojiIcon(plainName = "LeafFlutteringInWind", unicode = "1f343", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f343),
        TwemojiIcon(plainName = "FourLeafClover", unicode = "1f340", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f340),
        TwemojiIcon(plainName = "PalmTree", unicode = "1f334", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f334),
        TwemojiIcon(plainName = "Herb", unicode = "1f33f", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f33f),
        TwemojiIcon(plainName = "FallenLeaf", unicode = "1f342", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f342),
        TwemojiIcon(plainName = "Cactus", unicode = "1f335", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f335),
        TwemojiIcon(plainName = "MapleLeaf", unicode = "1f341", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f341),
        TwemojiIcon(plainName = "SheafOfRice", unicode = "1f33e", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f33e),
        TwemojiIcon(plainName = "Seedling", unicode = "1f331", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f331),
        TwemojiIcon(plainName = "EvergreenTree", unicode = "1f332", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f332),
        TwemojiIcon(plainName = "DeciduousTree", unicode = "1f333", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1f333),
        TwemojiIcon(plainName = "Rock", unicode = "1faa8", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1faa8),
        TwemojiIcon(plainName = "PottedPlant", unicode = "1fab4", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1fab4),
        TwemojiIcon(plainName = "Wood", unicode = "1fab5", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_1fab5),
        TwemojiIcon(plainName = "Shamrock", unicode = "2618", category = TwemojiCategory.AnimalsAndNature, subcategory = TwemojiSubcategory.PlantOther, resource = R.drawable.ic_2618)
    )
    // endregion

}