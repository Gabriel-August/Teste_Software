package com.exemplo.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();
    @Test
    void deveSomarDoisNumeros() {
        assertEquals(5.0, calc.somar(2.0, 3.0));
    }
    @Test
    void deveSubtrairDoisNumeros() {
        assertEquals(1.0, calc.subtrair(3.0, 2.0));
    }
    @Test
    void deveMultiplicarDoisNumeros() {
        assertEquals(6.0, calc.multiplicar(2.0, 3.0));
    }
    @Test
    void deveDividirDoisNumeros() {
        assertEquals(2.0, calc.dividir(4.0, 2.0));
    }
    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(4.0, 0.0));
        assertEquals("Divisão por zero não é permitida.", ex.getMessage());
    }
}
