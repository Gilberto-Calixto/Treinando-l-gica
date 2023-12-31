package Into

fun main() {

    //entrada

    print("Altura: ")
    val altura: Double = readln().toDouble()

    print("Peso: ")
    val peso: Double = readln().toDouble()

    print("Nome: ")
    val nome: String = readln()

    //processos
    val imc = calcular_imc(altura, peso)

    //saidas
    println("$nome Seu imc é $imc")

}
fun calcular_imc(altura: Double, peso: Double): Float{
    val resultado = peso / (altura * altura)

    return resultado.toFloat()
}