package br.com.web.store.webservice;

import java.util.List;

import br.com.web.store.dto.InGameDTO;
import br.com.web.store.dto.OutGameDTO;

public interface WebStoreService {
	
	public List<OutGameDTO> listarJogos();
	
	public OutGameDTO buscarJogo(InGameDTO produtoDTO);
	
	public void desabilitarProduto(Integer id);

}
