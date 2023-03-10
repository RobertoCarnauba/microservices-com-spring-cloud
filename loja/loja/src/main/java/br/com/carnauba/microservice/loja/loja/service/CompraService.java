package br.com.carnauba.microservice.loja.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.carnauba.microservice.loja.loja.dto.CompraDTO;
import br.com.carnauba.microservice.loja.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private RestTemplate client;
	
	public void realizaCompra(CompraDTO compra) {
		//RestTemplate client = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange = 
				client.exchange("http://fornecedor/info/"+compra.getEndereco().getEstado(), 
						HttpMethod.GET,null, 
						InfoFornecedorDTO.class);
		System.out.println(exchange.getBody().getEndereco());
	}

}
