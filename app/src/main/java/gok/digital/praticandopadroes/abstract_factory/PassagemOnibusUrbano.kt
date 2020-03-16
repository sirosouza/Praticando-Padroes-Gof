package gok.digital.praticandopadroes.abstract_factory

import java.util.*

//Produto concreto
class PassagemOnibusUrbano(
    origem: String?,
    destino: String?,
    dataHoraPartida: Calendar?
) : Passagem(origem, destino, dataHoraPartida) {
    override fun exibeDetalhes() {
        println(
            "Passagem de onibus urbana: " + origem +
                    " para " + destino +
                    ", Data/Hora: " + super.df.format(dataHoraPartida?.time)
        )
    }
}