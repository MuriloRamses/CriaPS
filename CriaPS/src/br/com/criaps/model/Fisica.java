package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Fisica {

    public void criaFisica(String cpf, String RG, String nomefisica, String sobrenome, String nascimento,
            String nacionalidade, String pessoaid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO fisica (cpf, RG, nomefisica, sobrenome, nascimento, nacionalidade, pessoaid) " +
                         "VALUES ('" + cpf + "', '" + RG + "', '" + nomefisica + "', '" + sobrenome + "', '" +
                         nascimento + "', '" + nacionalidade + "', '" + pessoaid + "')");
        
    }
}
