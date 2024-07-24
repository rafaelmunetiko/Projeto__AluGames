package br.com.alura.alugames.principal
import br.com.alura.alugames.modelo.Gamer
fun main() {
    val gamer1 = Gamer("Rafael", "rafa@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Isadora",
        "isa@email.com",
        "07/03/2000",
        "dora")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "19/02/1996"
        it.usuario = "rafa"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "rafaelmunetiko"
    println(gamer1)
}