fun main(args: Array<String>){

    val warriorGirl = Player("Scooby",50, 0,5)

    val akm = Weapon("akm",40,10)
    val grande = Weapon("grande",20,1)
    val shotgun = Weapon("shotgun",20,5)
    val flamethrower = Weapon("flamethrower",20, 3)
    val mb7 = Weapon("mb7",20,15)
    val gun = Weapon("mb7",15,9)

    val hatchet = Weapon("hatchet",40,1)
    val knives = Weapon("knives",2,3)
    val crossbow = Weapon("crossbow",20,20)
    val baseballbat = Weapon("baseball bat",15,6)
    val sword = Weapon("Sword",15,10)

    val shield = shields("Captain America's Shield",10)
    val shield1 = shields("Military Vest",15)
    val shield2 = shields("Spetsnaz Helmet",20)

    val vitamina = medican("Medkit",10)
    val vitamina1 = medican("Adrenaline Syringe",10)
    val vitamina2 = medican("Painkiller",5)
    val vitamina3 = medican("Energy Drink",3)



    fun heroselect() {
        println ("1. warriorGirl  \n" )
    }

    fun dead(){
        println("Sorry but you are dead")
    }

    fun storyline1() {

        println("10 years ago before ale of this began, i had a normal life and happy")
        println("But a bad science project chanced everything and made everyone into a Zombie")
        println("And the only way to stay alive was to come to space but not everyone made it ")
        println("There is only 25% of the hole world alive")
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
        println(warriorGirl("Scooby",1,0,0))
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
        println(warriorGirl("Scooby",45,2,5))
        println("We all go to the bunker and there we find a lot of weapon and armor")
        println("i'm thinking which one do i pick and how much")
        println("Press '1' to continue\n")
    }

    fun weaponselection() {
        println ("1. silent \n2. fire weapon \n3. Both \n")
    }

    fun choice2() {

        println("Maybe if i use silent weapons the zombies won't hear me and it will be easier ")
        println("You pick a:")
        println(hatchet)
        println(crossbow)
        println(knives)
        println("And now everyone is ready to go outside and see how it is going")
        println("1,2,3 ")
        println("Press '1' to continue\n")
    }

    fun choice2_1() {

        println("Maybe if i use fire weapons i can kill the zombies more faster. ")
        println("You pick a:")
        println(akm)
        println(grande)
        println(shotgun)
        println("And now everyone is ready to go outside and see how it is going")
        println("1,2,3 ")
        println("Press '1' to continue\n")
    }

    fun choice2_2() {

        println("Using to much weapon can be hard but i have now so many choices")
        println("You pick a:")
        println(akm)
        println(grande)
        println(shotgun)
        println(hatchet)
        println(crossbow)
        println(knives)
        println("And now everyone is ready to go outside and see how it is going")
        println("1,2,3 ")
        println("Press '1' to continue\n")
    }

    fun storieline5() {
        println("The wind is so Nice, it was so long")
        println("It is so quiet that we think that there is no more zombies, So we decided to walk around to see")
        println("1 hour has pas and no signed of a zombie, we become so happy that we began to dance and scream.")
        println("Not even 1 minute has pas and our leader was dead and a group of zombie came at us ")
        println("I had one choice fight or run")
        println("Press 1.Run or 2.Fight \n")
    }

    fun choiceRune() {

        println("I ren and ren if i'm a ... than i am Sorry")
        println("But with out knowing it i fell and hit my head")
        println("I don't remember much about what happened but when i woke up i was in a house of some sort")
        println(warriorGirl("Scooby",40,2,5))
        println("Press '1' to continue\n")

        //return Storieline6()
    }

    fun Storyline6(){
        println ("I look around and don't see my weapons, what I do see is four people")
        println ("They ask me ''What are you doing here ?'' but i'm still hurt and don't Understate a thing")
        println ("But then i tell them everything and they let me go, But they tell me that everyone from my team are dead")
        println ("I ask them if they got medicine , weapons and shield, they see yes but they will give them to me only if they can go with me ")
        println("Press '1' to continue\n")

        //return Storieline7()
    }

    fun Storyline7(){
        println ("I just say okay so that they can give me the weapons")
        println ("Room 1.are the medicine, Room 2.are the weapons and Room 3.are the shield")
        println ("Press 1 to go to room 1 ?")

        //return Rooms()
    }

    fun room1(){
        println (shield2)
        println ("Press '2' to go to the next Room")
        //return Storieline8()
    }

    fun room2(){
        println (akm)
        println (shotgun)
        println (knives)
        println (crossbow)
        println ("Press '3' to go to the next Room")

        //return Storieline8()
    }

    fun room3(){
        println (vitamina3)
        println ("Press '1' to continue")

        //return Storieline8()
    }

    fun storieline8 (){
        println(warriorGirl("Scooby",43,3,5))
        println("when i was ready to leave they told me al about the zombie and that there are to type")
        println("Me thinking i can leave this people behind, but for my bad luck i need them")
        println("We began walking for like 5 hours (It was really 1 hour) we get to a laboratory so that we can find oxygen")
        println("Press '1' to continue\n")

    }

    fun storieline9 (){
        println("they tel me that i can stay outside and keep gard or go inside and help ")
        println("1.stay outside and keep watch")
        println("2.Go outside and help find oxygen")
        println("Press '1' or '2' to continue\n")

    }

    fun storieoutside (){
        println("I stay outside with a another person, a minute later a feel sleepy")
        println("I don't know how long i was out but, when i woke up i was lying in in a cage")
        println("and in front of me there where weapons, then i realist that i didn't have my weapon")
        println(warriorGirl("Scooby",30,4,3))
        println("Press '1' to continue\n")

    }
    fun storieinside (){
        println("I went inside with the group, we walked for like 5 minutes and couldn't find nothing")
        println("a girl ask me if i want some water and i take it")
        println("I don't know how long i was out but, when i woke up i was lying in in a cage")
        println("and in front of me there where weapons, then i realist that i didn't have my weapon")
        println(warriorGirl("Scooby",30,4,3))
        println("Press '1' to continue\n")
    }

    fun storieline10 (){
        println("They tel me a story about the zombies and wath heppend this 10 years ")
        println("1.To read the Story")
        println("2.T continue with out ready the story")
        println("Press '1' or '2' to continue\n")

    }
    fun storieline11 (){
        println("Know i have to Fight with zombies til i dye they tell me ")
        println("I have Only 2 fire weapons that i can use, 1 silent weapon, 1shield and 1 medicine")
        println(gun)
        println(mb7)
        println(baseballbat)
        println(shield1)
        println(vitamina1)
        println(warriorGirl("Scooby",40,4,4))
        println("Let the Game begin")
        println("Press '1'  to continue\n")

    }



    fun choiceFight() {

        println("I fight and fight.")
        println("First with the Hatchet i kill some but there to much and some of them are like fast and know what they are doing")
        println("I trow the hatchet and pick the crossbow, but i don't have much bow to use ")
        println("Right Now i only have Knife and a Grenade and almost al my team are dead ")
        println(" What do i do ?")
        println("Press '5' to continue\n")

        //return Storyline9()
    }
    println ("Here is your Hero ")

    println (heroselect())

    when (readLine()) {
        "1"-> print(warriorGirl)
        else -> { // Note the block
            print("Only press 1 \n")
        }

    }
    println("\n------------------------Press '1' to read the Story and to start the game---------------------------------\n")
    when (readLine()) {
        "1" -> print(storyline1())
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
        else -> { // Note the block
            print("Only press 1 \n")
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
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
       "1" -> print(Storyline6())
        //"2" -> print()

        else -> { // Note the block
            print("Only press 1 or 2\n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(Storyline7())
       // "2" -> print()

        else -> { // Note the block
            print("Only press 1 or 2\n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(room1())
        else -> { // Note the block
            print("Only press 1 \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "2" -> print(room2())
        else -> { // Note the block
            print("Only press 2\n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "3" -> print(room3())
        else -> { // Note the block
            print("Only press 3 \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storieline8())
        else -> { // Note the block
            print("Only press 1 \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storieline9())
        else -> { // Note the block
            print("Only press 1 \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storieoutside())
        "2" -> print(storieinside())
        else -> { // Note the block
            print("Only press 1 or 2  \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storieline10())
        else -> { // Note the block
            print("Only press 1 \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "1" -> print(storieoutside())
        "2" -> print(storieinside())
        else -> { // Note the block
            print("Only press 1 or 2  \n")
        }

    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")
    when (readLine()) {
        "5" -> print(storieoutside())
        else -> { // Note the block
            print("Only press 5 \n")
        }
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------\n")


}