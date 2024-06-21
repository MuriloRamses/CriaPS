package br.com.criaps.model;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.criaps.conexao.ConexaoDB;

public class Juridica {

	
    public void criaJuridica(String cnpj, String nomefantasia, String razaosocial, String ie, String im,
            String pessoa_pessoaid) throws SQLException {

        Statement stmt = null;
        
            stmt = ConexaoDB.conectar();
            
            stmt.execute("INSERT INTO juridica (cnpj, nomefantasia, razaosocial, ie, im, pessoa_pessoaid) " +
                         "VALUES ('" + cnpj + "', '" + nomefantasia + "', '" + razaosocial + "', '" + ie + "', '" +
                         im + "', '" + pessoa_pessoaid + "')");
        
    }
}
