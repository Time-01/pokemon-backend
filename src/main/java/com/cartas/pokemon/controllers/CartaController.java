package com.cartas.pokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cartas.pokemon.dtos.CartaDTO;
import com.cartas.pokemon.services.CartaService;

@RestController
@RequestMapping("/cartas")
public class CartaController {

    @Autowired
    private CartaService cartaService;

    @PostMapping
    public CartaDTO salvar(@RequestBody CartaDTO dto) {
        return cartaService.salvarCarta(dto);
    }

    @PutMapping("/{id}")
    public CartaDTO editar(@PathVariable Long id, @RequestBody CartaDTO dto) {
        return cartaService.editarCarta(id, dto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        cartaService.excluirCarta(id);
    }

    @GetMapping("/{id}")
    public CartaDTO exibir(@PathVariable Long id) {
        return cartaService.exibirCarta(id);
    }

    @GetMapping
    public List<CartaDTO> listarTodas() {
        return cartaService.listarTodasAsCartas();
    }
}
