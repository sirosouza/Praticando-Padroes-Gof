package gok.digital.praticandopadroes.abstract_factory

import java.util.*

//Fabrica concreta
class EmpresaOnibusInterestadual : Empresa() {
    override fun emitePassagem(
        origem: String?,
        destino: String?,
        dataHoraPartida: Calendar?
    ): Passagem? {
        return PassagemOnibusInterestadual(origem, destino, dataHoraPartida)
    }
}