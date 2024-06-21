package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.PessoaEndereco;

public class pessoaEnderecoCtrl {

	
    public void salvarPessoaendereco() throws SQLException {

        PessoaEndereco pe = new PessoaEndereco();

        try {
            String pessoaid;
            String enderecoid;      

            pessoaid = "1";
            enderecoid = "1";
            pe.criaPessoaEndereco(pessoaid, enderecoid);

            pessoaid = "2";
            enderecoid = "2";
            pe.criaPessoaEndereco(pessoaid, enderecoid);
            
            pessoaid = "3";
            enderecoid = "3";
            pe.criaPessoaEndereco(pessoaid, enderecoid);
            
            pessoaid = "4";
            enderecoid = "2";
            pe.criaPessoaEndereco(pessoaid, enderecoid);
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
