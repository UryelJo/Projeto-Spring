package com.projeto.spring.graduacao.service;

import com.projeto.spring.graduacao.dto.GraduacaoDTO;
import com.projeto.spring.graduacao.repository.GraduacaoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduacaoService {

    private final GraduacaoRepository graduacaoRepository;

    public GraduacaoService(GraduacaoRepository graduacaoRepository){
        this.graduacaoRepository = graduacaoRepository;
    }


    public ResponseEntity<List<GraduacaoDTO>> listarGraduacoes() {
        return ResponseEntity.ok(GraduacaoDTO.converterParaDTO(this.graduacaoRepository.findAll()));
    }
}
