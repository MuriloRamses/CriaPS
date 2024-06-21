package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Pais;

public class paisCtrl {
	
    public void salvarPais() throws SQLException {

        Pais p = new Pais();

        try {
            String sigla;
            String codigo;    
            String nomepais;    

            sigla = "Br";
            codigo = "55";
            nomepais = "Brasil";
            p.criaPais(sigla, codigo, nomepais);

            sigla = "US";
            codigo = "36";
            nomepais = "EUA";
            p.criaPais(sigla, codigo, nomepais);
  
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
