package com.projeto.spring.pessoa.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Sexo {

    M("Masculino"),
    F("Feminino"),
    O("Outro");

    private final String descricao;
}
