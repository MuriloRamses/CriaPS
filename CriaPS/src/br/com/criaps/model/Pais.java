package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Pais {
	
    public void criaPais(String sigla, String codigo, String nomepais) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Pais (sigla, codigo, nomepais) " +
                         "VALUES ('" + sigla + "', '" + codigo + "', '" + nomepais + "')");
        
    }

}
