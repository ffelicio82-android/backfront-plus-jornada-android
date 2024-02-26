/*
 * Funções
 *
 * Trechos de código usados para realizar uma determinada tarefa
 * Com ou sem parâmetros (Input)
 * Com ou sem retorno (Output)
 */

// função de entrada (porta de entrada dos programas)
// fun - palavra reservada
// main - nome da função
// () - lista de parâmetro vazio
// {} - escopo da função
fun main() {
    somaIdade(41)
    println("soma idade com retorno: ${somaIdadeComRetorno(idade = 41)}")

    parametroComFuncao(funcao = {
        println("parâmetro com função")
        somaIdade(41)
    })

    // forma 1
    val resultado1 = parametroComFuncaoERetorno(funcao = {
        valor: Int -> valor * 1000
    })
    println(resultado1) // Imprime 5000

    // forma 2
    val funcaoLambda : (valor: Int) -> Int = { valor -> valor * 2 }
    val resultado2 = parametroComFuncaoERetorno(funcaoLambda)
    println(resultado2) // Imprime 10

    // forma 3
    val resultado = parametroComFuncaoERetorno2 {
        dobrarValor(10)
    }
    println(resultado) // Imprime 10
}

// fun - palavra reservada
// main - nome da função
// (idade : Int) - parâmetro da idade do tipo inteiro
// {} - escopo da função
private fun somaIdade(idade : Int) {
    println("${idade.plus(10)}")
}

// fun - palavra reservada
// main - nome da função
// (idade : Int) - parâmetro da idade do tipo inteiro e retorno do tipo inteiro
// {} - escopo da função
private fun somaIdadeComRetorno(idade : Int) : Int {
    return idade.plus(1)
}

private fun parametroComFuncao(funcao : () -> Unit) {
    funcao()
}

private fun parametroComFuncaoERetorno(funcao : (valor: Int) -> Int) : Int {
    return funcao(5)
}

private fun parametroComFuncaoERetorno2(funcao: (Int) -> Int): Int {
    return funcao(5)
}

fun dobrarValor(valor: Int) : Int {
    return valor * 2
}