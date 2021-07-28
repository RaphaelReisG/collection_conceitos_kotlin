package me.rapha

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("////////////////////////")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("maria", "zaza", "pedro")
    println("|||||||||||||||||||||||||||||")
    nomes2.sort()
    nomes2.forEach { println(it) }
}