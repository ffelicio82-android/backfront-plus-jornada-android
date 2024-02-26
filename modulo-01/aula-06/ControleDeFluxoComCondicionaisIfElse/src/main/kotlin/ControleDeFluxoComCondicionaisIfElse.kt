/*
 * Expressões
 *
 * == : igual
 * != : diferente
 * >  : maior
 * >= : maior ou igual
 * <  : menor
 * <= : menor ou igual
 */

fun main() {
    val idade : Int = 41

    ifElse(idade = idade)
    ifElseElseIf(idade = idade)
    comWhen(idade = idade)
}

fun ifElse(idade : Int) {
    if(idade >= 18) {
        println("pode dirigir")
    } else {
        println("não pode dirigir")
    }
}

fun ifElseElseIf(idade : Int) {
    if(idade >= 42) {
        println("entrou no if")
    } else if(idade >= 43) {
        println("entrou no else - if")
    } else {
        println("entrou no else")
    }
}

fun comWhen(idade : Int) {
    when(idade) {
        1 -> { println("[when]: entrou no 1") }
        in 2..10 -> { println("[when]: entrou no intervalo entre 2 e 10") }
        in 11..50 ->  { println("[when]: entrou no intervalo entre 11 e 50") }
        else -> println("[when]: não se encontra em outras condições")
    }
}