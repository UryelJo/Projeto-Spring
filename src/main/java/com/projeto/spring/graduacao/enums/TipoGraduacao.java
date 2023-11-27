package com.projeto.spring.graduacao.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum TipoGraduacao {

    B("1", "Bacharelado"),
    T("2", "Tecnologo"),
    L("3", "Licenciatura");

    private final String valor;
    private final String descricao;
}
