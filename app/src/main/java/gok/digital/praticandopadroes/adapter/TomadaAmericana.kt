package gok.digital.praticandopadroes.adapter

class TomadaAmericana : Tomada<PlugAmericano?>() {
    override fun conecta(plug: PlugAmericano?): String? {
        return plug?.obtemEletricidade() + nomeRede
    }

    override val nomeRede: String
        get() = "tomada americana"
}