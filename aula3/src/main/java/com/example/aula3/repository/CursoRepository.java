package com.example.aula3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

import com.example.aula3.models.Curso;



public interface CursoRepository extends JpaRepository<Curso, Long>{
    List<Curso> findByNomeLike(String nome);
   

}
