package edu.carlosbrandao.loop;

public class ForComArray {
    public static void main(String[] args) {
        
        String pessoas[] = {"CARLOS","EDUARDO","BARBARA","CRISTINA","OPALA","JEFFERSON"};

        for(int i = 0; i < pessoas.length; i++){
            System.out.println("Posição: " + (i + 1) + " Nome: " + pessoas[i]);
        }
    }
}
