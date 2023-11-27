package com.projeto.spring.pessoa.model;

import com.projeto.spring.endereco.model.Endereco;
import com.projeto.spring.graduacao.model.Graduacao;
import com.projeto.spring.pessoa.enums.EstadoCivil;
import com.projeto.spring.pessoa.enums.Sexo;
import com.projeto.spring.pessoa.enums.TipoPessoa;
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
    @Enumerated(value = EnumType.STRING)
    private Sexo sexoPessoa;

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
    @Enumerated(value = EnumType.STRING)
    private TipoPessoa tipoPessoa;

    @Column(name = "estado_civil")
    @Enumerated(value = EnumType.STRING)
    private EstadoCivil estadoCivil;

    @Column(name = "graduacao_id")
    private Long idGraduacao;

    @Column(name = "ra")
    private String raPessoa;

    @Column(name = "endereco_id")
    private Long idEndereco;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id", insertable = false, updatable = false)
    private Endereco endereco;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "graduacao_id", insertable = false, updatable = false)
    private Graduacao graduacao;
}
