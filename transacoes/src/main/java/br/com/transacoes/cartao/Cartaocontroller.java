package br.com.transacoes.cartao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cartao")


public class Cartaocontroller {
//    injeção

    @Autowired
    CartaoRepository cartaoRepository;


//    POST
    @PostMapping
        public Cartao cadastraCartao(@RequestBody @Valid CartaoRequest cartaoRequest){
            Cartao cartao = cartaoRequest.paraCartao();
//        solicitando dados retornando via string
        cartaoRepository.save(cartao);
        return cartao;
        }
}
