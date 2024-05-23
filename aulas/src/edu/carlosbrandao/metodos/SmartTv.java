package edu.carlosbrandao.metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    public void passarCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void voltarCanal() {
        
        if (canal > 0) {
            canal--;
        }

        System.out.println("Canal: " + canal);
    }

    public void mudarCanal(int novoCanal) {

        if (novoCanal >= 0) {
            canal = novoCanal;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("Canal não existe.");
        }
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        
        if (volume > 0) {
            volume--;
        }

        System.out.println("Volume: " + volume);
    }
}
