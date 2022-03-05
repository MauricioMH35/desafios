package com.desafios.dio.poo.domain;

public class Gato extends Animal {

    public Gato() {

    }

    public Gato(String nome, String raca, String cor, Float peso, Boolean estimacao) {
        super(nome, raca, cor, peso, estimacao);
    }

    public static GatoBuilder builder() {
        return new GatoBuilder();
    }

    @Override
    public void acao() {
        if(isEstimacao())
            System.out.println("Miando!!!");
        else
            System.out.println("Rosnando!!!");
    }

    public void interacao() {
        acao();
    }

    public void interacao(String alimento) {
        alimentar(alimento);
    }

    public void interacao(Boolean passear) {
        if(isEstimacao() && passear) {
            System.out.println(super.getNome() + " gatos não passeiam!");
        } else {
            System.out.println(super.getNome() + " é um gato do mato, talves um maracajá, não é possível passear!");
        }
    }
}
