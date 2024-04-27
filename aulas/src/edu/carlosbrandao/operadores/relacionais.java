package edu.carlosbrandao.operadores;

public class relacionais {
    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;

        System.out.println("Numero 1 maior que numero 2? " + (numero1 > numero2));
        System.out.println("Numero 1 menor que numero 2? " + (numero1 < numero2));
        System.out.println("Numero 1 maior ou igual que numero 2? " + (numero1 >= numero2));
        System.out.println("Numero 1 menor ou igual que numero 2? " + (numero1 <= numero2));
        System.out.println("Numero 1 é igual a numero 2? " + (numero1 == numero2));
        System.out.println("Numero 1 é diferente de numero 2? " + (numero1 != numero2));

        String nome = "Carlos";
        String sobrenome = new String("Silva"); // Objeto

        // Para comparação com objeto utiliza-se equals
        System.out.println(nome.equals(sobrenome));
    }
}
