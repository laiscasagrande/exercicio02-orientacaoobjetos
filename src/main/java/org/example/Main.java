package org.example;

public class Main {
    public static void main(String[] args) {
        //Exercicio01();
       // Exercicio02();
        Exercicio03();
    }

    public static void Exercicio01() {
        String[] caracteresAlfaNumericos = {"0", "a", "@", "#", "5", "_", "8", "9", "!", "1"};

        GeradorSenha novaSenha = new GeradorSenha(caracteresAlfaNumericos);
        System.out.println(novaSenha.getSenha());
    }

    public static void Exercicio02() {
        String[] nomes = {"Cristiano", "Neymar", "Lionel"};
        String[] sobrenomes = {"Ronaldo", "Júnior", "Messi"};
        String[] posicoes = {"zagueiro", "atacante", "goleiro"};
        String[] clubes = {"Flamengo", "Corinthias", "Palmeiras"};

        GeradorJogador geradorJogador = new GeradorJogador(nomes, sobrenomes, posicoes, clubes);

        System.out.println(geradorJogador.getJogador());
    }

    public static void Exercicio03() {
        String[] nomesPokemon = {"Bulbasaur", "Pikachu", "Eevee"};
        String[] tiposPokemon = {"Planta/Veneno", "Elétrico", "Normal"};

        new GeradorPokemon(nomesPokemon, tiposPokemon);
    }
}