package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Estado {

    public void criaEstado(String uf, String pais_paisid, String nomeestado) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Estado (uf, pais_paisid, nomeestado) " +
                         "VALUES ('" + uf + "', '" + pais_paisid + "', '" + nomeestado + "')");
        
    }
}
