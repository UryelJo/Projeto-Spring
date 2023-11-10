package com.projeto.spring.endereco.resource;

import com.projeto.spring.endereco.dto.EnderecoDTO;
import com.projeto.spring.endereco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    private final EnderecoService enderecoService;

    @Autowired
    public EnderecoResource( EnderecoService enderecoService){
        this.enderecoService = enderecoService;
    }

    @GetMapping("/buscar-todos-enderecos")
    public ResponseEntity<List<EnderecoDTO>> buscarTodosOsEnderecos(){
        return this.enderecoService.buscarTodosOsEnderecos();
    }
}
