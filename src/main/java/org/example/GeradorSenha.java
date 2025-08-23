package org.example;
import java.util.Random;

public class GeradorSenha {
    String[] caracteresAlfaNumericos = {};
    String[] caracteresSorteados = new String[8];

    GeradorSenha(String[] caracteresAlfaNumericos) {
        Random geradorSenha = new Random();
        this.caracteresAlfaNumericos = caracteresAlfaNumericos;
        for (int i = 0; i < caracteresSorteados.length; i++){
            int index = geradorSenha.nextInt(caracteresAlfaNumericos.length);
            caracteresSorteados[i] = caracteresAlfaNumericos[index];
        };
    }

    public String getSenha() {
        StringBuilder senha = new StringBuilder();
        for (String c : caracteresSorteados) {
            senha.append(c);
        }
        return senha.toString();
    }

}
