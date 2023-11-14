package com.projeto.spring.graduacao.resource;

import com.projeto.spring.graduacao.dto.GraduacaoDTO;
import com.projeto.spring.graduacao.service.GraduacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graduacao")
public class GraduacaoResource {

    private final GraduacaoService graduacaoService;

    @Autowired
    public GraduacaoResource(GraduacaoService graduacaoService){
        this.graduacaoService = graduacaoService;
    }

    @GetMapping(path = "/buscar-todos")
    public ResponseEntity<List<GraduacaoDTO>> listarGraduacoes(){
        return this.graduacaoService.listarGraduacoes();
    }



}
