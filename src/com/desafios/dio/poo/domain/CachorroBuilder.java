package com.desafios.dio.poo.domain;

public class CachorroBuilder {

    private String nome;
    private String raca;
    private String cor;
    private Float peso;
    private Boolean estimacao;

    public CachorroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public CachorroBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public CachorroBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public CachorroBuilder peso(Float peso) {
        this.peso = peso;
        return this;
    }

    public CachorroBuilder estimacao(Boolean estimacao) {
        this.estimacao = estimacao;
        return this;
    }

    public Cachorro build() {
        return new Cachorro(nome, raca, cor, peso, estimacao);
    }
}
