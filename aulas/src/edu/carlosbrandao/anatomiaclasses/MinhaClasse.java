package edu.carlosbrandao.anatomiaclasses;

public class MinhaClasse {
    
    public static void main(String[] args) {
        
        //System.out.println("Hello World!");

        //final String BR = "Brasil"; // final = const(?)

        String primeiroNome = "Cadu";
        String segundoNome = "Brandão";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
