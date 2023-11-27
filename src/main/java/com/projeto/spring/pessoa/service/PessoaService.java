package com.projeto.spring.pessoa.service;

import com.projeto.spring.pessoa.dto.PessoaDTO;
import com.projeto.spring.pessoa.dto.PessoasPorEnderecoDTO;
import com.projeto.spring.pessoa.dto.PessoasPorGraduacaoDTO;
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
import java.util.Map;
import java.util.stream.Collectors;

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
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Transactional
    public void deletarPessoaPorId(Long idPessoa) {
        this.verificarSePessoaExiste(idPessoa);
        this.pessoaRepository.deleteById(idPessoa);
    }


    public ResponseEntity<List<PessoasPorGraduacaoDTO>> buscarPessoasAgrupadasPorCadaCurso() {
        Map<Long, List<PessoaDTO>> listaDeTodosOsAlunosAgrupadosPorCurso = PessoaDTO.converterParaDTO(this.pessoaRepository.findAll())
                .stream()
                .collect(Collectors.groupingBy(PessoaDTO::getIdGraduacao));
        List<PessoasPorGraduacaoDTO> listaDePessoasAgrupadasPorGraduacao = PessoasPorGraduacaoDTO.converter(listaDeTodosOsAlunosAgrupadosPorCurso);
        return ResponseEntity.ok(listaDePessoasAgrupadasPorGraduacao);
    }

    public ResponseEntity<List<PessoasPorEnderecoDTO>> buscarPessoasAgrupadasPorEndereco() {
        Map<Long, List<PessoaDTO>> listaDeTodosOsAlunosAgrupadosPorEndereco = PessoaDTO.converterParaDTO(this.pessoaRepository.findAll())
                .stream()
                .collect(Collectors.groupingBy(PessoaDTO::getIdEndereco));
        List<PessoasPorEnderecoDTO> listaDePessoasAgrupadasPorEndereco = PessoasPorEnderecoDTO.converter(listaDeTodosOsAlunosAgrupadosPorEndereco);
        return ResponseEntity.ok(listaDePessoasAgrupadasPorEndereco);
    }
}
