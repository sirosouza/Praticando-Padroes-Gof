package gok.digital.praticandopadroes.prototype

abstract class NotaMusical : Cloneable {
    public override fun clone(): NotaMusical {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (ex: CloneNotSupportedException) {
            ex.printStackTrace()
        }
        return clone as NotaMusical
    }

    abstract fun desenha()
}