package br.com.criaps.controller;

import java.sql.SQLException;

import br.com.criaps.model.Juridica;

public class JuridicaCtrl {

	    public void salvarJuridica() throws SQLException {

	        Juridica j = new Juridica();

	        try {
	            String cnpj;
	            String nomefantasia;
	            String razaosocial;
	            String ie;
	            String im;
	            String pessoa_pessoaid;

	            cnpj = "1111";
	            nomefantasia = "BBB";
	            razaosocial = "Globo";
	            ie = "321654987";
	            im = "987654321";
	            pessoa_pessoaid = "1";
	            j.criaJuridica(cnpj, nomefantasia, razaosocial, ie, im, pessoa_pessoaid);

	            cnpj = "2222";
	            nomefantasia = "Jequiti";
	            razaosocial = "SBT";
	            ie = "987321654";
	            im = "546978132";
	            pessoa_pessoaid = "2";
	            j.criaJuridica(cnpj, nomefantasia, razaosocial, ie, im, pessoa_pessoaid);

	            cnpj = "3333";
	            nomefantasia = "Rc";
	            razaosocial = "pj3";
	            ie = "654321654";
	            im = "946523718";
	            pessoa_pessoaid = "3";
	            j.criaJuridica(cnpj, nomefantasia, razaosocial, ie, im, pessoa_pessoaid);

	            cnpj = "4444";
	            nomefantasia = "Pj4";
	            razaosocial = "Pj4";
	            ie = "987987987";
	            im = "654654654";
	            pessoa_pessoaid = "4";
	            j.criaJuridica(cnpj, nomefantasia, razaosocial, ie, im, pessoa_pessoaid);

	            
	        } catch (SQLException e) {
	            System.out.println("Erro ao inserir dados: " + e.getMessage());
	        }
	    }
}
