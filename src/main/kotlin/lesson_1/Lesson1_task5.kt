package org.example.lesson_1

fun main() {
    val secondInMinute = 60
    val allSeconds = 6480
    val hours = allSeconds / secondInMinute * secondInMinute
    val minutes = (allSeconds / secondInMinute) % secondInMinute
    val seconds = allSeconds % secondInMinute

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}