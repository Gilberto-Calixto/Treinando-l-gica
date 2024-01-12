package Into

fun main() {
    println("Qual temperatura")
    val temperatura = readln().toDouble()

    println("""[1] Fareheit
    [2] Celcius
    """)

    print("Qual opção: ")
    val opcao = readln().toInt()



    val temps = when(opcao){

        1 -> {
            val formula = 9.0 / 5.0  * temperatura + 32
            println(formula.toInt())
        }
        2 -> {
            val formula2 = 5.0 / 9.0 * temperatura - 32
            println(formula2.toInt())

        }
        else -> println("Inválido!")
    }


    //test()

    //println("A temp em Farehit é ${conversorFarehit(temperatura)}")
}

fun conversorFarehit(celcius: Double):Double{
    val formula = 9.0 / 5.0 * celcius + 32
    return formula
}

fun conversorCelcius(fareheit: Double){
    val formula = 5.0/9.0 * fareheit - 32
}

fun test(){
    val div = 9.0/5.0
    println(div)

}