package edu.carlosbrandao.operadores;

public class Logicos {

    public static void main(String[] args) {
         
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){ // E
            System.out.println("As duas condições são verdadeiras.");
        } else {
            System.out.println("Pelo menos uma das condições é falsa.");
        }

        if(condicao1 || condicao2){ // OU
            System.out.println("Pelo menos uma das condições é verdadeira.");
        } else {
            System.out.println("As duas condições são falsas.");
        }
    }
}
