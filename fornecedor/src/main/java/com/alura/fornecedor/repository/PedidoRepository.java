package com.alura.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import com.alura.fornecedor.domain.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
