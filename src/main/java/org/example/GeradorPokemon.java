package org.example;
import java.util.Scanner;
import java.util.Random;


public class GeradorPokemon {
    String[] nomesPokemon =  {};
    String[] tiposPokemon = {};
    String[] pokemonsGerados =  {};

    Random PokemonAleatorio = new Random();
    Scanner scanner = new Scanner(System.in);

    String nome;
    String tipo;

    GeradorPokemon() {
        System.out.print("Quantos pokemons você deseja gerar? ");
        Integer quantidadePokemonDesejada = scanner.nextInt();

        while(pokemonsGerados.length > quantidadePokemonDesejada){
            int nome = PokemonAleatorio.nextInt(nomesPokemon.length);
            int tipo = PokemonAleatorio.nextInt(tiposPokemon.length);

            this.nome = nomesPokemon[nome];
            this.tipo = tiposPokemon[tipo];


        }
    }



    int nome = PokemonAleatorio.nextInt(nomesPokemon.size());
    int tipo = PokemonAleatorio.nextInt(tiposPokemon.size());
    int nivel = PokemonAleatorio.nextInt(100) + 1;

    String nomeGeradoAleatoriamente = nomesPokemon.get(nome);
    String tipoGeradoAleatoriamente = tiposPokemon.get(tipo);

       // System.out.println(nomeGeradoAleatoriamente + " é um Pokémon do tipo " + tipoGeradoAleatoriamente + " de nível " + nivel);
}
