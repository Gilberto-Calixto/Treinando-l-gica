package Into

fun main() {

    // entrada
    println("valor total a pagar: ")
    val valor_total = readln().toDouble()

    println("Quantas pessoas vão pagar: ")
    val pagantes = readln().toInt()

    //processos
    val dividirValor = valor_total / pagantes.toDouble()
    val result = dividirValor

    //saida
    println("Vai ficar ${result} pra cada")

}