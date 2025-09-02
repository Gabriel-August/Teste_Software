package com.exemplo.calculadora;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraSteps {
    private Calculadora calc = new Calculadora();
    private double a, b, resultado;
    @Given("que eu tenho os números {double} e {double}")
    public void queEuTenhoOsNumeros(Double num1, Double num2) { a = num1; b = num2; }
    @When("eu somo os dois números")
    public void euSomoOsDoisNumeros() { resultado = calc.somar(a,b); }
    @When("eu divido o primeiro pelo segundo")
    public void euDividoOPrimeiroPeloSegundo() { resultado = calc.dividir(a,b); }
    @When("eu subtraio o primeiro pelo segundo")
    public void euSubtraioOPrimeiroPeloSegundo() { resultado = calc.subtrair(a,b); }
    @Then("o resultado deve ser {double}")
    public void oResultadoDeveSer(Double esperado) { assertEquals(esperado, resultado); }
    @When("eu Multiplico o primeiro pelo segundo")
    public void euMultiplicooprimeiropelosegundo() {resultado = calc.multiplicar(a,b);}
}