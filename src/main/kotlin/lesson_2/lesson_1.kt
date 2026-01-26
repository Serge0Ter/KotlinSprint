package org.example.lesson_2

fun main() {

    val englishGrades = listOf(3, 4, 3, 5)
    val mediumGrades = englishGrades.sum() / englishGrades.size.toFloat()
    println(mediumGrades)
}