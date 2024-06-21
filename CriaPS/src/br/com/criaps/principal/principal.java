package br.com.criaps.principal;

import br.com.criaps.controller.BairroCrtl;
import br.com.criaps.controller.EnderecoCtrl;
import br.com.criaps.controller.EspacoCtrl;
import br.com.criaps.controller.EstadoCtrl;
import br.com.criaps.controller.JuridicaCtrl;
import br.com.criaps.controller.PessoaCtrl;
import br.com.criaps.controller.SalvarCrtl;
import br.com.criaps.controller.TipocontatoCtrl;
import br.com.criaps.controller.UsuarioCtrl;
import br.com.criaps.controller.cidadeCtrl;
import br.com.criaps.controller.contatoCtrl;
import br.com.criaps.controller.equipeCtrl;
import br.com.criaps.controller.fisicaCtrl;
import br.com.criaps.controller.paisCtrl;
import br.com.criaps.controller.pessoaEnderecoCtrl;
import br.com.criaps.controller.pessoaprojetoCtrl;
import br.com.criaps.controller.projetoCtrl;
import br.com.criaps.controller.ruaCtrl;
import br.com.criaps.controller.stakeholderCtrl;


public class principal {

	public static void main(String[] args) {
		
		
		try {
		
		SalvarCrtl salvar = new SalvarCrtl();
		salvar.salvar();
		/*
		PessoaCtrl pctrl = new PessoaCtrl();
		pctrl.salvarPessoa();
		
		fisicaCtrl fctrl = new fisicaCtrl();
		fctrl.salvarFisica();
		
		JuridicaCtrl jctrl = new JuridicaCtrl();
		jctrl.salvarJuridica();
		
		UsuarioCtrl uctrl = new UsuarioCtrl();
		uctrl.salvarUsuario();
		
		TipocontatoCtrl tcctrl = new TipocontatoCtrl();
		tcctrl.salvarTipocontato();
		
		contatoCtrl cctrl = new contatoCtrl();
		cctrl.salvarContato();
		
		paisCtrl pactrl = new paisCtrl();;
		pactrl.salvarPais();
		
		EstadoCtrl ectrl = new EstadoCtrl();
		ectrl.salvarEstado();
		
		cidadeCtrl cidcrtl = new cidadeCtrl();
		cidcrtl.salvarCidade();
		
		BairroCrtl bairctrl = new BairroCrtl();
		bairctrl.salvarBairro();
		
		ruaCtrl ructrl = new ruaCtrl();
		ructrl.salvarRua();
		
		EnderecoCtrl endctrl = new EnderecoCtrl();
		endctrl.salvarEndereco();
		
		pessoaEnderecoCtrl pectrl = new pessoaEnderecoCtrl();
		pectrl.salvarPessoaendereco();
		
		equipeCtrl eqctrl = new equipeCtrl();
		eqctrl.salvarEquipe();
		
		EspacoCtrl espctrl = new EspacoCtrl();
		espctrl.salvarEspaco();
		
		projetoCtrl proctrl = new projetoCtrl();
		proctrl.salvarProjeto();
		
		stakeholderCtrl stctrl = new stakeholderCtrl();
		stctrl.salvarstakeholder();
		
		pessoaprojetoCtrl ppctrl = new pessoaprojetoCtrl();
		ppctrl.salvarPessoaProjeto();
		*/
		
		} catch (Exception ex) {
			System.out.println("Conexão Estabelecida");
		}
	}

}
