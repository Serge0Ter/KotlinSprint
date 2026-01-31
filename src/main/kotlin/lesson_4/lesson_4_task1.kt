package org.example.lesson_4

private const val ALL_TABLES = 13

fun main() {

    val reservedForToday = 13
    val reservedForTomorrow = 9
    println("Доступность столиков на сегодня: ${reservedForToday < ALL_TABLES}\nДоступность столиков на завтра: ${reservedForTomorrow < ALL_TABLES}")
}