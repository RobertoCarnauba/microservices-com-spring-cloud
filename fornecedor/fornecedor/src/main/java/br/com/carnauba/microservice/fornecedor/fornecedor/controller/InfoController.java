package br.com.carnauba.microservice.fornecedor.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carnauba.microservice.fornecedor.fornecedor.model.InfoFornecerdor;
import br.com.carnauba.microservice.fornecedor.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{estado}")
	public InfoFornecerdor infoPorEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
		
	}
	
	@PostMapping
	public InfoFornecerdor cadastraFornecedor(@RequestBody InfoFornecerdor fornedor) {
		return infoService.save(fornedor);
		
	}
	
	
}
