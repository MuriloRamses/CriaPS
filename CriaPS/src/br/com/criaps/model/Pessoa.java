package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;



public class Pessoa {
		
	    public void criaPessoa(String pessoaid) throws SQLException {

	        Statement stmt = null;
	        
	            stmt = ConexaoDB.conectar();
	            
	            stmt.execute("INSERT INTO pessoa (pessoaid) " +
	                         "VALUES ('" + pessoaid + "')");
	        
	    
	}
}

