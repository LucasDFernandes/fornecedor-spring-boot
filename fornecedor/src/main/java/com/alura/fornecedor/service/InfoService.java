package com.alura.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.fornecedor.domain.InfoFornecedor;
import com.alura.fornecedor.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepo;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepo.findByEstado(estado);
	}

}
