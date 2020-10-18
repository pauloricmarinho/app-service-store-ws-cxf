package br.com.web.store.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.web.store.dto.InGameDTO;
import br.com.web.store.dto.OutGameDTO;

@Component
public class ProdutoRepo {
	
	private static final List<OutGameDTO> listaJogos = new ArrayList<OutGameDTO>();
	
	public ProdutoRepo() { }
	
	static {
		listaJogos.add(new OutGameDTO(1000, "Ryse Son of Rome","Xbox One","Microsoft","16 Anos","Física"));
		listaJogos.add(new OutGameDTO(2000, "Forza Horizon 4","Xbox One","Microsoft","Livre","Física"));
		listaJogos.add(new OutGameDTO(3000, "God of War 4","PS4","Sony","16 Anos","Física"));
		listaJogos.add(new OutGameDTO(4000, "Gears of War 4","Xbox One","Microsoft","16 Anos","Física"));
		listaJogos.add(new OutGameDTO(5000, "Tom Clancy The Division 2","Xbox One, PS4, Steam","Ubisoft","16 Anos","Física"));
		listaJogos.add(new OutGameDTO(6000, "Age of Empires II - Ultimate Edition","Windows 10","Microsoft","Livre","Digital"));
		listaJogos.add(new OutGameDTO(7000, "Castle of Clans","Android","SuperCell","Livre","Física"));
	}
	
	public List<OutGameDTO> getListajogos() {
		return listaJogos;
	}
	
	public Optional<OutGameDTO> obterJogo(InGameDTO inGameDTO) {	
		if(!"".equals(inGameDTO.getNome())) {
			return listaJogos.stream().filter(game -> game.getNome().equals(inGameDTO.getNome())).findFirst();
		}
		return listaJogos.stream().filter(game -> game.getId().compareTo(inGameDTO.getId())==0).findFirst();
		
	}
	
}
