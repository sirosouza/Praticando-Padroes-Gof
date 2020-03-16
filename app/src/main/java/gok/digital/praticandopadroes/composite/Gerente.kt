package gok.digital.praticandopadroes.composite

import java.util.*

//Composite
class Gerente(nome: String?, salario: Double) : Empregado(nome!!, salario) {
    //Collection of child graphics.
    private val listaSubordinados: MutableList<Empregado?> =
        ArrayList()

    //Exibe a estrutura
    override fun print() {
        println(super.nome + ", $" + super.salario)
        for (e in listaSubordinados) {
            e!!.print()
        }
    }

    //Adiciona empregado � estrutura.
    override fun add(e: Empregado?) {
        listaSubordinados.add(e)
    }

    //Remove empregado da estrutura.
    override fun remove(e: Empregado?) {
        listaSubordinados.remove(e)
    }
}