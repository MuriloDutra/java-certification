package Pessoa;//"package" sempre deve ser a primeira informação a aparecer no arquivo 
import java.util.Date;
import java.io.*;

/**
 * JAVADOC - serve para documentar sua classe
*/

public class Pessoa {
    String nome;
    public static void main(String [] args){
        System.out.println("main");
    }

    Pessoa(String name){
        this.nome = nome;
    }

    public String getNome(){
        String sobrenome = "Dutra Alves";
        return this.nome + sobrenome; 
    }
}

interface Figura {
    final int TAMANHO = 5;
    void mostraImagem(String image);

    /*  Equivalentes: 
            public final int TAMANHO = 5;
            public void mostraImagem(String image);

            ou

            public static final int TAMANHO = 5;
            public abstract void mostraImagem(String image);
    */
}