package com.projeto.spring.graduacao.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class TipoGraduacaoConversao implements AttributeConverter<TipoGraduacao, String> {

    @Override
    public String convertToDatabaseColumn(TipoGraduacao tipoGraduacao){
        return tipoGraduacao.getValor();
    }

    @Override
    public TipoGraduacao convertToEntityAttribute(String valor){
        return Stream.of(TipoGraduacao.values())
                .filter(tipoGraduacao -> tipoGraduacao.getValor().equals(valor))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
