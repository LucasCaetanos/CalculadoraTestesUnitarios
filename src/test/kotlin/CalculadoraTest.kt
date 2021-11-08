import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {


    val calculadora = Calculadora()

    @Test
    fun soma() {
        kotlin.test.assertEquals(6, calculadora.soma(3,3))
    }

    @Test
    fun subtracao() {
        kotlin.test.assertEquals(15, calculadora.subtracao(18,3))
    }

    @Test
    fun multiplicacao() {
        kotlin.test.assertEquals(6, calculadora.multiplicacao(3,3))
    }

    @Test
    fun potencia() {
        kotlin.test.assertEquals(4.0,2.0,2.0)
    }
    @Test
    fun raiz() {
        kotlin.test.assertEquals(3.0, calculadora.raiz(9.0))
    }
}