package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Rua {

	
    public void criaRua(String nomerua, String bairro_bairroid, String bairro_cidade_cidadeid, String bairro_cidade_estado_estadoid, String bairro_cidade_estado_pais_paisid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO rua (nomerua, bairro_bairroid, bairro_cidade_cidadeid, bairro_cidade_estado_estadoid,bairro_cidade_estado_pais_paisid) " +
                         "VALUES ('" + nomerua + "', '" + bairro_bairroid + "', '" + bairro_cidade_cidadeid + "', '" + bairro_cidade_estado_estadoid + "', '" + bairro_cidade_estado_pais_paisid + "')");
        
    }
}
