package com.projeto.spring.graduacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "graducao", schema = "public")
public class Graducao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_graducao")
    private String nomeGraducao;

    @Column(name = "duracao_graducao")
    private Long duracaoGraducao;

    @Column(name = "tipo_graducao")
    private String tipoGraducao;

    @Column(name = "qtd_alunos")
    private Long quantidadeAlunos;
}
