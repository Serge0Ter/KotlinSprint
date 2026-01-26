package org.example.lesson_2

fun main() {

    val crystallineOre = 7
    val irenOre = 11

    println("Buff crystalline ore: +${buff(crystallineOre)}")
    println("Buff iron ore: +${buff(irenOre)}")
}

fun buff(ore: Int): Int {
    val buffOre = 0.2
    return (ore * buffOre).toInt()
}