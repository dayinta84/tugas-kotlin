class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000

        set(value) {
            height = (value * 1000) / (width * length)
        }
}

fun printSize(aquarium: Aquarium) {
    println("Width: ${aquarium.width} cm, " +
            "Length: ${aquarium.length} cm, " +
            "Height: ${aquarium.height} cm")

    // 1 liter = 1000 cm^3
    println("Volume: ${aquarium.volume} liters")
}