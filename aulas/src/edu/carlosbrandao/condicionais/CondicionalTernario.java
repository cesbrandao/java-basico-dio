package edu.carlosbrandao.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernario {
    public static void main(String[] args) {
        
        /* int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado); */

        double saldo = 25.0;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quando deseja sacar?");
        double valorSolicitado = scanner.nextDouble();

        //condicional ternária é interessante apenas para casos mais simples.
        //exemplo apenas a título de curiosidade.
        String resultadoTransacao = valorSolicitado <= saldo && valorSolicitado > 0 ? "Novo saldo: " + (saldo -= valorSolicitado) : valorSolicitado > saldo ? "Saldo Insuficiente!" : "Valor Inválido!";

        System.out.println(resultadoTransacao);
    }
}
