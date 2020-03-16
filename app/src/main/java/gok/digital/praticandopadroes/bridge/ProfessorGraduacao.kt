package gok.digital.praticandopadroes.bridge

class ProfessorGraduacao(imp: Implementador?) : Professor(imp!!) {
    override fun op() {
        println("Olá")
        imp.opImpl()
    }
}