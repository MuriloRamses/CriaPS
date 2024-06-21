package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Espaco {

	
    public void criaEspaco(String nomeespaco) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Espaco (nomeespaco) " +
                         "VALUES ('" + nomeespaco + "')");
        
    }
}
