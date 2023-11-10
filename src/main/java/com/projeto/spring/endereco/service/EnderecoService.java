package com.projeto.spring.endereco.service;

import com.projeto.spring.endereco.dto.EnderecoDTO;
import com.projeto.spring.endereco.repository.EnderecoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

    public ResponseEntity<List<EnderecoDTO>> buscarTodosOsEnderecos() {
        return ResponseEntity.ok(EnderecoDTO.converterParaDto(this.enderecoRepository.findAll()));
    }
}
