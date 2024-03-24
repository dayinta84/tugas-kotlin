package com.example.tugas

import Aquarium
import printSize

fun buildAquarium() {
    val aquarium1 = Aquarium()
    printSize(aquarium1)
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    printSize(aquarium2)
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    printSize(aquarium3)
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    printSize(aquarium4)
    val aquarium6 = Aquarium(numberOfFish = 29)
    printSize(aquarium6)
    aquarium6.volume = 70
    printSize(aquarium6)
}

fun Aquarium.printSize() {
    println("Width: $width cm, " +
            "Length: $length cm, " +
            "Height: $height cm")

    // 1 liter = 1000 cm^3
    println("Volume: $volume liters")
}

fun main() {
    buildAquarium()
}