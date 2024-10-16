package edu.gustavo.variaveis;

import java.util.Date;

public class Variaveis {
    public static void main(String[] args) {

        String nome = "Gustavo";
        final String sobrenome = "Mendes";

        int idade = 22;
        final int ano = 2002;

        double altura = 1.75;


        Date hoje = new Date();
        String dataFormatada = hoje.toString();

        System.out.println(
                "Ola me chamo " + nome + " " + sobrenome + " nasci em " + ano + " e tenho " + idade + ", tenho tambem " + altura + " de altura "
        );

        System.out.println(
                dataFormatada
        );

    }

}
