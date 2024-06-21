package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Estado;

public class EstadoCtrl {
		
	    public void salvarEstado() throws SQLException {

	        Estado p = new Estado();

	        try {
	            String uf;
	            String pais_paisid;    
	            String nomeestado;    

	            uf = "AM";
	            pais_paisid = "1";
	            nomeestado = "AMAZONAS";
	            p.criaEstado(uf, pais_paisid, nomeestado);

	            uf = "PA";
	            pais_paisid = "1";
	            nomeestado = "PARÁ";
	            p.criaEstado(uf, pais_paisid, nomeestado);
	  
	            
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir dados: " + e.getMessage());
	        }
	    }
}
