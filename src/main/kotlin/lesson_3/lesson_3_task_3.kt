package org.example.lesson_3

fun main() {
    val number = 6
    multiplicationTable(number)

}

fun multiplicationTable(item: Int) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (number in numbers) {
        println("$item * $number = ${item * number}")
    }
}