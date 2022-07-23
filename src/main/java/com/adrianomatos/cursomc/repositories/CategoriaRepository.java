package com.adrianomatos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adrianomatos.cursomc.domain.Categoria;

//Realiza operações de CRUD
@Repository															//Tipo do identificador da categoria
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}