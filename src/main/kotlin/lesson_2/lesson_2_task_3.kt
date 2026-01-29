package org.example.lesson_2

const val MINUTE_IN_HOUR = 60

fun main() {

    val start = "9:39"
    val transitTime = 457

    println(timeAsMinutes(start, transitTime))

}

fun timeAsMinutes(start: String, transitTime: Int): String {
    val startAsInt = start.split(":").map { it.toInt() }
    val minuteStart = startAsInt[0] * MINUTE_IN_HOUR + startAsInt[1]
    val allMinutes = minuteStart + transitTime
    val finishHour = allMinutes / MINUTE_IN_HOUR
    val finishMinute = allMinutes % MINUTE_IN_HOUR
    return "%02d:%02d".format(finishHour, finishMinute)
}