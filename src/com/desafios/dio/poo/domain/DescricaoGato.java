package com.desafios.dio.poo.domain;

public class DescricaoGato implements IDescricao<Gato> {

    @Override
    public String get(Gato alvo) {
        String estimacao = alvo.isEstimacao() ? "de estimacao" : "selvagem";
        return alvo.getNome() + " é um gato " + alvo.getCor() + " da raça " + alvo.getRaca() +
                " com um peso de " + alvo.getPeso() + "Kg é um animal " + estimacao;
    }

}
