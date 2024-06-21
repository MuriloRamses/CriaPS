package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Contato;


public class contatoCtrl {

    public void salvarContato() throws SQLException {

        Contato c = new Contato();

        try {
            String valor;
            String pessoa_pessoaid;    
            String tipocontato_tipocontatoid;    

            valor = "(92)99191-3666";
            pessoa_pessoaid = "1";
            tipocontato_tipocontatoid = "1";
            c.criaContato(valor, pessoa_pessoaid, tipocontato_tipocontatoid);

            valor = "(11)99292-6666";
            pessoa_pessoaid = "2";
            tipocontato_tipocontatoid = "5";
            c.criaContato(valor, pessoa_pessoaid, tipocontato_tipocontatoid);
            
            valor = "Junin_daquebrada@gmail.com";
            pessoa_pessoaid = "3";
            tipocontato_tipocontatoid = "3";
            c.criaContato(valor, pessoa_pessoaid, tipocontato_tipocontatoid);

            valor = "(92)99191-3666";
            pessoa_pessoaid = "4";
            tipocontato_tipocontatoid = "1";
            c.criaContato(valor, pessoa_pessoaid, tipocontato_tipocontatoid);
            
            valor = "(11)99292-6666";
            pessoa_pessoaid = "5";
            tipocontato_tipocontatoid = "4";
            c.criaContato(valor, pessoa_pessoaid, tipocontato_tipocontatoid);

            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
