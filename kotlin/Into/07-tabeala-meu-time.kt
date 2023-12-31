package Into

fun main(){

    //entradas

//    val timeBe = "S.O.S Beto"
//    val vitorias: Int = 5
//
//    val derrotas: Int = 4
//
//    val empates: Int = 3
    val time1 = "Bestx"
    val time2 = "Dsx"


    //processos

    fun time(time: String, vitorias: Int, derrotas: Int, empates: Int): Int{
        val resultado = (vitorias * 3) + empates
        return resultado

    }

    val beto = time(time1, 5,2,3)
    val vix = time(time1, 5,2,3)

    val tabela =

//    val pontos = (vitorias * 3) + empates

    //saidas

    println("o time $time1 fez: " + time(time1, 5,2,3))
    println("o time $time2 fez: " + time(time2, 3,0,7))
    println("Fim")

}