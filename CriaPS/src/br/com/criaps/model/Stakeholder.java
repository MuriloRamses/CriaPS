package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Stakeholder {

    public void criaStakeholder(String nomestakeholder) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO stakeholder (nomestakeholder) " +
                         "VALUES ('" + nomestakeholder + "')");
        
    }
}
