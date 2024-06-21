package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.TipoContato;

public class TipocontatoCtrl {

    public void salvarTipocontato() throws SQLException {

        TipoContato tc = new TipoContato();

        try {
            String nometipocontato;    

            nometipocontato = "Cel";
            tc.criaTipocontato(nometipocontato);

            nometipocontato = "Tel";
            tc.criaTipocontato(nometipocontato);
            
            nometipocontato = "e-mail";
            tc.criaTipocontato(nometipocontato);

            nometipocontato = "Wpp";
            tc.criaTipocontato(nometipocontato);
            
            nometipocontato = "tel_comercial";
            tc.criaTipocontato(nometipocontato);

            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
