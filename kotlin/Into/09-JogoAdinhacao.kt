package Into

import java.util.Random

fun main() {

    //entradas

    print("Escolha um número entre 1 e 11")
    val usuario = readln().toInt()

    var pontosUsuario = 0
    var pontosCompter = 0

    //processos

    //próx. feature aplicar o while para ter repetições
    val random = Random()
    val randNumber = random.nextInt(1,11)
    if (usuario == randNumber){
        pontosUsuario++
    }else{
        pontosCompter++
    }

    if(pontosUsuario > pontosCompter){
        println("Você Venceu: $pontosUsuario Pontos")
    }else{
        println("Compter Venceu: $pontosCompter Pontos")
    }

    //saidas
    println(randNumber)

}
