package gok.digital.praticandopadroes

import gok.digital.praticandopadroes.abstract_factory.Empresa
import gok.digital.praticandopadroes.abstract_factory.EmpresaOnibusInterestadual
import gok.digital.praticandopadroes.abstract_factory.EmpresaOnibusUrbano
import gok.digital.praticandopadroes.adapter.AdapterEUAtoBrasil
import gok.digital.praticandopadroes.adapter.PlugAmericano
import gok.digital.praticandopadroes.adapter.TomadaBrasileira
import gok.digital.praticandopadroes.bridge.Professor
import gok.digital.praticandopadroes.bridge.ProfessorGraduacao
import gok.digital.praticandopadroes.bridge.ProfessorImplGraduacao
import gok.digital.praticandopadroes.builder.Cozinha
import gok.digital.praticandopadroes.builder.FishBuilder
import gok.digital.praticandopadroes.builder.HamburguerBuilder
import gok.digital.praticandopadroes.builder.SanduicheBuilder
import gok.digital.praticandopadroes.composite.Gerente
import gok.digital.praticandopadroes.composite.Programador
import gok.digital.praticandopadroes.decorator.*
import gok.digital.praticandopadroes.facade.Facade
import gok.digital.praticandopadroes.factory_method.FactoryA
import gok.digital.praticandopadroes.factory_method.FactoryB
import gok.digital.praticandopadroes.flyweight.FiguraFactory.getFigura
import gok.digital.praticandopadroes.prototype.Partitura
import gok.digital.praticandopadroes.proxy.Image
import gok.digital.praticandopadroes.proxy.ProxyImage
import gok.digital.praticandopadroes.singleton.SingletonSample
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PadroesAGofTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun callSingleton() {
        SingletonSample.test()
    }

    @Test
    fun callFactoryMethod() {
        val factoryA = FactoryA()
        val factoryB = FactoryB()

        factoryA.showInformation("showing A")
        factoryB.showInformation("showing B")
    }

    @Test
    fun callAbstractFactory() {
        //Empresas de �nibus
        //Empresas de �nibus
        val viacaoABCLocal: Empresa = EmpresaOnibusUrbano()

        val viacaoXYZInter: Empresa = EmpresaOnibusInterestadual()

        //Emite passagens
        //Emite passagens
        val pUrbano = viacaoABCLocal.emitePassagem(
            "Sao Paulo",
            "Campinas",
            GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0)
        )

        val pInterestadual = viacaoXYZInter.emitePassagem(
            "Sao Paulo",
            "Rio de Janeiro",
            GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30)
        )

        //Exibe detalhes da passagem
        //Exibe detalhes da passagem
        pUrbano?.exibeDetalhes()

        pInterestadual?.exibeDetalhes()
    }

    @Test
    fun callBuilder() {
        val cozinha = Cozinha()
        //Builders
        //Builders
        val b1: SanduicheBuilder = HamburguerBuilder()
        val b2: SanduicheBuilder = FishBuilder()

        cozinha.fazSanduiche(b1)
        b1.sanduiche

        cozinha.fazSanduiche(b2)
        b2.sanduiche
    }

    @Test
    fun callPrototype() {
        //Carregar os diferentes tipos de notas musicais
        //Carregar os diferentes tipos de notas musicais
        Partitura.carregaNotas()

        //Compor a canção
        Partitura.getNota("Do").desenha()
        Partitura.getNota("Re").desenha()
        Partitura.getNota("Mi").desenha()
        Partitura.getNota("Fa").desenha()
        Partitura.getNota("Fa").desenha()
        Partitura.getNota("Fa").desenha()
        Partitura.getNota("Do").desenha()
        Partitura.getNota("Re").desenha()
        Partitura.getNota("Do").desenha()
        Partitura.getNota("Re").desenha()
        Partitura.getNota("Re").desenha()
        Partitura.getNota("Re").desenha()
    }

    @Test
    fun callBrigde() {
        val grad: Professor = ProfessorGraduacao(ProfessorImplGraduacao())
        grad.op()
    }

    @Test
    fun callAdapter() {
        //Target
        //Target
        val tomadaBras = TomadaBrasileira()

        //Adaptado
        //Adaptado
        val plugEUA = PlugAmericano()

        val tomadaModificada = AdapterEUAtoBrasil()
        val s = tomadaModificada.conecta(plugEUA)

        println(s)
    }

    @Test
    fun callProxy() {
        val image1: Image = ProxyImage("HiRes_10MB_Photo1")
        val image2: Image = ProxyImage("HiRes_10MB_Photo2")

        image1.displayImage()
        image2.displayImage()

        image1.displayImage()
    }

    @Test
    fun callDecorator() {
        var a: Arvore = ArvoreNatal()

        a = Estrela(a)
        a = Bola(a)
        a = Bola(a)
        a = Bola(a)
        a = Bola(a)
        a = Bola(a)
        a = PiscaPisca(a)

        a.showEnfeites()
    }

    @Test
    fun callComposite() {
        //Cria programadores (folhas)
        //Cria programadores (folhas)
        val pEstagiario = Programador("Jos�", 900.0)
        val pJunior = Programador("Pedro", 2900.0)
        val pSenior = Programador("Ricardo", 3900.0)

        //Gerentes
        //Gerentes
        val g3 = Gerente("Jo�o", 15000.0)
        val g2 = Gerente("Maria", 10000.0)
        val g1 = Gerente("Carlos", 5000.0)

        //Montar a estrutura em �rvore

        //Carlos superviosiona os programadores Jos� e Pedro
        //Montar a estrutura em �rvore
//Carlos superviosiona os programadores Jos� e Pedro
        g1.add(pEstagiario)
        g1.add(pJunior)

        //Maria superviosiona o programador Ricardo
        //Maria superviosiona o programador Ricardo
        g2.add(pSenior)

        //Jo�o � raiz da estrutura em �rvore
        //Jo�o � raiz da estrutura em �rvore
        g3.add(g1)
        g3.add(g2)

        g3.print()
    }

    @Test
    fun callFacade() {
        val facade = Facade()

        facade.metodoA()
    }

    @Test
    fun callFlyWeight() {
        var f = getFigura("linha")
        f?.desenha("amarela")

        f = getFigura("oval n�o preenchida")
        f?.desenha("vermelha")
    }
}
