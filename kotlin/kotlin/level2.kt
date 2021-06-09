open class level2 {



    val Weaponselection = readLine()

    fun Weaponselection() {
        println ("1. silent \n2. fire weapon \n3. Both \n")

        return Choice2()
    }

   open fun Storieline4(){
        println("It was a small crash only one of us got hurt but i am not filling 100% good nether")
        println("We all go to the bunker and there we find a lot of weapon and armor")
        println("i'm thinking which one do i pick and how much")

       return Choice2()
   }

    val Choice2 = readLine()

    open fun Choice2() {

        println ("Select your weapon!\n")

        println(Weaponselection())

        if(Choice2 == "1") {

            println("Maybe if i use silent weapons the zombies won't hear me and it will be easier ")
            println("You pick a Hatchet, Knives, Crossbow and a grenade")
            println("everyone is ready to go outside and see how it is going")
            println("1,2,3 ")
            println("Press Enter\n")

            return storieline5()

        }  else if(Choice2 == "2") {

            println("Maybe if i use fire weapons i can kill the zombies more faster. ")
            println("You pick a ..., ...")
            println("everyone is ready to go outside and see how it is going")
            println("1,2,3 ")
            println("Press Enter\n")

            //return Storyline6()

        } else if(Choice2 == "2") {

            println("Using to much weapon can be hard but i have now so many choices")
            println("You pick a ..., ...")
            println("everyone is ready to go outside and see how it is going")
            println("1,2,3 ")
            println("Press Enter\n")

            //return Storyline7()

        } else {
            print("Only press 1 ,2 or 3\n")
        }
    }

     fun storieline5(){
        println("The wind is so Nice, it was so long")
         println("It is so cuaet that we think that there is no more zombies, So we decided to walk around to see")
         println("1 hour has pas and no signed of a zombie, we become so happy that we began to dance and scream.")
         println("Not even 1 minute has pas and our leader was dead and a group of zombie came at us ")
         println("I had one choice fight or run")

         val choice3 = readLine()

         if(choice3  == "run") {

             println("I ren and ren if i'm a ... than i am Sorry")
             println("But with out knowing it i fell and hit my head")
             println("I don't remember much about what happened but when i woke up i was in a house of some sort")

             println("Press Enter\n")

             //return Storieline8()

         }  else if(choice3 == "fight") {

             println("I fight and fight.")
             println("First with the Hatchet i kill some but there to much and some of them are like fast and know what they are doing")
             println("I trow the hatchet and pick the crossbow, but i don't have much bow to use ")
             println("Right Now i only have Knife and a Grenade and almost al my team are dead ")
             println(" What do i do ?")
             println("Press Enter\n")

             //return Storyline9()

         } else {
             print("Only type run or fight\n")
         }
     }

}



