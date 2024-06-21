package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Usuario {

    public void criaUsuario(String nickname, String senha, String ri, String pessoa_pessoaid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO usuario (nickname, senha, ri, pessoa_pessoaid) " +
                         "VALUES ('" + nickname + "', '" + senha + "', '" + ri + "', '" + pessoa_pessoaid + "')");
        
    }
}
