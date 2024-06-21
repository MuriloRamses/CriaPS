package br.com.criaps.controller;

import java.sql.SQLException;


import br.com.criaps.model.Espaco;

public class EspacoCtrl {

	
	   public void salvarEspaco() throws SQLException {

	        Espaco esp = new Espaco();

	        try {
	            String nomeespaco;	      

	            nomeespaco = "jump street";
	            esp.criaEspaco(nomeespaco);

	            nomeespaco = "baker street";
	            esp.criaEspaco(nomeespaco);
	            
	            
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir dados: " + e.getMessage());
	        }
	    }
}
