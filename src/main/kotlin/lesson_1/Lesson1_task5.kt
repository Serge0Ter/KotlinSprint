package org.example.lesson_1

fun main() {
    val allSeconds = 6480
    val hours = allSeconds / 3600
    val minutes = (allSeconds / 60) % 60
    val seconds = allSeconds % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}