package org.example;
import java.util.Scanner;
import java.util.Random;


public class GeradorPokemon {
    Random PokemonAleatorio = new Random();
    Scanner scanner = new Scanner(System.in);

    String nome;
    String tipo;
    Short nivel;

    GeradorPokemon(String[] nomesPokemon, String[] tiposPokemon) {
        System.out.print("Quantos pokemons você deseja gerar? ");
        Integer quantidadePokemonDesejada = scanner.nextInt();

        for (int i = 0; i < quantidadePokemonDesejada; i++) {
            int nomeAleatorio = PokemonAleatorio.nextInt(nomesPokemon.length);
            int tipoAleatorio = PokemonAleatorio.nextInt(tiposPokemon.length);
            Short nivel = (short) PokemonAleatorio.nextInt(1, 100);

            this.nome = nomesPokemon[nomeAleatorio];
            this.tipo = tiposPokemon[tipoAleatorio];
            this.nivel = nivel;

            System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel);
        }
    }
}
