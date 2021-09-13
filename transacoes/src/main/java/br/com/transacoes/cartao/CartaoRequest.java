package br.com.transacoes.cartao;

import com.fasterxml.jackson.annotation.JsonCreator;

public class CartaoRequest {


    String numCartao;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)// Gera Json da propriedade quando tem apenas um campo
    public CartaoRequest(String numCartao) {
        this.numCartao = numCartao;
    }

    public Cartao paraCartao() {

        return new Cartao(this.numCartao);
    }
    public String getNumCartao() {
        return numCartao;
    }


}

