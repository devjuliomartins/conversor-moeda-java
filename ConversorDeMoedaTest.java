package aulas.aula3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeMoedaTest {

    private final ConversorDeMoeda conversor = new ConversorDeMoeda();

    @Test
    void deveConverterUsdParaBrl() {
        double resultado = conversor.converter(100, "USD", "BRL", false);
        assertEquals(500, resultado, 0.01);
    }

    @Test
    void deveConverterBrlParaUsd() {
        double resultado = conversor.converter(1000, "BRL", "USD", false);
        assertEquals(200, resultado, 0.01);
    }

    @Test
    void deveConverterEurParaBrl() {
        double resultado = conversor.converter(1000, "EUR", "BRL", false);
        assertEquals(6000, resultado, 0.01);
    }

    @Test
    void deveConverterBrlParaEur() {
        double resultado = conversor.converter(1000, "BRL", "EUR", false);
        assertEquals(170, resultado, 0.01);
    }

    @Test
    void deveConverterJpyParaBrl() {
        double resultado = conversor.converter(100, "JPY", "BRL", false);
        assertEquals(3.5, resultado, 0.01);
    }

    @Test
    void deveConverterBrlParaJpy() {
        double resultado = conversor.converter(1000, "BRL", "JPY", false);
        assertEquals(26790.0, resultado, 0.01);
//        valor acima de 10.000 recebe 0.94 descontos!
    }

    @Test
    void deveManterValorQuandoForMesmaMoeda() {
        assertEquals(100, conversor.converter(100, "BRL","BRL", false));
    }

    @Test
    void deveAplicarDescontoClienteVip() {
        double normal = conversor.converter(100, "USD", "BRL", false);
        double vip = conversor.converter(100, "USD", "BRL", true);
        assertTrue(vip < normal);
    }

    @Test
    void deveAplicarIofParaValoresAltos() {
        double resultado = conversor.converter(5000, "USD", "BRL", false);
        assertTrue(resultado < 5000 * 5.0); // IOF reduz valor
    }

    @Test
    void excecaoParaValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.converter(-100, "USD", "BRL", false);
        });
    }

    @Test
    void excecaoParaConversaoNaoSuportada() {
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.converter(100, "INR", "BRL", false);
        });
    }
}
