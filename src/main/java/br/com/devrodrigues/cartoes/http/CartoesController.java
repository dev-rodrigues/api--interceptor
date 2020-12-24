package br.com.devrodrigues.cartoes.http;

import br.com.devrodrigues.cartoes.domain.annotation.AllowAccelerator;
import br.com.devrodrigues.cartoes.domain.entities.Cartao;
import br.com.devrodrigues.cartoes.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cartoes")
public class CartoesController {

    @Autowired
    private CartaoService service;

    @AllowAccelerator
    @GetMapping(path = "/homes")
    public ResponseEntity<List<Cartao>> obterCartoes() {
        List<Cartao> response = service.execute();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(path = "/dash")
    public ResponseEntity<List<Cartao>> obter() {
        List<Cartao> response = service.execute();
        return ResponseEntity.ok().body(response);
    }

}