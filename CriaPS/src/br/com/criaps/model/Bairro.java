package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Bairro {

    public void criaBairro(String nomebairro, String cidade_cidadeid, String cidade_estado_estadoid, String cidade_estado_pais_paisid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO bairro (nomebairro, cidade_cidadeid, cidade_estado_estadoid, cidade_estado_pais_paisid) " +
                         "VALUES ('" + nomebairro + "', '" + cidade_cidadeid + "', '" + cidade_estado_estadoid + "', '" + cidade_estado_pais_paisid + "')");
        
    }
}
