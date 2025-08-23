package org.example;

import java.util.Random;

public class GeradorJogador {
    String[] nomes = {};
    String[] sobrenomes = {};
    String[] posicoes = {};
    String[] clubes = {};

    String nome;
    String sobrenome;
    String clube;
    String posicao;
    Short idade;

    Random geradorJogador = new Random();

    GeradorJogador(String[] nomes, String[] sobrenomes, String[] posicoes, String[] clubes) {
        int nome = geradorJogador.nextInt(nomes.length);
        int sobrenome = geradorJogador.nextInt(sobrenomes.length);
        int posicao = geradorJogador.nextInt(posicoes.length);
        int clube = geradorJogador.nextInt(clubes.length);
        Short idade = (short) geradorJogador.nextInt(16, 65);


        this.nome = nomes[nome];
        this.sobrenome = sobrenomes[sobrenome];
        this.posicao = posicoes[posicao];
        this.clube = clubes[clube];
        this.idade = idade;
    }

    String getJogador() {
        return nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }

}
