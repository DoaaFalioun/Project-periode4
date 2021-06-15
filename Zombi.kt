class Zombi (name: String, hitpoints: Int, lives: Int) : Enemy(name, hitpoints, lives){

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}