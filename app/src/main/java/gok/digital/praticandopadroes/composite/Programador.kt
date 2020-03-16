package gok.digital.praticandopadroes.composite

//Leaf
class Programador(nome: String?, salario: Double) :
    Empregado(nome!!, salario) {
    //Exibe detalhes do empregado
    override fun print() {
        println(super.nome + ", $" + super.salario)
    }

    //Adiciona empregado � estrutura.
    override fun add(e: Empregado?) {
        println("N�o � poss�vel adicionar empregado subordinado do programador")
    }

    //Remove empregado da estrutura.
    override fun remove(e: Empregado?) {
        println("N�o � poss�vel remover empregado subordinado do programador")
    }
}