package com.projeto.spring.cursos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cursos", schema = "public")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "tipo_curso")
    private String tipoCurso;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_encerramento")
    private LocalDate dataEncerrramento;

    @Column(name = "pessoa_id")
    private Long pessoaId;
}
