package org.example.lesson_4

fun main() {

    var day = 5
    println(workout(day))
    println(workout(++day))
}

fun workout(day: Int): String {
    return when (day % 2) {
        0 -> {
            """
               Упражнения для рук:    false
               Упражнения для ног:    true
               Упражнения для спины:  true
               Упражнения для пресса: false 
            """.trimIndent()
        }

        else -> {
            """
                Упражнения для рук:    true
                Упражнения для ног:    false
                Упражнения для спины:  false
                Упражнения для пресса: true
            """.trimIndent()
        }
    }
}