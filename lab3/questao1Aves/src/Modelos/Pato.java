package Modelos;

import Interfaces.Ave;

public class Pato implements Ave {
    @Override
    public void voar(){
        System.out.println("Voando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Pato esta grasnando");
    }
}
