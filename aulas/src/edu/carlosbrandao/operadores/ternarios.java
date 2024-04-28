package edu.carlosbrandao.operadores;

public class Ternarios {
    
    public static void main(String[] args) {
        
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE

        String resultado = "";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */ 

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        
        String resultado = (a==b) ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
