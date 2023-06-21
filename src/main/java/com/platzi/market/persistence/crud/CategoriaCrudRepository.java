package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
    List<Categoria> findByIdCategoriaOrderByNombreAsc(int idCategoria);
}
