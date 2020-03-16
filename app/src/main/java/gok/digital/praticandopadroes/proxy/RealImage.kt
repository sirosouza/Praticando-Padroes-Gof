package gok.digital.praticandopadroes.proxy

// Sistema A
class RealImage(private val filename: String) : Image() {
    private fun loadImageFromDisk() {
        println("Loading   $filename")
    }

    override fun displayImage() {
        println("Displaying $filename")
    }

    init {
        loadImageFromDisk()
    }
}