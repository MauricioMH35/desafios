package com.desafios.dio.poo.domain;

public class DescricaoCachorro implements IDescricao<Cachorro> {

    @Override
    public String get(Cachorro alvo) {
        String estimacao = alvo.isEstimacao() ? "de estimacao" : "selvagem";
        return alvo.getNome() + " é um cachorro " + alvo.getCor() + " da raça " + alvo.getRaca() +
                " com um peso de " + alvo.getPeso() + "Kg é um animal " + estimacao;
    }

}
