package edu.carlosbrandao.metodos;

public class User {
    public static void main(String[] args) throws Exception {
         
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(0);
        smartTv.mudarCanal(-2);
        smartTv.mudarCanal(10);
        smartTv.passarCanal();
        smartTv.voltarCanal();
    }
}
