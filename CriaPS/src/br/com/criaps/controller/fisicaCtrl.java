package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Fisica;

public class fisicaCtrl {

    public void salvarFisica() throws SQLException {

        Fisica f = new Fisica();

        try {
            String cpf;
            String RG;
            String nomefisica;
            String sobrenome;
            String nascimento;
            String nacionalidade;
            String pessoaid;

            cpf = "11111111111";
            RG = "2791111";
            nomefisica = "Murilo";
            sobrenome = "Campos";
            nascimento = "2024-04-22";
            nacionalidade = "Brasileiro";
            pessoaid = "1";
            f.criaFisica(cpf, RG, nomefisica, sobrenome, nascimento, nacionalidade, pessoaid);

            cpf = "22222222222";
            RG = "2791222";
            nomefisica = "Pedro";
            sobrenome = "Reis";
            nascimento = "2024-04-22";
            nacionalidade = "Americano";
            pessoaid = "2";
            f.criaFisica(cpf, RG, nomefisica, sobrenome, nascimento, nacionalidade, pessoaid);

            cpf = "33333333333";
            RG = "2791333";
            nomefisica = "Vanessa";
            sobrenome = "Duarte";
            nascimento = "2024-04-22";
            nacionalidade = "Alemão";
            pessoaid = "3";
            f.criaFisica(cpf, RG, nomefisica, sobrenome, nascimento, nacionalidade, pessoaid);

            cpf = "44444444444";
            RG = "2791444";
            nomefisica = "Caio";
            sobrenome = "Nery";
            nascimento = "2024-04-22";
            nacionalidade = "Belga";
            pessoaid = "4";
            f.criaFisica(cpf, RG, nomefisica, sobrenome, nascimento, nacionalidade, pessoaid);
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
