package gok.digital.praticandopadroes.proxy

// Sistema B
class ProxyImage(private val filename: String) :
    Image() {
    private var image: RealImage? = null
    override fun displayImage() {
        if (image == null) {
            image = RealImage(filename)
        }
        image!!.displayImage()
    }

}