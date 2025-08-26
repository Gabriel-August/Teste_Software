package com.biblioteca.exercicio;

import java.util.HashSet;
import java.util.Set;

public class SistemaBiblioteca {

//    private Set<String> usuariosCadastrados = new HashSet<>();
//
//    public boolean cadastrarUsuario(String nome, String email, String senha) {
//        if (email == null || !email.contains("@")) {
//            return false; // Se não tiver "@", falha.
//        }
//
//        // Se passar, o cadastro continua...
//        System.out.println("Usuário cadastrado com sucesso!");
//        return true; // Sucesso!
//    }

        private Set<String> usuariosCadastrados = new HashSet<>();

        public boolean cadastrarUsuario(String nome, String email, String senha) {
            // --- INÍCIO DAS VALIDAÇÕES (Fail-Fast) ---
            // Primeiro, verificamos todas as razões para o cadastro FALHAR.

            // Validação 1: Formato do e-mail
            if (email == null || !email.contains("@")) {
                System.err.println("Erro: O formato do e-mail é inválido.");
                return false;
            }

            // Validação 2: Regra de negócio da senha
            // (Adicionei uma verificação de 'senha == null' por segurança)
            if (senha == null || senha.length() < 6) {
                System.err.println("Erro: A senha deve ter pelo menos 6 caracteres.");
                return false;
            }

            // Validação 3: E-mail duplicado
            if (usuariosCadastrados.contains(email)) {
                System.err.println("Erro: O e-mail informado já está cadastrado.");
                return false;
            }

            // --- FIM DAS VALIDAÇÕES ---

            // Se o código chegou até aqui, significa que todos os dados são válidos.
            // Agora, podemos executar a ação de sucesso.

            System.out.println("Usuário cadastrado com sucesso!");
            usuariosCadastrados.add(email); // Adiciona o e-mail ao conjunto
            return true; // Retorna sucesso
        }
    }







