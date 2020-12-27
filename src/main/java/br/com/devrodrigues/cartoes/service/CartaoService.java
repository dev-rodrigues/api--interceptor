package br.com.devrodrigues.cartoes.service;

import br.com.devrodrigues.cartoes.domain.entities.Cartao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CartaoService {

   @Cacheable(cacheNames = "cartoes", key="CartaoService.execute.cartao")
    public List<Cartao> execute() {

        List<Cartao> retorno = new ArrayList<>();

        retorno.addAll(Arrays.asList(new Cartao(UUID.randomUUID(), "teste")));

        return retorno;
    }
}
