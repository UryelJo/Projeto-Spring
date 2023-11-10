package com.projeto.spring.pessoa.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum EstadoCivil{

    C("Casado"),
    S("Solteiro"),
    D("Divorciado"),
    V("Viuvo");


    private final String descricao;
}
