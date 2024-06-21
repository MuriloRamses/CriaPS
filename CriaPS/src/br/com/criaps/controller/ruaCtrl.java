package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Rua;

public class ruaCtrl {

    public void salvarRua() throws SQLException {

    	Rua r = new Rua();

        try {
            String nomerua;
            String bairro_bairroid;    
            String bairro_cidade_cidadeid;    
            String bairro_cidade_estado_estadoid;
            String bairro_cidade_estado_pais_paisid;   

            nomerua = "avenida darcy vargas";
            bairro_bairroid = "1";
            bairro_cidade_cidadeid = "1";
            bairro_cidade_estado_estadoid = "1";
            bairro_cidade_estado_pais_paisid = "1";
            r.criaRua(nomerua, bairro_bairroid, bairro_cidade_cidadeid, bairro_cidade_estado_estadoid, bairro_cidade_estado_pais_paisid);

            nomerua = "Av. Desembargador João Machado";
            bairro_bairroid = "3";
            bairro_cidade_cidadeid = "1";
            bairro_cidade_estado_estadoid = "1";
            bairro_cidade_estado_pais_paisid = "1";
            r.criaRua(nomerua, bairro_bairroid, bairro_cidade_cidadeid, bairro_cidade_estado_estadoid, bairro_cidade_estado_pais_paisid);
            
            nomerua = "Av. Mario Ipyranga";
            bairro_bairroid = "2";
            bairro_cidade_cidadeid = "1";
            bairro_cidade_estado_estadoid = "1";
            bairro_cidade_estado_pais_paisid = "1";
            r.criaRua(nomerua, bairro_bairroid, bairro_cidade_cidadeid, bairro_cidade_estado_estadoid, bairro_cidade_estado_pais_paisid);

  
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
	
}
