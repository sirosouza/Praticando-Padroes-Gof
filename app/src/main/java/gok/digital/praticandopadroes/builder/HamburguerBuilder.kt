package gok.digital.praticandopadroes.builder

class HamburguerBuilder : SanduicheBuilder() {
    private val s: Sanduiche = Hamburguer()
    override fun abrePao() {
        println("Abre pao de hamburguer.")
    }

    override fun insereIngredientes() {
        println("Insere carne e queijo.")
    }

    override fun fechaPao() {
        println("Fecha pao de hamburguer.")
    }

    override fun getSanduiche(): Sanduiche {
        println("Hamburguer esta pronto !")
        return s
    }
}