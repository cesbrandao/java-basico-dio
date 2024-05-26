package edu.carlosbrandao.loop;

public class ForEach {
    public static void main(String[] args) {
        
        String pessoas[] = {"CARLOS","EDUARDO","BARBARA","CRISTINA","OPALA","JEFFERSON"};

        for(String pessoa: pessoas){
            System.out.println("Nome: " + pessoa);
        }
    }
}
