package com.projeto.spring.graduacao.dto;

import com.projeto.spring.graduacao.model.Graduacao;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class GraduacaoDTO {

    private Long id;
    private String nomeGraduacao;
    private Long duracaoGraduacao;
    private String tipoGraduacao;
    private Long quantidadeAlunos;

    public GraduacaoDTO(Graduacao graduacao){
        this.id = graduacao.getId();
        this.nomeGraduacao = graduacao.getNomeGraduacao();
        this.duracaoGraduacao = graduacao.getDuracaoGraduacao();
        this.tipoGraduacao = graduacao.getTipoGraduacao().getDescricao();
        this.quantidadeAlunos = graduacao.getQuantidadeAlunos();
    }

    public static List<GraduacaoDTO> converterParaDTO(List<Graduacao> listaGraducao){
        return listaGraducao.stream().map(GraduacaoDTO::new).collect(Collectors.toList());
    }

}
