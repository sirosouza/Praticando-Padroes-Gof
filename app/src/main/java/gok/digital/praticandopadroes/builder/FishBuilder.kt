package gok.digital.praticandopadroes.builder

class FishBuilder : SanduicheBuilder() {
    private val s: Sanduiche = Fishburguer()
    override fun abrePao() {
        println("Abre p�o de fishburguer.")
    }

    override fun insereIngredientes() {
        println("Insere fil� de peixe.")
    }

    override fun fechaPao() {
        println("Fecha p�o de fishburguer.")
    }

    override fun getSanduiche(): Sanduiche {
        println("Fishburguer est� pronto !")
        return s
    }
}