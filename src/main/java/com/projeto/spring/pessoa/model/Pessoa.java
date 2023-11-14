package com.projeto.spring.pessoa.model;

import com.projeto.spring.endereco.model.Endereco;
import com.projeto.spring.graduacao.model.Graduacao;
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "graducao_id")
    private Graduacao graduacao;

    @Column(name = "ra")
    private String raPessoa;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "endereco_id")
    private Endereco endereco;
}
