package Into

fun main() {

    //entradas
    println("Preço do produto: ")
    val precoProduto = readln().toDouble()

    println("Como você quer pagar: ")
    println("""[1] A vista com 10% de desconto
        |[2] Parcelado em 3X
    """.trimMargin())

    //processos
    println("informe a opação")
    val opcao = readln().toInt()

    if (opcao == 1){
        val valorDiscontoAvista = precoProduto - (precoProduto * 0.10)
        println(valorDiscontoAvista)
    } else{
        val parcelado = precoProduto / 3
        println(parcelado)
    }

    //saídas

}