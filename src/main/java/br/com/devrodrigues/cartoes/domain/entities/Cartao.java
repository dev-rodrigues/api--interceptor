package br.com.devrodrigues.cartoes.domain.entities;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.UUID;

@RedisHash(value = "cartao", timeToLive = 10)
public class Cartao implements Serializable {

    private static final long serialVersionUID = 1L;

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