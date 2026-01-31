package org.example.lesson_4

private const val MINIMUM_WEIGHT = 35
private const val MAXIMUM_WEIGHT = 100
private const val VOLUME = 100

fun main() {
    val weight1 = 20
    val weight2 = 50
    val volume1 = 80
    val volume2 = 100
    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${(MINIMUM_WEIGHT < weight1) && (weight1 <= MAXIMUM_WEIGHT) && (volume1 < VOLUME)}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${(MINIMUM_WEIGHT < weight2) && (weight2 <= MAXIMUM_WEIGHT) && (volume2 < VOLUME)}")

}
