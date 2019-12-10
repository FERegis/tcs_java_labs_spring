package br.com.labssenac.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.labssenac.models.Materia;

public interface TipoRepository extends CrudRepository<Materia, String> {
	
	Materia findById(long id);
	
}
