package com.exemplo.calculadora;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Epic("Calculadora")
@Feature("Operações básicas")
public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    @Story("Soma")
    @Description("Testa soma de dois números")
    public void testeSoma() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    @Story("Divisão")
    @Description("Testa divisão de dois números")
    public void testeDivisao() {
        assertEquals(2, calc.dividir(4, 2));
    }

    @Test
    @Story("subtrair")
    @Description("Testa  subtração de sois valores")
    public void testeSubtrair() {
        assertEquals(8.0, 16.0, 8.0);
    }

    @Test
    @Story("Multiplicação")
    @Description("Testa a multiplicação de dois números")
    public void testeMultiplicar() {
        assertEquals(4, calc.multiplicar(2, 2));
    }

    @Test
    @Story("Divisão")
    @Description("Testa a divisão por zero, que deve lançar uma exceção")
    public void testeDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10.0, 0.0);
        });

    }
}