package prac1


open class Tank(var diameter: Int = 20) {
    open fun printInfo() {
        println("Tank Diameter: $diameter cm")
    }
}

class TowerTank(diameter: Int, var height: Int = 100) : Tank(diameter) {
    override fun printInfo() {
        println("Tower Tank Diameter: $diameter cm, Height: $height cm")
    }
}
fun main() {
    // 1. Create and print Aquarium object
    val myAquarium = Aquarium()
    myAquarium.printSize()

    // 2. Create a customized Aquarium object
    val customAquarium = Aquarium(length = 150, width = 50, height = 60)
    customAquarium.printSize()

    // 3. Data class Fish usage
    val myFish = Fish("Goldfish", 10)
    feedFish(myFish)
    feedFish(myFish, "granules")

    // 4. Higher-order function and lambda
    val dirtyLevel = 20
    val waterFiltered = updateWaterQuality(dirtyLevel) { dirty -> dirty / 2 }
    println("Water quality after filtration: $waterFiltered")

    // 5. Inheritance with Tank and TowerTank
    val myTank = TowerTank(diameter = 30, height = 120)
    myTank.printInfo()
}
