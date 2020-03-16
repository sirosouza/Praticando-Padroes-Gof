package gok.digital.praticandopadroes.decorator

//ConcreteDecorator
class PiscaPisca(a: Arvore?) : Decoracao(a!!) {
    override fun showEnfeites() {
        super.showEnfeites()
        print("Pisca-pisca, ")
    }
}