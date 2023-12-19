fun main() {

    //entrada
    println("digite um número")
    val numero = readln().toInt()
    //println(numero)

    //processo
    val antecessor = numero - 1
    val sucessor = numero + 1

    //saida
    println("Os vizinhos de ${numero} são $antecessor e $sucessor")
}