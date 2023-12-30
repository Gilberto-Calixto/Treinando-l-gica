package Into

fun main() {

    //entradas
    println("Desconto imperdivél! 50% de desconto em cada item (a partir de compras de 3 unidades)")

    println("Nome do produto: ")
    val nomeProduto: String = readln()

    println("é do setor 'Higiene'(S/N): ")
    val categoriaProdutoHigiene: String = readln()

    println("Preço do Produto: R$")
    val precoProduto: Double = readln().toDouble()

    println("Quantas unidades: ")
    val unidades = readln().toInt()

    //processos
    if (categoriaProdutoHigiene == "S" && unidades >= 3){
        val desconto: Double = precoProduto * (50.0 / 100)
        val totalaPagar = (precoProduto * unidades) - (desconto * unidades)

        println("Total a pagar com desconto ${totalaPagar}")

    }else{
        println("Você não se enquadra na promoção!")
    }


    //saídas
     println("Muito obrigado por comprar conosco! Volte sempre!")
}