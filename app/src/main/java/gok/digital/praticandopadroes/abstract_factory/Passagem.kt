package gok.digital.praticandopadroes.abstract_factory

import java.text.SimpleDateFormat
import java.util.*

//Produto
abstract class Passagem(
    var origem: String?,
    var destino: String?,
    var dataHoraPartida: Calendar?
) {
    //Formatador da data
    protected var df = SimpleDateFormat("dd/MM/yyyy HH:mm")

    abstract fun exibeDetalhes()

}