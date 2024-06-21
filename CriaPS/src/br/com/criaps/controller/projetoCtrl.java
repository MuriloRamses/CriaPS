package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Projeto;

public class projetoCtrl {

	   public void salvarProjeto() throws SQLException {

	        Projeto esp = new Projeto();

	        try {
	            String nomeprojeto;	      
	            String espaco_espacoid;
	            String equipe_equipeid;
	            
	            nomeprojeto = "Projeto 1";
	            espaco_espacoid = "1";
	            equipe_equipeid = "1";
	            esp.criaProjeto(nomeprojeto, espaco_espacoid, equipe_equipeid);

	            nomeprojeto = "Projeto 2";
	            espaco_espacoid = "2";
	            equipe_equipeid = "5";
	            esp.criaProjeto(nomeprojeto, espaco_espacoid, equipe_equipeid);    
	            
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir dados: " + e.getMessage());
	        }
	    }
}
