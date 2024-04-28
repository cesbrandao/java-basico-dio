package edu.carlosbrandao.operadores;

public class Unarios {

    public static void main(String[] args) {
        
        // Inversão
        int valor = 5;

        valor = -valor;

        System.out.println(valor);

        boolean variavel = false;

        variavel = !variavel; // Negação

        System.out.println(variavel);

        // Incremento

        int valor2 = 5;

        valor2++; // valor2 = valor2 + 1;

        System.out.println(valor2);
        System.out.println(valor2++); // Imprime o valor, depois soma 1
        System.out.println(valor2);
        System.out.println(++valor2); // Soma 1 e depois imprime o valor final
    }
    
}
