package br.com.labssenac.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.labssenac.models.Tipo;

public interface ReservaRepository extends CrudRepository<Tipo, String> {
	
	Tipo findById(long id);
	
}
