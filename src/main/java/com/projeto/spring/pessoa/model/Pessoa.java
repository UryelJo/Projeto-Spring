package com.projeto.spring.pessoa.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "pessoa", schema = "public")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nomePessoa;

    @Column(name = "peso")
    private Double pesoPessoa;

    @Column(name = "altura")
    private Double alturaPessoa;

    @Column(name = "sexo")
    private String sexoPessoa;

    @Column(name = "telefone")
    private String telefonePessoa;

    @Column(name = "email")
    private String emailPessoa;

    @Column(name = "cpf")
    private String cpfPessoa;

    @Column(name = "cnpj")
    private String cnpjPessoa;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @Column(name = "tipo_pessoa")
    private String tipoPessoa;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "graduacao_id")
    private Long idGraduacao;

    @Column(name = "ra")
    private String raPessoa;

    @Column(name = "endereco_id")
    private Long idEndereco;
}
