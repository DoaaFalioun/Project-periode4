enum class LootType {
    ARMOR, RINGS, POTION
}

class Loot(val name: String, val lootType: LootType, val value: Double) {

    override fun toString(): String {
        return "$name is a $lootType and value $$value"
    }

}