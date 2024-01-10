package Into

fun main() {

    //entradas
    val ano_atual: Int = readln().toInt()

    //ver o ano de quantas copas?
//    val anoProximasCopas = readln().toInt()


    //processos
    proximas_copas(ano_atual)

    //saídas
    println("A proxima Copa do Mundo será em ${proximas_copas(ano_atual)}")


}
fun proximas_copas(ano: Int):Int{

    //usar como referência para saber o ano exato
    val ultimaCopa: Int

    var calculo = ano + (4 - (ano % 4))
    if (calculo == 2028){
        calculo -= 2

    }

    return calculo
}