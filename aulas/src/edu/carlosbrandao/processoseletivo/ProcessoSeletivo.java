package edu.carlosbrandao.processoseletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Processo Seletivo");

        /* 
        *   //execução do cenário 1 - setar valores para o método analisarSalarioCandidato
        *   analisarSalarioCandidato(1800.0);
        *   analisarSalarioCandidato(2000.0);
        *   analisarSalarioCandidato(2200.0); 
        */

        /* //execução do cenário 2 - selecionar candidatos com valor pretendido adequado
        selecaoCandidatos(); */

        /* //execução do cenário 3 - imprimir lista de candidatos
        imprimirCadidatos(); */

        //execução do cenário 4 - entrar em contato com candidatos selecionados
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(String candidato : candidatos){
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        //neste caso, o contador inicia em 1 e vai até < 3 pois a verificação é realizada apenas no final

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA.");
        }
    }

    //simula que se um valor entre 1 e 3 for igual a 1, o candidato atendeu
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCadidatos(){
        // Array com a lista de candidatos selecionados
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Lista de candidatos: ");

        for(int i=0; i<candidatos.length; i++){
            System.out.println((i + 1) + " " + candidatos[i]);
        }

        /* //for each - sem índice
        for(String candidato : candidatos){
            System.out.println(candidato);
        } */
    }

    static void selecaoCandidatos(){     
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int contadorCandidatos = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && contadorCandidatos < candidatos.length) {
            String candidato = candidatos[contadorCandidatos];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para o processo seletivo.");
                candidatosSelecionados++; 
            }
            contadorCandidatos++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarSalarioCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
