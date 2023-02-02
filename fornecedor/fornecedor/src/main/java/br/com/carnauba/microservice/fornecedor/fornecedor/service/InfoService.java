package br.com.carnauba.microservice.fornecedor.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carnauba.microservice.fornecedor.fornecedor.model.InfoFornecerdor;
import br.com.carnauba.microservice.fornecedor.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository repository;

	public InfoFornecerdor getInfoPorEstado(String estado) {
		return repository.findByEstado(estado);

	}

	public InfoFornecerdor save(InfoFornecerdor fornedor) {

		return repository.save(fornedor);
	}

}
