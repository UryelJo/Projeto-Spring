package com.projeto.spring.pessoa.service;

import com.projeto.spring.pessoa.dto.PessoaDTO;
import com.projeto.spring.pessoa.form.CadastrarPessoaForm;
import com.projeto.spring.pessoa.model.Pessoa;
import com.projeto.spring.pessoa.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa verificarSePessoaExiste(Long idPessoa) {
        return this.pessoaRepository.findById(idPessoa)
                .orElseThrow(() -> new ObjectNotFoundException("Não foi possivel Encontrar Pessoa com Id: ", idPessoa));
    }

    public ResponseEntity<List<PessoaDTO>> listarPessoas(){
        return ResponseEntity.ok(PessoaDTO.converterParaDTO(this.pessoaRepository.findAll()));
    }

    public ResponseEntity<PessoaDTO> buscarPessoa(Long idPessoa) {
        return ResponseEntity.ok(new PessoaDTO(verificarSePessoaExiste(idPessoa)));
    }

    @Transactional
    public ResponseEntity<HttpStatus> cadastrarPessoa(@Valid CadastrarPessoaForm formularioDeCadastragem) {
        this.pessoaRepository.save(formularioDeCadastragem.cadastrarNovaPessoa());
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @Transactional
    public void deletarPessoaPorId(Long idPessoa) {
        this.verificarSePessoaExiste(idPessoa);
        this.pessoaRepository.deleteById(idPessoa);
    }





}
