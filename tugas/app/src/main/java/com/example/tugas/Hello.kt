package com.example.tugas

class Hello {
    var color: String = "white"
    val numberOfWindows: Int = 2
    val isForSale: Boolean = false

    fun updateColor(newColor: String){
    }
    fun putOnSale() {
    }
}

fun main(){
    val A1 = Hello()
    val A2 = Hello()
    val A3 = Hello()


    A1.color = "hijau"
    println(A1.color)
    A2.color = "merah"
    println(A2.color)
    A3.color = "biru"
    println(A3.color)
}
