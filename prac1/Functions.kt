package prac1

fun feedFish(fish: Fish, food: String = "flakes") {
    println("${fish.species} is being fed $food.")
}

fun updateWaterQuality(dirtyLevel: Int, operation: (Int) -> Int): Int {
    return operation(dirtyLevel)
}
