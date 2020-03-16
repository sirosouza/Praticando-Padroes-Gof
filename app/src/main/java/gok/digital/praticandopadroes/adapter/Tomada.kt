package gok.digital.praticandopadroes.adapter

//Target
abstract class Tomada<P> {
    abstract fun conecta(plug: P): String?
    abstract val nomeRede: String?
}