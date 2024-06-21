package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Contato {

	
    public void criaContato(String valor, String pessoa_pessoaid, String tipocontato_tipocontatoid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Contato (valor, pessoa_pessoaid, tipocontato_tipocontatoid) " +
                         "VALUES ('" + valor + "', '" + pessoa_pessoaid + "', '" + tipocontato_tipocontatoid + "')");
        
    }
}
