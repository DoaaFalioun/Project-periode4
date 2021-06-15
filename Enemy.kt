open class Enemy(val name: String, var hitpoints: Int, var lives: Int) {

    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0) {
            hitpoints = remainingHitpoints
            println("$name took $damage pointsog damage and has $hitpoints hitpoints")
        } else {
            lives -= 1
            println("$name has lost a life.")
        }
    }

    override fun toString(): String {
        return "Name: $name, Hitpoints: $hitpoints, Lives: $lives"
    }

}