fun main() {
    /*
     * var = variável mutável - pode ser alterado
     * val = variável imutável - constante (uma vez definida não pode ter o valor alterado)
     */

    var nome : String = "Fernando"
    println(nome)

    nome = "$nome Felicio"
    println(nome)

    val idade : Int = 41
    println(idade)

    // na linha abaixo será informado um erro. Variáveis criadas com a palavra chave "val", não pode ter o seu conteúdo modificado
    // idade = 42 // descomentar para ver o erro

    // O Kotlin possui inferência de tipo, ou seja, na criação da variável não é necessário definir o tipo.
    // Quando o valor for atribuído, a linguagem automaticamente saberá qual o tipo de dado armazenado.
    var nomeSemTipoDeclarado = "Nick"
    println(nomeSemTipoDeclarado)
}