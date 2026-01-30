package org.example.lesson_4

private const val SUNNY = true
private const val AWNING_IS_OPEN = true
private const val HUMIDITY = 20
private const val SEASON = "winter"

fun main() {
    val isSunny: Boolean = true
    val awning: Boolean = true
    val isHumidity: Int = 20
    val season: String = "winter"

    val result = conduciveConditions(isSunny, awning, isHumidity, season)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

fun conduciveConditions(isSunny: Boolean, awning: Boolean, isHumidity: Int, season: String): Boolean {
    return ((isSunny == SUNNY) && (awning == AWNING_IS_OPEN) && (isHumidity == HUMIDITY) && (season != SEASON))
}