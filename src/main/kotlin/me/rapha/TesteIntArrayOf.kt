package me.rapha

fun main() {
    //forma alternativa sem ficar preso ao tamanho pois pode acrescentar depois
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    values.forEach {
        println(it)
    }

    println("......................................")
    values.sort()
    values.forEach {
        println(it)
    }
}