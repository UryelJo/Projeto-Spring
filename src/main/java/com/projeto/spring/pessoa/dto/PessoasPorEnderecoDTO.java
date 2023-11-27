package com.projeto.spring.pessoa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoasPorEnderecoDTO {

    private Long idEndereco;
    private String rua;
    private String bairro;
    private List<PessoaDTO> listaDePessoasPorEndereco;

    public static List<PessoasPorEnderecoDTO> converter(Map<Long, List<PessoaDTO>> pessoasAgrupadasPeloEndereco){
        return pessoasAgrupadasPeloEndereco.entrySet().stream().map(pue -> new PessoasPorEnderecoDTO(pue.getKey(), pue.getValue().get(0).getEndereco().getRua(), pue.getValue().get(0).getEndereco().getBairro(), pue.getValue())
        ).collect(Collectors.toList());

    }
}
