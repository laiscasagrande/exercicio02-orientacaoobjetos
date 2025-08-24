package org.example;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Exercicio01();
        Exercicio02();
        //Exercicio03();
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
        ArrayList<String> nomesPokemon = new ArrayList<>();
        ArrayList<String> tiposPokemon = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Random PokemonAleatorio = new Random();

        String nomePokemon = "";
        String tipoPokemon = "";

        System.out.print("Quantos pokemons você deseja gerar? ");
        int quantidadePokemonDesejada = scanner.nextInt();
        scanner.nextLine();

        while (nomesPokemon.size() < quantidadePokemonDesejada){
            System.out.print("Digite o nome do pokemon: ");
            nomePokemon = scanner.nextLine();
            nomesPokemon.add(nomePokemon);

            System.out.print("Digite o tipo do pokemon: ");
            tipoPokemon = scanner.nextLine();
            tiposPokemon.add(tipoPokemon);
        }

        int nome = PokemonAleatorio.nextInt(nomesPokemon.size());
        int tipo = PokemonAleatorio.nextInt(tiposPokemon.size());
        int nivel = PokemonAleatorio.nextInt(100) + 1;

        String nomeGeradoAleatoriamente = nomesPokemon.get(nome);
        String tipoGeradoAleatoriamente = tiposPokemon.get(tipo);

        System.out.println(nomeGeradoAleatoriamente + " é um Pokémon do tipo " + tipoGeradoAleatoriamente + " de nível " + nivel);
    }
}