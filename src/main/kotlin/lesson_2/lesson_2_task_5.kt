package org.example.lesson_2

fun main() {

    val seedCapital = 70_000
    val yearToInvest = 20
    println(String.format("%.3f", profit(seedCapital, yearToInvest)))
}
//
//fun profit(capital: Int, year: Int): String {
//    val interestRate = 16.7
//    return String.format("%.3f", capital * Math.pow((1 + interestRate / 100), year.toDouble()))
//}

fun profit(capital: Int, year: Int): Double {
    val interestRate = 16.7
    return capital * Math.pow((1 + interestRate / 100), year.toDouble())
}