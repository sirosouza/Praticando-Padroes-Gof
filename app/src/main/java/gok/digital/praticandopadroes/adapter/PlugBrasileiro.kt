package gok.digital.praticandopadroes.adapter

class PlugBrasileiro : Plug() {
    override fun obtemEletricidade(): String? {
        return "Plug brasileiro conectado � "
    }
}