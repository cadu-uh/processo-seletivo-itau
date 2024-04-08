package com.itau.ituber.service.implementation;

import com.itau.ituber.model.Cartao;
import com.itau.ituber.model.dto.CartaoRequestDTO;
import com.itau.ituber.repository.CartaoRepository;
import com.itau.ituber.service.CartaoSerivece;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaoServiceImlp implements CartaoSerivece {

    private final CartaoRepository repository;

    @Override
    public Cartao create(CartaoRequestDTO cartao) {

        return repository.save(generatePostCard(cartao));
    }

    @Override
    public List<Cartao> findAll() {
        return repository.findAll();
    }

    @Override
    public Cartao findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    private Cartao generatePostCard(CartaoRequestDTO cartao){
        Cartao model = new Cartao();
        model.setDescricao(cartao.getDescricao());
        model.setBandeira(cartao.getBandeira());
        model.setVariante(cartao.getVariante());
        return model;
    }
}
