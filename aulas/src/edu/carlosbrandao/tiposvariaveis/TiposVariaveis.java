package edu.carlosbrandao.tiposvariaveis;

public class TiposVariaveis {

    // Estudar tipos primitivos.
    // Estudar classe String (variável de texto).

    public static void main(String[] args) {
        
        final float VALOR_DE_PI = 3.14F; // final = constante.
        double salarioMinimo = 1400.00;
        int salarioMinimoInt = 1400;
        long cpf = 98765432109L; // Caso inicie com 0, deve-se utilizar String, por exemplo.
        
        short numeroCurto = 1;
        int numeroInteiro = numeroCurto;
        //short numeroCurto2 = numeroInteiro; // Não realiza conversão para "menor".
        short numeroCurto2 = (short)numeroInteiro; // casting
    }

}
