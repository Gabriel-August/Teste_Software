package com.biblioteca.exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaBibliotecaTest {
@Test
    public void testeCadastroSucesso(){
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    boolean resultado = sistema.cadastrarUsuario("Gabriel","gabrielaugustohe@gmail.com","2005");  // <= informar os dados do usuario
    assertTrue(resultado);
}
  @Test
    public void testeCastroEmailDuplicado(){
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    sistema.cadastrarUsuario("Gabriel","gabrielaugustohe@gmail.com","2005");
    boolean resultado = sistema.cadastrarUsuario("Ana","gabrielaugustohe@gmail.com","2005");
    assertFalse(resultado);
  }

 @Test
    public void  testeCadastroCamposVazios(){
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    boolean resultado = sistema.cadastrarUsuario("Joao","joao123@gmail.com","1234");
    assertTrue(resultado);
 }

 @Test //email invalido
 public void testeCadastroEmailInvalido(){
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    boolean resultado = sistema.cadastrarUsuario("Pedro","pedrobeltrame.com","555" );
    assertFalse(resultado);
 }


@Test
public void testeCadastroComSenhaMuitoCurta() {
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    // Ação: Tenta cadastrar com uma senha de apenas 3 caracteres.
    boolean resultado = sistema.cadastrarUsuario("Mariana", "mariana@email.com", "123");

    // Verificação: O cadastro deve ser rejeitado.
    assertFalse(resultado, "O sistema não deveria aceitar senhas com menos de 6 caracteres.");
}

 }


