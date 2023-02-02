package br.com.carnauba.microservice.fornecedor.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.carnauba.microservice.fornecedor.fornecedor.model.InfoFornecerdor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecerdor, Long> {

	InfoFornecerdor findByEstado(String estado);

}
