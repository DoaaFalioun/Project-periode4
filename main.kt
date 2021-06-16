fun main() {
//    val astronaut = Player("astronaut",2, 1,2)
//    astronaut.show()
//
//    val baksteen = Weapon("Baksteen", 15)
//    astronaut.weapon = baksteen
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
//
//    val mb5 = Weapon("mb5",18)
//    astronaut.weapon = mb5
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
//
//    val mb7 = Weapon("mb7",20)
//    astronaut.weapon = mb7
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
//
//    val mb4 = Weapon("mb4",20)
//    astronaut.weapon = mb4
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
////
//    val akm = Weapon("akm",40)
//    astronaut.weapon = akm
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
//
//    val flamethrower = Weapon("flamethrower",20)
//    astronaut.weapon = flamethrower
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
//
//    val gerande = Weapon("gerande",20)
//    astronaut.weapon = gerande
//    println(astronaut.weapon.name)
//    println(astronaut.weapon.damageInflicted)
//
//        val num1 = "baksteen"
//        val num2 = "akm"
//        val num3 = "mb4"
//
//    val Vampire = Enemy("Vampire", 20, 2)
//    println(Vampire)
//
//    Vampire.takeDamage(40)
//    println(Vampire)
//
//    val king= Dead("king",30,1)
//    println(king)
//
//    var lives = 2
//
//    fun show() {
//        if (lives < 1) {
//            println("Game over")
//        } else {
//            println("your are still alive")
//        }
//    }
//
//
//    val diamondArmor = Loot("Diamond Armor", LootType.ARMOR, 12.00)
//    astronaut.inventory.add(diamondArmor)
//    astronaut.showInventory()
//
//    println(astronaut)
//
//    val regenerator = Zombi("Regenerator", 18,2)
//    println(regenerator)
//    regenerator.takeDamage(12)
//    println(regenerator)

    fun heroselect() {
        println(
            "1. astronaut ⋆｡ﾟ☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆✌️(^◞^)✌️⋆｡ﾟ☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆\n" +
                    "2. warriorGirl ├┬┴┬┴{~_^}✌ ┬┴┬┴┤ \n" +
                    "3. soldat [̂•̮•̂] ✌ 三二一 \n"
        )
    }

    fun dead() {
        println("Sorry but you are dead")
    }

    fun storyline1() {

        println("10 years ago before ale of this began, i had a normal life and happy")
        println("But a bad science project chanced everything and made everyone into a Zombie")
        println("And the only way to stay alive was to come to space but not everyone made it ")
        println("There is only 25% of ..?.. alive")
        println("Today is the 10th anniversary that we came to space, that right 10 years living in space")
        println("I think that earth is dead and everyone there is a zombie because no one send ons a signal")
        println("Press '2' to continue\n")
    }

    fun storyline2() {
        println("Little did we know that we are going to die to ")
        println("Our oxygen is almost empty and we have to do something before that the oxygen is empty ")
        println("That why we are going to send a team to earth to see if we can go onder or to find oxygen ")
        println("They wil  have only 10 days to safe us or we al will be dead")
        println("Press '2' to continue\n")
    }

    fun choice1() {
        println("I think that it will be better to go to earth and help, Maybe it will be faster")
        println("Tomorrow were going for the first time to earth sins de zombie out break")
        println("I hope we can make it out alive and safe everyone")
        println("Press '2' to continue\n ")
    }

    fun choice1_1() {
        println("5 day hase pas and we haven't hear nothing from the team, The oxygen is almost done we have 5 day before it is empty")
        println("9 day hase pas and we haven't hear nothing from the team, The oxygen is almost done we have only 1 day  ")
        println("Many people are dead, there are only 5 people")
        println("Today is the day and i think the team is dead")
        println("And .... I think ")
        println("Press '1' to continue\n")
    }

    fun storyline3() {
        println("Today is the day to go to earth, We will have only 10 days.")
        println("We all get in the rocket, Everyone is secret and doesn't want to go anymore but we have to safe our people")
        println("We are in the rocket going down very vast, faster and faster")
        println("We are going to the military bunker to get Weapons first, That's were the rocket will fall")
        println("We are almost there but the rocket is going to fast i think we are going to crash")
        println("Press '1' to continue\n")
    }

    fun Storieline4() {
        println("It was a small crash only one of us got hurt but i am not filling 100% good nether")
        println("We all go to the bunker and there we find a lot of weapon and armor")
        println("i'm thinking which one do i pick and how much")
        println("Press '1' to continue\n")
    }

    fun weaponselection() {
        println("1. silent \n2. fire weapon \n3. Both \n")
    }

    fun choice2() {

        println("Maybe if i use silent weapons the zombies won't hear me and it will be easier ")
        println("You pick a Hatchet, Knives, Crossbow and a grenade")
        println("everyone is ready to go outside and see how it is going")
        println("1,2,3 ")
        println("Press '1' to continue\n")
    }

    fun choice2_1() {

        println("Maybe if i use fire weapons i can kill the zombies more faster. ")
        println("You pick a ..., ...")
        println("everyone is ready to go outside and see how it is going")
        println("1,2,3 ")
        println("Press '1' to continue\n")
    }

    fun choice2_2() {

        println("Using to much weapon can be hard but i have now so many choices")
        println("You pick a ..., ...")
        println("everyone is ready to go outside and see how it is going")
        println("1,2,3 ")
        println("Press '1' to continue\n")
    }

    fun storieline5() {
        println("The wind is so Nice, it was so long")
        println("It is so cuaet that we think that there is no more zombies, So we decided to walk around to see")
        println("1 hour has pas and no signed of a zombie, we become so happy that we began to dance and scream.")
        println("Not even 1 minute has pas and our leader was dead and a group of zombie came at us ")
        println("I had one choice fight or run")
        println("Press 1.Run or 2.Fight \n")
    }

    fun choiceRune() {

        println("I ren and ren if i'm a ... than i am Sorry")
        println("But with out knowing it i fell and hit my head")
        println("I don't remember much about what happened but when i woke up i was in a house of some sort")

        println("Press '1' to continue\n")

        //return Storieline8()
    }

    fun choiceFight() {

        println("I fight and fight.")
        println("First with the Hatchet i kill some but there to much and some of them are like fast and know what they are doing")
        println("I trow the hatchet and pick the crossbow, but i don't have much bow to use ")
        println("Right Now i only have Knife and a Grenade and almost al my team are dead ")
        println(" What do i do ?")
        println("Press '2' to continue\n")

        //return Storyline9()
    }

    fun storieline6() {
        println("I'm gonna prepare myself to collect some weapons")
        println("Here is a room full of weapons")
        println("You pick a Grenade gun, AKM and DiamondArmor to protect yourself")
        println("Press '1' to continue\n")
    }

    fun storieline10() {
        println("i had to decide to go alone or go with a group")
        println("Press 1.Alone or 2.Group \n")
    }


    fun choice8() {
        println("The place was really terrifying\n")
        println("I could only hear the voice of zombies, It was an indescribable strange feeling\n")
        println("Press '1' to continue\n")

        //return Storieline10()
    }

    fun choice8_1() {

        println("I found three new rooms, we tried to walk slowly that no enemy could hear us\n")
        println("we didn't leave until we were sure there was no one there\n")
        println("Press '1' to continue\n")

        //return Storyline10()
    }

    fun storieline11() {
        println("It was terrefiying when i was alone but I have killed alot of them\n")
        println("i really found other enemies and i had to eliminate them\n")
        println("Nothing will stop from achieving my goal and saving the world\n")
        println("Press '2' to continue\n")
    }

    fun storieline12() {
        println("It was more fun to be with a group and some of them were a group of my friends.\n We can also help each other")
        println("press 1 to go left, 2 to go right or 3 to return\n")

    }

    fun choiceRight() {
        println("I am still fighting a lone and there is no one just me\n")
        println("press 1 to go out, 2 to stay inside\n ")
    }

    fun choiceLeft() {
        println("You are dead")
    }

    fun choiceReturn() {
        println("I met alo of zombies and I tried to hide and fight them\n")
        println("press 1 to go out, 2 to stay inside\n ")
//        return Storyline11
    }

    fun choiceOut() {
        println("You are in the sixth level\n")
    }

    fun choiceInside() {
        println("I have to be sure that there is no more zombies and fight the rest of the enemies\n")
        println("Astonout took 40 pointsog damage and has 2 hitpoints")
        println("Astronout has lost a life.")
        println("press 1 to continue\n")
    }
    

    fun choiceInside() {
        println("I have to be sure that there is no more zombies and fight the rest of the enemies\n")
    }



    println("Select your hero!\n")

    println(heroselect())

    when (readLine()) {
        "1" -> print("You have selected the astronaut ...These are their stats...\nHealth is 70  Strength 15 ,Defence is 10\n Press '1' to continue\n")
        "2" -> print("You have selected the warriorGirl ...These are their stats...\n Health is 70  Strength 15 ,Defence is 10 \n Press '1' to continue\n")
        "3" -> print("You have selected the soldat ...These are their stats...\n Health is 70  Strength 15 ,Defence is 10 \n Press '1' to continue\n")
        else -> { // Note the block
            print("Only press 1, 2 or 3\n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storyline1())
        "soldat" -> print(heroselect())
        "astronaut" -> print(heroselect())
        "warriorGirl" -> print(heroselect())
        else -> { // Note the block
            print("Your doing something wrong, Check again........You only have to press '1'\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "2" -> print(storyline2())
        "1" -> print("You have to press 2\n")
        else -> { // Note the block
            print("Press 2\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "2" -> print(
            "5 People has to go, and they ask me if i wanna go...\n " +
                    "Do i go and help the team or do i stay and help here \n " +
                    "1. Stay \n" + "2. Go\n "
        )
        "1" -> print("You have to press 2\n")
        else -> { // Note the block
            print("Press 1\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(choice1_1())
        "2" -> print(choice1())
        else -> { // Note the block
            print("Only press 1 or 2\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(dead())
        "2" -> print(storyline3())
        else -> { // Note the block
            print("Only press 1 or 2\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(Storieline4())
        else -> { // Note the block
            print("Only press 1 \n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(weaponselection())
        else -> { // Note the block
            print("Only press 1 \n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(choice2())
        "2" -> print(choice2_1())
        "3" -> print(choice2_2())
        else -> { // Note the block
            print("Only press 1, 2 or 3\n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storieline5())
        // "2" -> print(Storyline6())
        // "3" -> print(Storyline7())
        else -> { // Note the block
            print("Only press 1, 2 or 3\n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(choiceRune())
        "2" -> print(choiceFight())

        else -> { // Note the block
            print("Only press 1 or 2\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------")
    when (readLine()) {
        "1" -> print(storieline6())

        else -> { // Note the block
            print("Only press 1 or 2\n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")

    when (readLine()) {
        "1" -> print(storieline10())
        else -> { // Note the block
            print("Only press 1 or 2\n")
        }

    }
    println("-------------------------------------------------------------------------------------------------------------------------")
    when (readLine()) {
        "1" -> print(choice8())
        "2" -> print(choice8_1())
        else -> { // Note the block
            print("Only press 1\n")
        }

    }
    println("-------------------------------------------------------------------------------------------------------------------------")
    when (readLine()) {
        "1" -> print(storieline11())
        else -> { // Note the block
            print("Only press 1\n")
        }

    }
    println("-------------------------------------------------------------------------------------------------------------------------")
    when (readLine()) {
        "2" -> print(storieline12())
        else -> { // Note the block
            print("Only press 2\n")
        }

    }

    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(choiceRight())
        "2" -> print(choiceLeft())
        "3" -> print(choiceReturn())
        else -> {
            print("Only press 2 or 3\n")
        }

    }
    println("-------------------------------------------------------------------------------------------------------------------------")
    when (readLine()) {
        "1" -> print(choiceOut())
        "2" -> print(choiceInside())
        else -> {
            print("Only press 1 or 2\n")
        }

    }
}



