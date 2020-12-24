package br.com.devrodrigues.cartoes.domain.entities;

import java.util.UUID;

public class Cartao {

    private UUID id;
    private String titular;

    public Cartao() {

    }

    public Cartao(UUID id, String titular) {
        this.id = id;
        this.titular = titular;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}