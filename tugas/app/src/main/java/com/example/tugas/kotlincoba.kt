package com.example.tugas

fun main(args: Array<String>) {
    biodata("Dayinta Ayu Faj'rin", 18)
    hobby("membaca", "membaca wattpad")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("===============================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("===============================")
}

fun hobby(hobby:String, desc:String){
    println("Saya suka $hobby")
    println("Yang saya baca adalah $desc")
}