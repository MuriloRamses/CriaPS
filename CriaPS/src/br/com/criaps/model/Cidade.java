package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Cidade {

	
    public void criaCidade(String nomecidade, String estado_estadoid, String estado_pais_paisid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Cidade (nomecidade, estado_estadoid, estado_pais_paisid) " +
                         "VALUES ('" + nomecidade + "', '" + estado_estadoid + "', '" + estado_pais_paisid + "')");
        
    }
}
