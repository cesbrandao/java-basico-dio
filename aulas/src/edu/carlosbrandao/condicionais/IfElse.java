package edu.carlosbrandao.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quando deseja sacar?");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado <= saldo && valorSolicitado > 0) {
            saldo -= valorSolicitado;

            System.out.println("Novo saldo: " + saldo);
        } else if (valorSolicitado > saldo) {
            System.out.println("Saldo Insuficiente!");
        } else {
            System.out.println("Valor Inválido!");
        }       
    }
}
