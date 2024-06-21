package br.com.criaps.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class SalvarCrtl {

	public void salvar() throws SQLException {

		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		boolean bool = true;

		while (bool) {
			System.out.println("1 - Tabela Pessoa");
			System.out.println("2 - Tabela Física");	
			System.out.println("3 - Tabela Jurídica");	
			System.out.println("4 - Tabela Usuário");	
			System.out.println("5 - Tabela Tipo Contato");	
			System.out.println("6 - Tabela Contato");	
			System.out.println("7 - Tabela Pais");	
			System.out.println("8 - Tabela Estado");	
			System.out.println("9 - Tabela Cidade");
			System.out.println("10 - Tabela Bairro");
			System.out.println("11 - Tabela Rua");	
			System.out.println("12 - Tabela Endereco");	
			System.out.println("13 - Tabela Pessoa_Endereco");	
			System.out.println("14 - Tabela Equipe");	
			System.out.println("15 - Tabela Espaço");	
			System.out.println("16 - Tabela Projeto");	
			System.out.println("17 - Tabela Stakeholder");	
			System.out.println("18 - Tabela Pessoa_Projeto");
			System.out.print("Digite o número da função q vc quer chamar: ");
			

			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				PessoaCtrl show1 = new PessoaCtrl();
				show1.salvarPessoa();
				System.out.println("Dados da tabela Pessoa Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 2:
				fisicaCtrl show2 = new fisicaCtrl();
				show2.salvarFisica();
				System.out.println("Dados da tabela Física Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 3:
				JuridicaCtrl show3 = new JuridicaCtrl();
				show3.salvarJuridica();
				System.out.println("Dados da tabela Jurídica Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 4:
				UsuarioCtrl show4 = new UsuarioCtrl();
				show4.salvarUsuario();
				System.out.println("Dados da tabela Usuário Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 5:
				TipocontatoCtrl show5 = new TipocontatoCtrl();
				show5.salvarTipocontato();
				System.out.println("Dados da tabela Tipo_Contato Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 6:
				contatoCtrl show6= new contatoCtrl();
				show6.salvarContato();
				System.out.println("Dados da tabela Contato Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 7:
				paisCtrl show7 = new paisCtrl();
				show7.salvarPais();
				System.out.println("Dados da tabela País Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 8:
				EstadoCtrl show8 = new EstadoCtrl();
				show8.salvarEstado();
				System.out.println("Dados da tabela Estado Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 9:
				cidadeCtrl show9 = new cidadeCtrl();
				show9.salvarCidade();
				System.out.println("Dados da tabela Cidade Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 10:
				BairroCrtl show10 = new BairroCrtl();
				show10.salvarBairro();
				System.out.println("Dados da tabela Bairro Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 11:
				ruaCtrl show11 = new ruaCtrl();
				show11.salvarRua();
				System.out.println("Dados da tabela Rua Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 12:
				EnderecoCtrl show12 = new EnderecoCtrl();
				show12.salvarEndereco();
				System.out.println("Dados da tabela Enderecço Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 13:
				pessoaEnderecoCtrl show13 = new pessoaEnderecoCtrl();
				show13.salvarPessoaendereco();
				System.out.println("Dados da tabela Pessoa_Endereço Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 14:
				equipeCtrl show14 = new equipeCtrl();
				show14.salvarEquipe();
				System.out.println("Dados da tabela Equipe Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 15:
				EspacoCtrl show15 = new EspacoCtrl();
				show15.salvarEspaco();
				System.out.println("Dados da tabela Espaço Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 16:
				projetoCtrl show16 = new projetoCtrl();
				show16.salvarProjeto();
				System.out.println("Dados da tabela Projeto Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 17:
				stakeholderCtrl show17 = new stakeholderCtrl();
				show17.salvarstakeholder();
				System.out.println("Dados da tabela Stakeholder Foram Salvos com Sucesso!!!!!!!!!");
				break;

			case 18:
				pessoaprojetoCtrl show18 = new pessoaprojetoCtrl();
				show18.salvarPessoaProjeto();
				System.out.println("Dados da tabela Pessoa_Projeto Foram Salvos com Sucesso!!!!!!!!!");
				break;

			default:
				System.out.println("OPÇÃO NÃO ENCONTRADA!!!");
				break;
			}
			System.out.print("CONTINUAR? [0] SIM [99] NÃO: ");
			
			opcao = ler.nextInt();
			if (opcao == '0') {
				bool = false;
				
			}System.out.println("----------------------------------------------");
		}
		
	System.out.println("FIM DO LOOP WHILE");

	}

}
