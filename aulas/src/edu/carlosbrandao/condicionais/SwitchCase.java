package edu.carlosbrandao.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual tamanho você veste (P, M ou G)?");
        String tamanho = scanner.next();

        //para condições com AND ou OR é mais interessante utilizar If Else!
        //exemplo apenas a título de curiosidade.
        switch (tamanho) {
            case "P":
            case "p":                
                System.out.println("PEQUENO");
                break;
        
            case "M":
            case "m":                    
                System.out.println("MÉDIO");
                break;
                
            case "G":
            case "g":
                System.out.println("GRANDE");
                break;

            default:
                System.out.println("Tamanho Inválido!");
                break;
        }
    }
}
