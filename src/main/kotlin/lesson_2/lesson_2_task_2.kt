package org.example.lesson_2

fun main() {

    val permanentEmployee = 50
    val intern = 30
    val permanentSalary = 30_000
    val internSalary = 20_000

    val costsPermanentEmployees = permanentEmployee * permanentSalary
    val costsInternEmployees = intern * internSalary
    val totalCosts = costsInternEmployees + costsPermanentEmployees
    val mediumSalary = totalCosts / (permanentEmployee + intern)

    println("Расходы на выплату зарплаты постоянных сотрудников: $costsPermanentEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalCosts")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $mediumSalary")

}