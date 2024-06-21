package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Projeto {

	
    public void criaProjeto(String nomeprojeto, String espaco_espacoid, String equipe_equipeid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO projeto (nomeprojeto, espaco_espacoid, equipe_equipeid) " +
                         "VALUES ('" + nomeprojeto + "', '" + espaco_espacoid + "', '" + equipe_equipeid + "')");
        
    }
}
