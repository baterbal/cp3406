package prac1

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    val volume: Int
        get() = length * width * height / 1000

    fun printSize() {
        println("Aquarium Dimensions: Length: $length cm, Width: $width cm, Height: $height cm")
        println("Volume: $volume liters")
    }
}
