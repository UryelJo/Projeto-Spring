package com.projeto.spring.endereco.dto;

import com.projeto.spring.endereco.model.Endereco;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class EnderecoDTO {

    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;

    public EnderecoDTO(Endereco endereco){
        this.id = endereco.getId();
        this.rua = endereco.getRua();
        this.numero = endereco.getNumero();
        this.bairro = endereco.getBairro();
        this.cep = endereco.getCep();
        this.cidade = endereco.getCidade();
        this.uf = endereco.getUf();
    }

    public static List<EnderecoDTO> converterParaDto(List<Endereco> listaDeEnderecos){
        return listaDeEnderecos.stream().map(EnderecoDTO::new).collect(Collectors.toList());
    }
}
