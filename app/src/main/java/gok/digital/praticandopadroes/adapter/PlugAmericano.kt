package gok.digital.praticandopadroes.adapter

class PlugAmericano : Plug() {
    override fun obtemEletricidade(): String? {
        return "Plug americando conectado � "
    }
}