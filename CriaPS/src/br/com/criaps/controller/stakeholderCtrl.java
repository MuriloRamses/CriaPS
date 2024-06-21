package br.com.criaps.controller;

import java.sql.SQLException;


import br.com.criaps.model.Stakeholder;

public class stakeholderCtrl {

	
    public void salvarstakeholder() throws SQLException {

        Stakeholder st = new Stakeholder();

        try {
            String nomestakeholder;
      
            nomestakeholder = "Rafael Cabral";
            st.criaStakeholder(nomestakeholder);

            nomestakeholder = "Vanessa Duarte";
            st.criaStakeholder(nomestakeholder); 

            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
