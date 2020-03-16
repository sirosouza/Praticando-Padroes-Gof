package gok.digital.praticandopadroes.decorator

//ConcreteDecorator
class Estrela(a: Arvore?) : Decoracao(a!!) {
    override fun showEnfeites() {
        super.showEnfeites()
        print("Estrela, ")
    }
}