package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Equipe {

	
    public void criaEquipe(String nomeequipe) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO equipe (nomeequipe) " +
                         "VALUES ('" + nomeequipe + "')");
        
    }
}
