package org.example.lesson_2

fun main() {

    val crystallineOre = 7
    val irenOre = 11

    println("Buff crystalline ore: +${buff(crystallineOre)}")
    println("Buff iron ore: +${buff(irenOre)}")
}

fun buff(ore: Int): Int {
    val percent = 20
    return (ore * percent / 100).toInt()
}