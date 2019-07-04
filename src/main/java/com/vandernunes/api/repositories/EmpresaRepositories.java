package com.vandernunes.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vandernunes.api.entities.Empresa;

public interface EmpresaRepositories extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
