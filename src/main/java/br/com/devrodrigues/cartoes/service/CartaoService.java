package br.com.devrodrigues.cartoes.service;

import br.com.devrodrigues.cartoes.domain.entities.Cartao;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class CartaoService {

    public List<Cartao> execute() {
        return Arrays.asList(new Cartao(UUID.randomUUID(), "Carlos"), new Cartao(UUID.randomUUID(), "Aline"));
    }
}
