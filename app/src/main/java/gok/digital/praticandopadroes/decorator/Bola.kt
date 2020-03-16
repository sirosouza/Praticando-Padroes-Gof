package gok.digital.praticandopadroes.decorator

//ConcreteDecorator
class Bola(a: Arvore?) : Decoracao(a) {
    override fun showEnfeites() {
        super.showEnfeites()
        print("Bola, ")
    }
}