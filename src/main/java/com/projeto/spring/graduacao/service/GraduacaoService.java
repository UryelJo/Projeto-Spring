package com.projeto.spring.graduacao.service;

import com.projeto.spring.graduacao.dto.GraduacaoDTO;
import com.projeto.spring.graduacao.model.Graduacao;
import com.projeto.spring.graduacao.repository.GraduacaoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GraduacaoService {

    private final GraduacaoRepository graduacaoRepository;

    public GraduacaoService(GraduacaoRepository graduacaoRepository){
        this.graduacaoRepository = graduacaoRepository;
    }


    public ResponseEntity<List<GraduacaoDTO>> listarGraduacoes() {
        List<Graduacao> listaDeGraduacoes = this.graduacaoRepository
                .findAll()
                .stream()
                .sorted(Comparator
                        .comparing(Graduacao::getId))
                .collect(Collectors.toList());
        return ResponseEntity.ok(GraduacaoDTO.converterParaDTO(listaDeGraduacoes));
    }
}
