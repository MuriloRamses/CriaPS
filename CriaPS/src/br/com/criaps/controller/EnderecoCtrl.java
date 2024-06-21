package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Endereco;


public class EnderecoCtrl {

	
	   public void salvarEndereco() throws SQLException {

	    	Endereco r = new Endereco();

	        try {
	            String complemento;
	            String cep;    
	            String numero;    
	            String rua_ruaid;
	            String rua_bairro_bairroid; 
	            String rua_bairro_cidade_cidadeid;
	            String rua_bairro_cidade_estado_estadoid; 
	            String rua_bairro_cidade_estado_pais_paisid;


	            complemento = "SENAC";
	            cep = "69093502";
	            numero = "45";
	            rua_ruaid = "1";
	            rua_bairro_bairroid = "1";
	            rua_bairro_cidade_cidadeid = "1";
	            rua_bairro_cidade_estado_estadoid = "1";
	            rua_bairro_cidade_estado_pais_paisid = "1";	           
	            r.criaEndereco(complemento, cep, numero, rua_ruaid, rua_bairro_bairroid, rua_bairro_cidade_cidadeid, rua_bairro_cidade_estado_estadoid, rua_bairro_cidade_estado_pais_paisid);

	            complemento = "PAC-ALVORADA";
	            cep = "69012366";
	            numero = "12";
	            rua_ruaid = "2";
	            rua_bairro_bairroid = "3";
	            rua_bairro_cidade_cidadeid = "1";
	            rua_bairro_cidade_estado_estadoid = "1";
	            rua_bairro_cidade_estado_pais_paisid = "1";	           
	            r.criaEndereco(complemento, cep, numero, rua_ruaid, rua_bairro_bairroid, rua_bairro_cidade_cidadeid, rua_bairro_cidade_estado_estadoid, rua_bairro_cidade_estado_pais_paisid);
	            
	            complemento = "DETRAN";
	            cep = "69013455";
	            numero = "45";
	            rua_ruaid = "3";
	            rua_bairro_bairroid = "2";
	            rua_bairro_cidade_cidadeid = "1";
	            rua_bairro_cidade_estado_estadoid = "1";
	            rua_bairro_cidade_estado_pais_paisid = "1";	           
	            r.criaEndereco(complemento, cep, numero, rua_ruaid, rua_bairro_bairroid, rua_bairro_cidade_cidadeid, rua_bairro_cidade_estado_estadoid, rua_bairro_cidade_estado_pais_paisid);

	  
	            
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir dados: " + e.getMessage());
	        }
	    }
}
