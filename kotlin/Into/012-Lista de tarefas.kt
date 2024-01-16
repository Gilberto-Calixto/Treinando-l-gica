package Into

import java.awt.Component

fun main() {

    //dividir pra conquistar
    //1 add tarefas ... testar

    //após terminar as funções principais ver comentários de melhorias e verificações

    //fez a parte então testa!!



    // Lista para armazenar as tarefas
    val tasks = mutableListOf<String>()

    while (true){

        println()

        println("Escola uma opção: \n[1] Adicionar tarefa \n[2] remover tarefa" +
                "\n[3] Listar tarefas \n[4] sair")

        println()
        when(readln().toInt()){

            1 -> {
                // Adição de uma nova tarefa
                println("Tarefa a ser adicionada: ")
                val addTarefa = readln()

                //adicionando prioridade
                println("""Prioridade da tarefa: 
                    |1 - Alta
                    |2 - Média
                    |3 - Baixa
                """.trimMargin())
                val opPrioridade = readln().toInt()

                //add descrição com o data class e prioridade


                if (opPrioridade == 1){
                    println("Descrição da tarefa: ")
                    val descr = Task(Prioridade.Alta, readln())
                    val resp = descr.descricao

                    tasks.add(addTarefa + " || Prioridade: " + Prioridade.Alta + " \nDescrição: " + resp)

                }else if(opPrioridade == 2){
                    tasks.add(addTarefa + " || Prioridade: " + Prioridade.Media)
                }else if(opPrioridade == 3){
                    tasks.add(addTarefa + " || Prioridade: " + Prioridade.Baixa)
                } else println("Opção não existente.")

                //verificar se está vazio
                //mensagem de tarefa adicionada com sucesso
            }
            2 -> {
                //escolher qual tarefa quer remover
                println("Qual tarefa vai remover:")

                //for para mostrar as tarefas numeradas
                for (i in 1..tasks.size){
                    val listt = "$i - ${tasks[i - 1]}"
                    println(listt)
                }

                // Lê a opção do usuário para remover a tarefa
                print("Tarefa numero: ")
                val opcao = readln().toInt()

                // Verifica se a tarefa selecionada existe antes de removê-la
                if ( opcao == 1){
                    tasks.remove(tasks[0])
                    println("Tarefa removida com sucesso!")

                }else println("Tarefa inesostente!")
            }
            3 -> {
                // Listagem de todas as tarefas
                for (i in 1.. tasks.size){

                    val listt = "$i - ${tasks[i - 1]}"
                    println(listt)

                }

            }
            4 -> return // Encerra o programa quando o usuário escolhe sair

        }
    }
}

//implementar prioridade de tarefas
enum class Prioridade{
    Alta,
    Media,
    Baixa
}

data class Task(val prioridad: Prioridade, var descricao: String)