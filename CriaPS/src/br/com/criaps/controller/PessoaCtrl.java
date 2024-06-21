package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Pessoa;

public class PessoaCtrl {
	
	public void salvarPessoa() throws SQLException {

        Pessoa p = new Pessoa();

        try {
        	String pessoaid;

            pessoaid = "1";
            p.criaPessoa(pessoaid);

            pessoaid = "2";
            p.criaPessoa(pessoaid);

            pessoaid = "3";
            p.criaPessoa(pessoaid);

            pessoaid = "4";
            p.criaPessoa(pessoaid);
            
            pessoaid = "5";
            p.criaPessoa(pessoaid);
            
            pessoaid = "6";
            p.criaPessoa(pessoaid);
            
            pessoaid = "7";
            p.criaPessoa(pessoaid);
            
            pessoaid = "8";
            p.criaPessoa(pessoaid);
            
            pessoaid = "9";
            p.criaPessoa(pessoaid);
            
            pessoaid = "10";
            p.criaPessoa(pessoaid);
            
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
