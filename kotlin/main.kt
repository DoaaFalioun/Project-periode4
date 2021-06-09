fun main() {
    val astronaut = Player("astronaut",2, 1,2)
    astronaut.show()

    val baksteen = Weapon("Baksteen", 15)
    astronaut.weapon = baksteen
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)

    val mb5 = Weapon("mb5",18)
    astronaut.weapon = mb5
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)

    val mb7 = Weapon("mb7",20)
    astronaut.weapon = mb7
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)

    val mb4 = Weapon("mb4",20)
    astronaut.weapon = mb4
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)
//
    val akm = Weapon("akm",40)
    astronaut.weapon = akm
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)

    val flamethrower = Weapon("flamethrower",20)
    astronaut.weapon = flamethrower
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)

    val gerande = Weapon("gerande",20)
    astronaut.weapon = gerande
    println(astronaut.weapon.name)
    println(astronaut.weapon.damageInflicted)

        val num1 = "baksteen"
        val num2 = "akm"
        val num3 = "mb4"

    val Vampire = Enemy("Vampire", 20, 2)
    println(Vampire)

    Vampire.takeDamage(40)
    println(Vampire)

    val king= Dead("king",30,1)
    println(king)

    var lives = 2

    fun show() {
        if (lives < 1) {
            println("Game over")
        } else {
            println("your are still alive")
        }
    }


    val diamondArmor = Loot("Diamond Armor", LootType.ARMOR, 12.00)
    astronaut.inventory.add(diamondArmor)
    astronaut.showInventory()

    println(astronaut)

    val regenerator = Monster("Regenerator", 18,2)
    println(regenerator)
    regenerator.takeDamage(12)
    println(regenerator)

}

