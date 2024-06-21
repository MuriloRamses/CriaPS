package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class PessoaProjeto {

    public void criaPessoaProjeto(String projetoid, String stakeholderid, String pessoaid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO Pessoa_Projeto (projetoid, stakeholderid, pessoaid) " +
                         "VALUES ('" + projetoid + "', '" + stakeholderid + "', '" + pessoaid + "')");
        
    }
}
