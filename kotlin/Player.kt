class Player constructor(val name: String, var life: Int = 2, var level: Int = 1, var lives: Int) {
    var weapon = Weapon("knife",10)
    val inventory = ArrayList<Loot>()

    override fun toString(): String {
        return """
            name: $name
            life: $life
            level: $level
            lives: $lives
            weapon: ${weapon.name}
            damage: ${weapon.damageInflicted}
            """
    }
    fun show() {
        if (lives < 0) {
            println("Game over")
        } else {
            println("$name is alive")
        }
    }
    fun showInventory() {
        println("$name's Inventory:")
        for (item in inventory) {
            println("$item")
        }
        println("-------------")
    }

}