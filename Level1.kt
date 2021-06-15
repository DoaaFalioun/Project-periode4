open class Level1{

    open fun dead(){
        println("Sorry but you are dead")
    }




    open fun Storyline1() {

        println("10 years ago before ale of this began, i had a normal life and happy")
        println("But a bad science project chanced everything and made everyone into a Zombie")
        println("And the only way to stay alive was to come to space but not everyone made it ")
        println("There is only 25% of ..?.. alive")
        println("Today is the 10th anniversary that we came to space, that right 10 years living in space")
        println("I think that earth is dead and everyone there is a zombie because no one send ons a signal")
        println( "Press Enter to continue")

        return Storyline2()
    }

    fun Storyline2() {
        println("Little did we know that we are going to die to ")
        println("Our oxygen is almost empty and we have to do something before that the oxygen is empty ")
        println("That why we are going to send a team to earth to see if we can go onder or to find oxygen ")
        println("They wil  have only 10 days to safe us or we all will be dead")

        return Choice1()
    }

    val Choice1 = readLine()

    fun Choice1() {
        println("5 People has to go, and they ask me if i wanna go.")
        println("Do i go and help the team or do i stay and help here")

        println ("1. Go \n2. Stay")


        if(Choice1 == "1") {

            println("I think that it will be better to go to earth and help, Maybe it will be faster")
            println("Tomorrow were going for the first time to earth sins de zombie out break")
            println("I hope we can make it out alive and safe everyone")
            println("Press Enter")

            return Storyline3()

        }  else if(Choice1 == "2") {

            println("5 day hase pas and we haven't hear nothing from the team, The oxygen is almost done we have 5 day before it is empty")
            println("9 day hase pas and we haven't hear nothing from the team, The oxygen is almost done we have only 1 day  ")
            println("Many people are dead, there are only 5 people")
            println("Today is the day and i think the team is dead")
            println("And .... I think ")
            println("Press Enter")

            return dead()

        } else {
            print("Only press 1 or 2\n")
        }
    }

    fun Storyline3() {
        println("Today is the day to go to earth, We will have only 10 days.")
        println("We all get in the rocket, Everyone is secret and doesn't want to go anymore but we have to safe our people")
        println("We are in the rocket going down very vast, faster and faster")
        println("We are going to the military bunker to get Weapons first, That's were the rocket will fall")
        println("We are almost there but the rocket is going to fast i think we are going to crash")
        println("Press Enter")

        //return Storieline4()
    }
}