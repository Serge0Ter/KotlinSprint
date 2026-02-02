package org.example.lesson_5

private const val WIN_NUMBER_1 = 15
private const val WIN_NUMBER_2 = 32

fun main() {

    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()
    val result = when {
        (number2 == WIN_NUMBER_2 && number1 == WIN_NUMBER_1) -> "Поздравляем! Вы выиграли главный приз!"
        (number2 == WIN_NUMBER_2 || number1 == WIN_NUMBER_1) -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }
    println("Для победы нужны были числа: $WIN_NUMBER_2 и $WIN_NUMBER_1")
    println(result)
}