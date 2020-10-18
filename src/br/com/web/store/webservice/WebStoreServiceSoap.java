package br.com.web.store.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.scheduling.annotation.Async;

import br.com.web.store.dao.ProdutoRepo;
import br.com.web.store.dto.InGameDTO;
import br.com.web.store.dto.OutGameDTO;

@WebService
public class WebStoreServiceSoap implements WebStoreService {

	private ProdutoRepo repo = new ProdutoRepo();
	
	@WebMethod
	public List<OutGameDTO> listarJogos() {
		return repo.getListajogos();
	}

	@WebMethod
	public OutGameDTO buscarJogo(InGameDTO produtoDTO) {
		return repo.obterJogo(produtoDTO).get();
	}

	@Async
	@WebMethod
	public void desabilitarProduto(Integer id) {
		System.err.println("Produto Desabilitado com Sucesso!");
	}

}
