package edu.carlosbrandao.loop;

public class ForComBreakContinue {
    public static void main(String[] args) {
        
        //break interrompe a execução do laço quando a condição é satisfeita
        for(int i = 1; i <= 5; i++){
            if (i == 3) {
                break;
            }

            System.out.println(i);
        }

        System.out.println(); //pular linha

        //continue pula a etapa quando a condição é satisfeita
        for(int j = 1; j <= 5; j++){
            if (j == 3) {
                continue;
            }

            System.out.println(j);
        }
    }
}
