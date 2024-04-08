package com.itau.ituber.controller;

import com.itau.ituber.model.Cartao;
import com.itau.ituber.model.dto.CartaoRequestDTO;
import com.itau.ituber.service.CartaoSerivece;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
@RequiredArgsConstructor
public class CartaoController {

    private final CartaoSerivece serivece;

    @PostMapping
    ResponseEntity<Cartao> create(@RequestBody CartaoRequestDTO cartao){
        return ResponseEntity.ok(serivece.create(cartao));
    }

    @GetMapping
    ResponseEntity<List<Cartao>> findAll(){
        return ResponseEntity.ok(serivece.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Cartao> findById(@PathVariable(name = "id") Long id){

        var response = serivece.findById(id);

        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }
}
