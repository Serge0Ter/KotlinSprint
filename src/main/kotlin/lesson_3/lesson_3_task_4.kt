package org.example.lesson_3

fun main() {
// по идеи белые ходят первые и должно тогда быть D2-D3;0
    var startPoint = "E2"
    var endPoint = "E4"
    var moveNumber = 1

    val move1 = "$startPoint-$endPoint;$moveNumber"
    println(move1)

    startPoint = "D2"
    endPoint = "D3"
    moveNumber++

    val move2 = "$startPoint-$endPoint;$moveNumber"
    println(move2)
}
/***
Можно сделать переменную val и через get() ее обновлять и выводила уже обновленные данные?
val move1 = "$startPoint-$endPoint;$moveNumber"
println(move1)

startPoint = "D2"
endPoint = "D3"
moveNumber++

println(move1)

Как вариант еще сделать мутабельной move
var move = "$startPoint-$endPoint;$moveNumber"
println(move)
move = "$startPoint-$endPoint;$moveNumber"
println(move)
 ***/

