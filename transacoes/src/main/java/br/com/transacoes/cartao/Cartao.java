package br.com.transacoes.cartao;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String numCartao;



    public Cartao(String numCartao) {
        this.numCartao = numCartao;
    }

    @Deprecated
    public Cartao() {
    }

    public String getNumCartao() {
        return numCartao;
    }
}
