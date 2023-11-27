package com.projeto.spring.pessoa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoasPorGraduacaoDTO{

    private Long idGraduacao;
    private String nomeGraduacao;
    private Long quantidadeAlunos;
    private List<PessoaDTO> listaDePessoasPorGraduacao;

    public static List<PessoasPorGraduacaoDTO> converter(Map<Long, List<PessoaDTO>> pessoasAgrupadasPelaGraduacao){
        return pessoasAgrupadasPelaGraduacao.entrySet().stream().map(pug -> new PessoasPorGraduacaoDTO(pug.getKey(), pug.getValue().get(0).getGraduacao().getNomeGraduacao(), (long) pug.getValue().size(), pug.getValue())).collect(Collectors.toList());
    }

}
