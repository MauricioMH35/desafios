package com.desafios.dio.poo;

import com.desafios.dio.poo.domain.*;

public class Application {
    public static void main(String[] args) {
        IDescricao desCachorro = new DescricaoCachorro();
        IDescricao desGato = new DescricaoGato();

        Cachorro c1 = Cachorro.builder()
                .nome("Tobby")
                .raca("Labrador")
                .cor("Marrom")
                .peso(7.5f)
                .estimacao(true)
                .build();
        System.out.println("\n" + desCachorro.get(c1));
        c1.acao();
        c1.interacao("Petisco");
        c1.interacao(true);

        Cachorro c2 = Cachorro.builder()
                .nome("Snow")
                .raca("Canis lupus irremotus")
                .cor("Branco")
                .peso(10.24f)
                .estimacao(false)
                .build();
        System.out.println("\n" + desCachorro.get(c2));
        c2.acao();
        c2.interacao("Carne");
        c2.interacao(true);

        Gato g1 = Gato.builder()
                .nome("Dexter")
                .raca("Indefinida")
                .cor("Branco Rajado")
                .peso(2.23f)
                .estimacao(true)
                .build();
        System.out.println("\n" + desGato.get(g1));
        g1.acao();
        g1.interacao("Sache sabor frango");
        g1.interacao(true);

        Gato g2 = Gato.builder()
                .nome("Ghost")
                .raca("Maracajá")
                .cor("Laranja Rajado")
                .peso(3.43f)
                .estimacao(false)
                .build();
        System.out.println("\n" + desGato.get(g2));
        g2.acao();
        g2.interacao("Ave");
        g2.interacao(true);
    }
}
