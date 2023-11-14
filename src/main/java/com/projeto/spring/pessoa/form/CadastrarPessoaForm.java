package com.projeto.spring.pessoa.form;

import com.projeto.spring.pessoa.model.Pessoa;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CadastrarPessoaForm {

    private String formularioNome;
    private Double formularioPeso;
    private Double formularioAltura;
    private String formularioSexo;
    private String formularioTelefone;
    private String formularioEmail;
    private String formularioCpf;
    private String formularioCnpj;
    private LocalDate formularioDataNascimento;
    private String formularioTipoPessoa;
    private String formularioEstadoCivil;
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
                .raPessoa(formularioRa)
                .build();
    }
}
