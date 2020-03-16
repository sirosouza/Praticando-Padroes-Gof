package gok.digital.praticandopadroes.adapter

open class TomadaBrasileira : Tomada<PlugBrasileiro?>() {
    override fun conecta(plug: PlugBrasileiro?): String? {
        return plug?.obtemEletricidade() + nomeRede
    }

    override val nomeRede: String
        get() = "tomada brasileira"
}