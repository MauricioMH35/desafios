package com.desafios.dio.poo.domain;

import java.util.Objects;

public class Animal {

    private String nome;
    private String raca;
    private String cor;
    private Float peso;
    private Boolean estimacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean isEstimacao() {
        return estimacao;
    }

    public void setEstimacao(Boolean estimacao) {
        this.estimacao = estimacao;
    }

    public Animal() {

    }

    public Animal(String nome, String raca, String cor, Float peso, Boolean estimacao) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
        this.estimacao = estimacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) &&
                Objects.equals(raca, animal.raca) &&
                Objects.equals(cor, animal.cor) &&
                Objects.equals(peso, animal.peso) &&
                Objects.equals(estimacao, animal.estimacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raca, cor, peso, estimacao);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", peso=" + peso +
                ", estimacao=" + estimacao +
                '}';
    }

    public void acao() {
        System.out.println("Acionar interação do animal!");
    }

    protected void alimentar(String alimento) {
        System.out.println("Seu animal " + nome + " foi alimentado com " + alimento);
    }
}
