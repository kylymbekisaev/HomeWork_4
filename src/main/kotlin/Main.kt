fun main(args: Array<String>) {
    val scanner: CustomScanner = CustomScanner(System.`in`)
    println("Выберите действия для героев 0-для защиты,1-для атаки:")
    val input: Int = scanner.nextInt()

    when(input){
        0->{
            val warrior = Warrior(Character.WARRIOR_NAME,Character.WeaponType.SWORD,"щит")
            val mage = Mage(Character.MAGE_NAME,Character.WeaponType.STICK,"огненый щит")
            val archer = Archer(Character.ARCHER_NAME,Character.WeaponType.BOW,"меткость")

            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }
        1->{
            val warrior = Warrior(Character.WARRIOR_NAME, Character.WeaponType.SWORD, "иззядия тьмы")
            val mage = Mage(Character.MAGE_NAME, Character.WeaponType.STICK, "водиная буря")
            val archer = Archer(Character.ARCHER_NAME, Character.WeaponType.BOW, "огнинная стрела")

            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)

            val hiller = object {
                val name ="Хиллер"
                fun hill(){
                    println("$name выличил всех")
                }
            }
            hiller.hill()
        }
        else-> println("Некоррекный вывод")
    }
}