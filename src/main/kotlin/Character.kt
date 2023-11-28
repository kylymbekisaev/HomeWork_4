import java.util.Scanner

sealed class Character(val name: String, val weaponType: WeaponType) {
    enum class WeaponType(val type: String) {
        SWORD("мечем"),
        STICK("посох"),
        BOW("лука")
    }

    companion object {
        const val WARRIOR_NAME = "Воин"
        const val MAGE_NAME = "Маг"
        const val ARCHER_NAME = "Лучник"
    }
}

class Warrior(name: String, weaponType: WeaponType, val ability: String) : Character(name, weaponType)
class Mage(name: String, weaponType: WeaponType, val spell: String) : Character(name, weaponType)
class Archer(name: String, weaponType: WeaponType, val ability: String) : Character(name, weaponType)

typealias CustomString = String
typealias CustomScanner = Scanner

object CharacterCommon {
    fun attack(character: Character) {
        when (character) {
            is Warrior -> println("${character.name} замахнулся ${character.weaponType.type} применив способность ${character.ability}")
            is Mage -> println("${character.name} используя- ${character.weaponType.type} применил заклинание ${character.spell}")
            is Archer -> println("${character.name} выстрелил из ${character.weaponType.type} применив способность ${character.ability}")
        }
    }

    fun defend(character: Character) {
        when (character) {
            is Warrior -> println("${character.name} защищает себя со способностью ${character.ability}")
            is Mage -> println("${character.name} использует ${character.spell} для защиты")
            is Archer -> println("${character.name} использует ${character.ability} для защиты")
        }
    }
}