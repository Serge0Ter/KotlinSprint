package org.example.lesson_3

fun main() {

    val tsa20 = Girl()
    println(tsa20)
//    val tss22 = tsa20.copy(lastName = "Сидорова", age = 22)  как лучше, сохранять в отдельную переменную и потом выводить или сразу выводить
    println(tsa20.copy(lastName = "Сидорова", age = 22))
}

data class Girl(
    val firstName: String = "Татьяна",
    val lastName: String = "Андреева",
    val middleName: String = "Сергеевна",
    val age: Int = 20,
) {
    override fun toString(): String {
        return "$firstName $lastName $middleName, $age"
    }
}