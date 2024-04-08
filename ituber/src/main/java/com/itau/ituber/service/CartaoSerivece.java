package com.itau.ituber.service;

import com.itau.ituber.model.Cartao;
import com.itau.ituber.model.dto.CartaoRequestDTO;

import java.util.List;

public interface CartaoSerivece {

    Cartao create(CartaoRequestDTO cartao);

    List<Cartao> findAll();

    Cartao findById(Long id);
}
