package gok.digital.praticandopadroes.flyweight

import java.util.*

object FiguraFactory {
    private val figuras =
        HashMap<String, Figura?>()

    @JvmStatic
    fun getFigura(nome: String): Figura? {
        var fig = figuras[nome]
        if (fig == null) {
            if (nome == "oval preenchida") {
                fig = Oval(true)
            } else if (nome == "oval n�o preenchida") {
                fig = Oval(false)
            } else if (nome == "linha") {
                fig = Linha()
            }
            figuras[nome] = fig
        }
        return fig
    }
}