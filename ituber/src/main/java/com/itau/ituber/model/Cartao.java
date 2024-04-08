package com.itau.ituber.model;

import com.itau.ituber.enums.VarianteCartao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String bandeira;
    @Enumerated(EnumType.STRING)
    private VarianteCartao variante;
    private LocalDate dataCriacao;

    public Cartao(){
        this.dataCriacao = LocalDate.now();
    }
}
