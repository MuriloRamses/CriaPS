package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class TipoContato {

	
    public void criaTipocontato(String nometipocontato) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO tipocontato (nometipocontato) " +
                         "VALUES ('" + nometipocontato + "')");
        
    }
}
