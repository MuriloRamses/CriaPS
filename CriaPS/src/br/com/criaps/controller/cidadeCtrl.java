package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Cidade;


public class cidadeCtrl {

    public void salvarCidade() throws SQLException {

        Cidade p = new Cidade();

        try {
            String nomecidade;
            String estado_estadoid;    
            String estado_pais_paisid;    

            nomecidade = "Manaus";
            estado_estadoid = "1";
            estado_pais_paisid = "1";
            p.criaCidade(nomecidade, estado_estadoid, estado_pais_paisid);

            nomecidade = "Santarém";
            estado_estadoid = "1";
            estado_pais_paisid = "1";
            p.criaCidade(nomecidade, estado_estadoid, estado_pais_paisid);
  
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
