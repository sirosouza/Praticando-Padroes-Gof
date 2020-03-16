package gok.digital.praticandopadroes.composite

//Component
abstract class Empregado(protected var nome: String, protected var salario: Double) {
    //Exibe detalhes do empregado
    abstract fun print()

    abstract fun add(e: Empregado?)
    abstract fun remove(e: Empregado?)

}