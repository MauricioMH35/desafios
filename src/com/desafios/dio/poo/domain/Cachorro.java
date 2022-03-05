package com.desafios.dio.poo.domain;

public class Cachorro extends Animal {

    public Cachorro() {

    }

    public Cachorro(String nome, String raca, String cor, Float peso, Boolean estimacao) {
        super(nome, raca, cor, peso, estimacao);
    }

    public static CachorroBuilder builder() {
        return new CachorroBuilder();
    }

    @Override
    public void acao() {
        if(isEstimacao() == true)
            System.out.println("Latindo!!!");
        else
            System.out.println("Uivando!!!");
    }

    public void interacao() {
        acao();
    }

    public void interacao(String alimento) {
        alimentar(alimento);
    }

    public void interacao(Boolean passear) {
        if(isEstimacao() && passear) {
            System.out.println(super.getNome() + " vai passear!");
        } else {
            System.out.println(super.getNome() + " é um cachorro selvagem, talvez um lobo, não dá" +
                    " para passear com ele(a)!");
        }
    }
}
