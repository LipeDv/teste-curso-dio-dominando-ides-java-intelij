package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato(null, null, null);

        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 365);
        System.out.println(livro1);
        /* int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
}
