package com.projeto.spring.graduacao.model;

import com.projeto.spring.graduacao.enums.TipoGraduacao;
import com.projeto.spring.pessoa.enums.TipoPessoa;
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
@Table(name = "graduacao", schema = "public")
public class Graduacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_graduacao")
    private String nomeGraduacao;

    @Column(name = "duracao_graduacao")
    private Long duracaoGraduacao;

    @Column(name = "tipo_graduacao")
    private TipoGraduacao tipoGraduacao;

    @Column(name = "qtd_alunos")
    private Long quantidadeAlunos;

}
