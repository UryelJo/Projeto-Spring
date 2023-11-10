package com.projeto.spring.cursos.repository;

import com.projeto.spring.cursos.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long> {
}
