package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class PessoaEndereco {

	
    public void criaPessoaEndereco(String pessoaid, String enderecoid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Pessoa_Endereco (pessoaid, enderecoid) " +
                         "VALUES ('" + pessoaid + "', '" + enderecoid + "')");
        
    }
}
