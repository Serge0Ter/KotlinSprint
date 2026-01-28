package org.example.lesson_3

fun main() {

    val move = "D2-D4;0"

    val moveAsSplit = move.split(";")
    val point = moveAsSplit[0].toString().split("-")
    val startPoint = point[0]
    val endPoint = point[1]
    val numberMove = moveAsSplit[1].toInt()

    println(startPoint)
    println(endPoint)
    println(numberMove)
//      Нет функции которая это сделает короче и красивее?)
//
//    for ((index, move) in moveAsSplit.withIndex()) {
//        when (index) {
//            0 -> {
//                val point = move.split("-")
//                val startPoint = point[0]
//                val endPoint = point[1]
//                println(startPoint)
//                println(endPoint)
//            }
//
//            1 -> {
//                val numberMove = move.toInt()
//                println(numberMove)
//            }
//        }
//    }

}