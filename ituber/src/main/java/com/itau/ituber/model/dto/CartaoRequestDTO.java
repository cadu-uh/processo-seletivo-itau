package com.itau.ituber.model.dto;

import com.itau.ituber.enums.VarianteCartao;
import lombok.Data;

@Data
public class CartaoRequestDTO {

    private String descricao;
    private String bandeira;
    private VarianteCartao variante;
}
