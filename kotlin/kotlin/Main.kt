fun main(args: Array<String>){


    fun heroselect() {
        println ("1. astronaut ⋆｡ﾟ☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆✌️(^◞^)✌️⋆｡ﾟ☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆\n" +
                "2. warriorGirl ├┬┴┬┴{~_^}✌ ┬┴┬┴┤ \n" +
                "3. soldat [̂•̮•̂] ✌ 三二一 \n")
    }

    fun dead(){
        println("Sorry but you are dead")
    }

    fun storyline1() {

        println("10 years ago before ale of this began, i had a normal life and happy")
        println("But a bad science project chanced everything and made everyone into a Zombie")
        println("And the only way to stay alive was to come to space but not everyone made it ")
        println("There is only 25% of ..?.. alive")
        println("Today is the 10th anniversary that we came to space, that right 10 years living in space")
        println("I think that earth is dead and everyone there is a zombie because no one send ons a signal")
        println( "Press '2' to continue\n")

    }

    fun storyline2() {
        println("Little did we know that we are going to die to ")
        println("Our oxygen is almost empty and we have to do something before that the oxygen is empty ")
        println("That why we are going to send a team to earth to see if we can go onder or to find oxygen ")
        println("They wil  have only 10 days to safe us or we al will be dead")
        println( "Press '2' to continue\n")
    }

    fun choice1(){
        println("I think that it will be better to go to earth and help, Maybe it will be faster")
        println("Tomorrow were going for the first time to earth sins de zombie out break")
        println("I hope we can make it out alive and safe everyone")
        println("Press '2' to continue\n ")
    }

    fun choice1_1(){
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

    fun Storieline4(){
        println("It was a small crash only one of us got hurt but i am not filling 100% good nether")
        println("We all go to the bunker and there we find a lot of weapon and armor")
        println("i'm thinking which one do i pick and how much")
        println("Press '1' to continue\n")
    }

    fun weaponselection() {
        println ("1. silent \n2. fire weapon \n3. Both \n")
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
    println ("Select your hero!\n")

    println (heroselect())

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
        "2" -> print("5 People has to go, and they ask me if i wanna go...\n " +
                "Do i go and help the team or do i stay and help here \n " +
                "1. Stay \n" + "2. Go\n ")
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


}






