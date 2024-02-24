fun main() {
    var nome : String? = null
    nome = "Fernando"

    // Dessa forma, podemos declarar o valor depois da variável criada porque a mesma está definida como nullable
    val sobrenome: String?
    sobrenome = "Felício"
    // sobrenome = null // depois do valor definido, não pode mais alterar o valor, caso a variável 'sobrenome' fosse criada com a palavra chave 'var', não daria problema

    println("Nome completo: $nome $sobrenome")

    nome = null // como a variável 'nome' foi definida com a palavra chave 'var, foi possível atribuir o valor null
    println("Nome completo (nome nulo): $nome $sobrenome")


    // exemplo com readliine (pegando os valores via linha de comando)
    var nomeComLinhaDeComando : String? = null
    var idade : Int? = null
    var altura : Double? = null

    print("Digite o nome: ")
    nomeComLinhaDeComando = readln()
    print("Digite a idade: ")
    idade = readln().toInt()
    print("Digite a altura: ")
    altura = readln().replace(",", ".").toDouble()

    println("Nome: $nomeComLinhaDeComando\nidade: $idade\naltura = $altura")
}