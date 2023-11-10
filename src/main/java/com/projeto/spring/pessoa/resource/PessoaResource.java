package com.projeto.spring.pessoa.resource;

import com.projeto.spring.pessoa.dto.PessoaDTO;
import com.projeto.spring.pessoa.form.CadastrarPessoaForm;
import com.projeto.spring.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {

    private final PessoaService pessoaService;

    @Autowired
    public PessoaResource(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping("/buscar-pessoas")
    public ResponseEntity<List<PessoaDTO>> listarPessoas(){
        return this.pessoaService.listarPessoas();
    }

    @GetMapping("/buscar-pessoa-por-id-{idPessoa}")
    public ResponseEntity<PessoaDTO> buscarPessoa(@PathVariable Long idPessoa){
        return this.pessoaService.buscarPessoa(idPessoa);
    }

    @DeleteMapping("/deletar-pessoa-{idPessoa}")
    public void deletarPessoaPorId(@PathVariable Long idPessoa){
        this.pessoaService.deletarPessoaPorId(idPessoa);
    }

    @PostMapping("/cadastrar-pessoa")
    public ResponseEntity<HttpStatus> cadastrarPessoa(@RequestBody CadastrarPessoaForm formularioDeCadastragem){
        return this.pessoaService.cadastrarPessoa(formularioDeCadastragem);
    }
}
