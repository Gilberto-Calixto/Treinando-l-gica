package Into

fun main() {

    //entradas
    println("Quantas unidades: ")
    val unidades = readln().toInt()

    println("Medicamento: ")
    val descricao: String = readln()

    println("Preço: ")
    val preco: Double = readln().toDouble()

    //processos
    if (unidades >= 2){
        val promocao = preco.toInt()
        val valorpromo = preco - promocao
        println("Você vai pagar $${promocao}")
        println("Vai receber de volta $${valorpromo}")

    }else{
        println(preco)
    }



    //saídas

}