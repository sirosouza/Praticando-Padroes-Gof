package gok.digital.praticandopadroes.facade

internal class Facade {
    private val sis1: SubsistemaUm
    private val sis2: SubsistemaDois
    private val sis3: SubsistemaTres
    fun metodoA() {
        sis1.metodoUm() //subsistema 1
        sis2.metodoDois() //subsistema 2
        sis3.metodoTres() //subsistema 3
    }

    fun metodoB() {
        sis3.metodoTres() //subsistema 3
        sis2.metodoDois() //subsistema 2
        sis1.metodoUm() //subsistema 1
    }

    init {
        sis1 = SubsistemaUm()
        sis2 = SubsistemaDois()
        sis3 = SubsistemaTres()
    }
}