package com.projeto.spring.pessoa.dto;

import com.projeto.spring.endereco.dto.EnderecoDTO;
import com.projeto.spring.endereco.model.Endereco;
import com.projeto.spring.graduacao.dto.GraduacaoDTO;
import com.projeto.spring.graduacao.model.Graduacao;
import com.projeto.spring.pessoa.model.Pessoa;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class PessoaDTO {

    private String nome;
    private Double peso;
    private Double altura;
    private String sexo;
    private String telefone;
    private String email;
    private String cpf;
    private String cnpj;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
    private String tipoPessoa;
    private String estadoCivil;
    private GraduacaoDTO graducao;
    private String ra;
    private EnderecoDTO endereco;

    public PessoaDTO(Pessoa pessoa){
        this.nome = pessoa.getNomePessoa();
        this.peso = pessoa.getPesoPessoa();
        this.altura = pessoa.getAlturaPessoa();
        this.sexo = pessoa.getSexoPessoa();
        this.telefone = pessoa.getTelefonePessoa();
        this.email = pessoa.getEmailPessoa();
        this.cpf = pessoa.getCpfPessoa();
        this.cnpj = pessoa.getCnpjPessoa();
        this.dataNascimento = pessoa.getDataNascimento();
        this.dataCadastro = pessoa.getDataCadastro();
        this.tipoPessoa = pessoa.getTipoPessoa();
        this.estadoCivil = pessoa.getEstadoCivil();
        this.graducao = new GraduacaoDTO(pessoa.getGraduacao());
        this.ra = pessoa.getRaPessoa();
        this.endereco = new EnderecoDTO(pessoa.getEndereco());
    }

    public static List<PessoaDTO> converterParaDTO(List<Pessoa> listaPessoas){
        return listaPessoas.stream().map(PessoaDTO::new).collect(Collectors.toList());
    }


}
