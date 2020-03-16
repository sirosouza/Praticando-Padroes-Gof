package gok.digital.praticandopadroes.bridge

class ProfessorPosGraduacao(imp: Implementador?) : Professor(imp!!) {
    override fun op() {
        imp.opImpl()
    }
}