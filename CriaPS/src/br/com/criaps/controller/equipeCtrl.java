package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Equipe;

public class equipeCtrl {

    public void salvarEquipe() throws SQLException {

        Equipe eq = new Equipe();

        try {
            String nomeequipe;
      

            nomeequipe = "Equipe 1";
            eq.criaEquipe(nomeequipe);

            nomeequipe = "Equipe 2";
            eq.criaEquipe(nomeequipe);
            
            nomeequipe = "Equipe 3";
            eq.criaEquipe(nomeequipe);
            
            nomeequipe = "Equipe 4";
            eq.criaEquipe(nomeequipe);
            
            nomeequipe = "Equipe 5";
            eq.criaEquipe(nomeequipe);
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
