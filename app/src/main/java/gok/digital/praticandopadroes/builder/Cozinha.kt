package gok.digital.praticandopadroes.builder

class Cozinha {
    fun fazSanduiche(builder: SanduicheBuilder) {
        builder.abrePao()
        builder.insereIngredientes()
        builder.fechaPao()
    }
}