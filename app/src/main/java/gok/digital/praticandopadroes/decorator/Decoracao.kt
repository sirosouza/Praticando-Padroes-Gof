package gok.digital.praticandopadroes.decorator

//Decorator
abstract class Decoracao(private val arvore: Arvore) : Arvore() {
    override fun showEnfeites() {
        arvore.showEnfeites()
    }

}