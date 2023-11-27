package com.projeto.spring.pessoa.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum EstadoCivil{

    C("C" ,"Casado"),
    S("S" ,"Solteiro"),
    D("D" , "Divorciado"),
    V("V" , "Viuvo");

    private final String valor;
    private final String descricao;
}
