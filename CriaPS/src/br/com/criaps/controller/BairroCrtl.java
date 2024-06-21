package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Bairro;

public class BairroCrtl {

	
    public void salvarBairro() throws SQLException {

        Bairro p = new Bairro();

        try {
            String nomebairro;
            String cidade_cidadeid;    
            String cidade_estado_estadoid;    
            String cidade_estado_pais_paisid;   

            nomebairro = "Chapada";
            cidade_cidadeid = "1";
            cidade_estado_estadoid = "1";
            cidade_estado_pais_paisid = "1";
            p.criaBairro(nomebairro, cidade_cidadeid, cidade_estado_estadoid, cidade_estado_pais_paisid);

            nomebairro = "Adrianópolis";
            cidade_cidadeid = "1";
            cidade_estado_estadoid = "1";
            cidade_estado_pais_paisid = "1";
            p.criaBairro(nomebairro, cidade_cidadeid, cidade_estado_estadoid, cidade_estado_pais_paisid);

            nomebairro = "Alvorada";
            cidade_cidadeid = "1";
            cidade_estado_estadoid = "1";
            cidade_estado_pais_paisid = "1";
            p.criaBairro(nomebairro, cidade_cidadeid, cidade_estado_estadoid, cidade_estado_pais_paisid);

  
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
