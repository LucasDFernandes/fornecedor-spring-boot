package com.alura.fornecedor.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alura.fornecedor.domain.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
