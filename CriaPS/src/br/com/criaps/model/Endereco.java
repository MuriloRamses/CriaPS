package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Endereco {

	
    public void criaEndereco(String complemento, String cep, String numero, String rua_ruaid, String rua_bairro_bairroid, String rua_bairro_cidade_cidadeid, String rua_bairro_cidade_estado_estadoid, String rua_bairro_cidade_estado_pais_paisid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO endereco (complemento, cep, numero, rua_ruaid, rua_bairro_bairroid,rua_bairro_cidade_cidadeid, rua_bairro_cidade_estado_estadoid, rua_bairro_cidade_estado_pais_paisid) " +
                         "VALUES ('" + complemento + "', '" + cep + "', '" + numero + "', '" + rua_ruaid + "', '" + rua_bairro_bairroid + "', '" + rua_bairro_cidade_cidadeid + "', '" + rua_bairro_cidade_estado_estadoid + "', '" + rua_bairro_cidade_estado_pais_paisid + "')");
        
    }
}
