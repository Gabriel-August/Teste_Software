package com.exemplo.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIntegrationTest {

    @Test
    void testExpressaoSimples() {
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);

        int resultado = service.calcularExpressaoSimples(2, 3);
        // (2 + 3) + (2 * 3) = 5 + 6 = 11
        assertEquals(11, resultado);
    }
    @Test
    void testExpressionSimples2(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);

        int resultado = service.calcularExpressaoSimples1(10,2);
        //(10/2) + (2-3) = 4
        assertEquals(13,resultado);
    }
    @Test
    void testExpressionSimples3(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        //(10 + 2) + (10 - 2) = 20
        int resultado = service.calcularExpressaoSimples2(10,2);

        assertEquals(13,resultado);
    }

    @Test
    void testExpressionSimples4(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        int resultado = service.calcularExpressaoSimples3(20, 5);

                assertEquals(115, resultado);
    }

    @Test
    void testEspressionSimples5(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        int resultado = service.calcularExpressaoSimples4(10, 10);
           //(10 + 10) + (10 * 10) = 20 + 100 = 120
        assertEquals(120, resultado);
    }

    @Test
    void testEspressionSimples6(){
        Calculadora calculadora = new Calculadora();
        CalculadoraService service = new CalculadoraService(calculadora);
        //(100 / 2) + (100 + 2) = 50 + 102 = 152
        int resultado = service.calcularExpressaoSimples5(100, 2);

        assertEquals(152, resultado);
    }
}