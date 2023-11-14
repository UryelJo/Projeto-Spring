package com.projeto.spring.graduacao.repository;

import com.projeto.spring.graduacao.model.Graduacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
}
