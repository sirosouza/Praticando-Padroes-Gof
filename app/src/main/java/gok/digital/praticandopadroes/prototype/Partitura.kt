package gok.digital.praticandopadroes.prototype

import java.util.*

object Partitura {
    private val notaMap =
        Hashtable<String, NotaMusical>()

	fun carregaNotas() { //Adiciona todos os tipos de notas � estrutura hashtable
        val notaDo = Do()
        notaMap["Do"] = notaDo
        val notaRe = Re()
        notaMap["Re"] = notaRe
        val notaMi = Mi()
        notaMap["Mi"] = notaMi
        val notaFa = Fa()
        notaMap["Fa"] = notaFa
        val notaSol = Sol()
        notaMap["Sol"] = notaSol
        val notaLa = La()
        notaMap["La"] = notaLa
        val notaSi = Si()
        notaMap["Si"] = notaSi
    }

	fun getNota(nome: String?): NotaMusical {
        val nota = notaMap[nome]
        return nota!!.clone()
    }
}