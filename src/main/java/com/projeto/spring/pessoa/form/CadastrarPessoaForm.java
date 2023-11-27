package com.projeto.spring.pessoa.form;

import com.projeto.spring.pessoa.enums.EstadoCivil;
import com.projeto.spring.pessoa.enums.Sexo;
import com.projeto.spring.pessoa.enums.TipoPessoa;
import com.projeto.spring.pessoa.model.Pessoa;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Getter
@Setter
public class CadastrarPessoaForm {

    @NotBlank(message = "[!!formulario de nome não pode ser nulo!!]")
    @Size(max = 50, message = "[!!formulario de nome não pode ultrapassar {max} caracteres!!]")
    private String formularioNome;

    @NotNull(message = "[!!formulario de peso não pode ser nulo!!]")
    @Min(value = 0, message = "[!!formulario de peso tem que ter valor mínimo de 0!!]")
    private Double formularioPeso;

    @NotNull(message = "[!!formulario de altura não pode ser nulo!!]")
    @Min(value = 0, message = "[!!formulario de altura tem que ter valor mínimo de 0!!]")
    private Double formularioAltura;

    @NotBlank(message = "[!!formulario de sexo não pode ser nulo!!]")
    @Size(max = 1, message = "[!!formulario de sexo não pode ultrapassar {max} caracteres!!]")
    @Enumerated(value = EnumType.STRING)
    private Sexo formularioSexo;

    @NotBlank(message = "[!!formulario de telefone não pode ser nulo!!]")
    @Size(max = 13, message = "[!!formulario de telefone não pode ultrapassar {max} caracteres!!]")
    private String formularioTelefone;

    @Email
    @NotBlank(message = "[!!formulario de email não pode ser nulo!!]")
    @Size(max = 100, message = "[!!formulario de email não pode ultrapassar {max} caracteres!!]")
    private String formularioEmail;

    @CPF
    @Size(max = 14, message = "[!!formulario de cpf não pode ultrapassar {max} caracteres!!]")
    private String formularioCpf;

    @CNPJ
    @Size(max = 18, message = "[!!formulario de cnpj não pode ultrapassar {max} caracteres!!]")
    private String formularioCnpj;

    @NotBlank(message = "[!!formulario de Data de Nascimento não pode ser nulo!!]")
    @Size(max = 10, message = "[!!formulario de Data de Nascimento não pode ultrapassar {max} caracteres!!]")
    private LocalDate formularioDataNascimento;

    @NotBlank(message = "[!!formulario de Tipo Pessoa não pode ser nulo!!]")
    @Size(max = 1, message = "[!!formulario de Tipo Pessoa não pode ultrapassar {max} caracteres!!]")
    @Enumerated(value = EnumType.STRING)
    private TipoPessoa formularioTipoPessoa;

    @NotBlank(message = "[!!formulario de Estado Civil não pode ser nulo!!]")
    @Size(max = 1, message = "[!!formulario de Estado Civil não pode ultrapassar {max} caracteres!!]")
    @Enumerated(value = EnumType.STRING)
    private EstadoCivil formularioEstadoCivil;

    private Long formularioIdGraduacao;

    @Size(max = 1, message = "[!!formulario de Estado Civil não pode ultrapassar {max} caracteres!!]")
    private String formularioRa;

    private Long formularioIdEndereco;

    public Pessoa cadastrarNovaPessoa(){
        return Pessoa.builder()
                .nomePessoa(formularioNome)
                .pesoPessoa(formularioPeso)
                .alturaPessoa(formularioAltura)
                .sexoPessoa(formularioSexo)
                .telefonePessoa(formularioTelefone)
                .emailPessoa(formularioEmail)
                .cpfPessoa(formularioCpf)
                .cnpjPessoa(formularioCnpj)
                .dataNascimento(formularioDataNascimento)
                .dataCadastro(LocalDate.now())
                .tipoPessoa(formularioTipoPessoa)
                .estadoCivil(formularioEstadoCivil)
                .idGraduacao(formularioIdGraduacao)
                .raPessoa(formularioRa)
                .idEndereco(formularioIdEndereco)
                .build();
    }
}
