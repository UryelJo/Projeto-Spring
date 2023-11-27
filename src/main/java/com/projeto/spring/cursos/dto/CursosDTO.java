package com.projeto.spring.cursos.dto;

import com.projeto.spring.cursos.model.Cursos;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class CursosDTO {

    private String descricao;
    private String tipoCurso;
    private LocalDate dataInicio;
    private LocalDate dataEncerrramento;
    @Getter
    private Long pessoaId;

    public CursosDTO(Cursos cursos){
        this.descricao = cursos.getDescricao();
        this.tipoCurso = cursos.getTipoCurso();
        this.dataInicio = cursos.getDataInicio();
        this.dataEncerrramento = cursos.getDataEncerrramento();
        this.pessoaId = cursos.getPessoaId();
    }

    public static List<CursosDTO> converterParaDTO(List<Cursos> listaCursos){
        return listaCursos.stream().map(CursosDTO::new).collect(Collectors.toList());
    }
}
