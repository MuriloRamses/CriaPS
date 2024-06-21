package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.PessoaProjeto;

public class pessoaprojetoCtrl {

	   public void salvarPessoaProjeto() throws SQLException {

	        PessoaProjeto pp = new PessoaProjeto();

	        try {
	            String projetoid;	      
	            String stakeholderid;
	            String pessoaid;
	            
	            projetoid = "1";
	            stakeholderid = "2";
	            pessoaid = "3";
	            pp.criaPessoaProjeto(projetoid, stakeholderid, pessoaid);

	            projetoid = "2";
	            stakeholderid = "1";
	            pessoaid = "4";
	            pp.criaPessoaProjeto(projetoid, stakeholderid, pessoaid);
	            
	            
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir dados: " + e.getMessage());
	        }
	    }
}
