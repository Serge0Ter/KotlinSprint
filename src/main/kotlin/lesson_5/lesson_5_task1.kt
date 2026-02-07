package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val a = Random.nextInt(100)
    val b = Random.nextInt(100)
    val sum = a + b
    print("Введите сумму чисел: $a + $b = ")
    val result = readln().toInt()
    if (sum == result) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}