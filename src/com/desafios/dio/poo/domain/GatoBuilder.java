package com.desafios.dio.poo.domain;

public class GatoBuilder {

    private String nome;
    private String raca;
    private String cor;
    private Float peso;
    private Boolean estimacao;

    public GatoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public GatoBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public GatoBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public GatoBuilder peso(Float peso) {
        this.peso = peso;
        return this;
    }

    public GatoBuilder estimacao(Boolean estimacao) {
        this.estimacao = estimacao;
        return this;
    }

    public Gato build() {
        return new Gato(nome, raca, cor, peso, estimacao);
    }
}
