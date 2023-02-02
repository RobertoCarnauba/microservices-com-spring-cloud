package br.com.carnauba.microservice.loja.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.carnauba.microservice.loja.loja.dto.CompraDTO;
import br.com.carnauba.microservice.loja.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService service;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody CompraDTO compra) {
		service.realizaCompra(compra);
	}

}
