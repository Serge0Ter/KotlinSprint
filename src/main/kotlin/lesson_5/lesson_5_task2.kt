package org.example.lesson_5

import java.time.Year

private const val AGE = 18

fun main() {
    var currentYear = Year.now().value
    print("Введите год своего рождения: ")
    val year = readln().toInt()
    val result = currentYear - year
    val info = if (result >= AGE) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться на главный экран"
    }
    println(info)
}