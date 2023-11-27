package com.projeto.spring.pessoa.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Sexo {

    M("M","Masculino"),
    F("F","Feminino"),
    O("O","Outro");

    private final String valor;
    private final String descricao;
}
