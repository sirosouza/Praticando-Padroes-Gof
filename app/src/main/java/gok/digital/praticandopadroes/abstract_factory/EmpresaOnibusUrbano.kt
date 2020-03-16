package gok.digital.praticandopadroes.abstract_factory

import java.util.*

//F�brica concreta
class EmpresaOnibusUrbano : Empresa() {
    override fun emitePassagem(
        origem: String?,
        destino: String?,
        dataHoraPartida: Calendar?
    ): Passagem {
        return PassagemOnibusUrbano(origem, destino, dataHoraPartida)
    }
}