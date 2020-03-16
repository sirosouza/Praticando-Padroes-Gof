package gok.digital.praticandopadroes.bridge

abstract class Professor protected constructor(imp: Implementador) {
	protected var imp: Implementador = ProfessorImplGraduacao()
    abstract fun op()

    init {
        this.imp = imp
    }
}