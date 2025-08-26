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

    @Test
    public void testeCadastroComSenhaNoLimiteMinimo() {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        //  Tenta cadastrar com uma senha que tem EXATAMENTE 6 caracteres.
        boolean resultado = sistema.cadastrarUsuario("Mariana", "mariana@email.com", "123456");
        assertTrue(resultado, "Uma senha com 6 caracteres deveria ser aceita.");
    }

    @Test
    public void testeCadastroComEmailInvalidoESenhaCurtaDeveFalhar() {
        SistemaBiblioteca sistema = new SistemaBiblioteca();
        // Ação: Tenta cadastrar com um e-mail sem "@" E uma senha curta.
        boolean resultado = sistema.cadastrarUsuario("Jorge", "jorge.email.com", "123");

        // Verificação: O cadastro deve falhar.
        // O importante aqui é que o sistema não quebre e retorne 'false' corretamente.
        assertFalse(resultado, "O cadastro deveria falhar por ter múltiplos erros.");
    }
}






