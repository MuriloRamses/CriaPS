package br.com.criaps.controller;

import java.sql.SQLException;


import br.com.criaps.model.Usuario;

public class UsuarioCtrl {

	
    public void salvarUsuario() throws SQLException {

        Usuario u = new Usuario();

        try {
            String nickname;
            String senha;
            String ri;
            String pessoa_pessoaid;       

            nickname = "pedro";
            senha = "123";
            ri = "1";
            pessoa_pessoaid = "1";
            u.criaUsuario(nickname, senha, ri, pessoa_pessoaid);

            nickname = "murilo";
            senha = "123";
            ri = "2";
            pessoa_pessoaid = "2";
            u.criaUsuario(nickname, senha, ri, pessoa_pessoaid);
            
            nickname = "larissa";
            senha = "123";
            ri = "3";
            pessoa_pessoaid = "3";
            u.criaUsuario(nickname, senha, ri, pessoa_pessoaid);


            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
