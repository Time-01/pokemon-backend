package com.cartas.pokemon.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartas.pokemon.dtos.CartaDTO;
import com.cartas.pokemon.entities.Carta;
import com.cartas.pokemon.repositories.CartaRepository;

@Service
public class CartaService {

    @Autowired
    private CartaRepository cartaRepository;

    public CartaDTO salvarCarta(CartaDTO dto) {
        Carta carta = new Carta();
        carta.setNome(dto.getNome());
        carta.setStatus(dto.getStatus());
        carta.setImgUrl(dto.getImgUrl());
        carta = cartaRepository.save(carta);
        return new CartaDTO(carta);
    }

    public CartaDTO editarCarta(Long id, CartaDTO dto) {
        Optional<Carta> optionalCarta = cartaRepository.findById(id);

        if (optionalCarta.isPresent()) {
            Carta carta = optionalCarta.get();
            carta.setNome(dto.getNome());
            carta.setStatus(dto.getStatus());
            carta.setImgUrl(dto.getImgUrl());
            carta = cartaRepository.save(carta);
            return new CartaDTO(carta);
        } else {
            return null;
        }
    }

    public void excluirCarta(Long id) {
        cartaRepository.deleteById(id);
    }

    public CartaDTO exibirCarta(Long id) {
        Optional<Carta> optionalCarta = cartaRepository.findById(id);

        if (optionalCarta.isPresent()) {
            return new CartaDTO(optionalCarta.get());
        } else {
            return null;
        }
    }

    public List<CartaDTO> listarTodasAsCartas() {
        List<Carta> cartas = cartaRepository.findAll();
        List<CartaDTO> listaDTO = new ArrayList<>();

        for (Carta carta : cartas) {
            listaDTO.add(new CartaDTO(carta));
        }

        return listaDTO;
    }
}
