package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();
    @Test
    public void testSoma(){
        assertEquals(6,calc.somar(3,3));

    }
    @Test
    public void testSubtrair(){
        assertEquals(-9, calc.subtrair(1, 10));
    }
    @Test
    public void testMultiplicar(){
        assertEquals(4, calc.multiplicar(2, 2));
    }

    @Test
    public void testDividir(){
        assertEquals(25, calc.dividir(50, 2),0.01);
    }

}
