package modelos;

import interfaces.IVehicle;

public class Etios implements IVehicle {
    @Override
    public void start() {
        System.out.println("Etios [ligado] vrum");
    }

    @Override
    public void stop() {
        System.out.println("Etios [parado] ...");

    }

    @Override
    public void drive() {
        System.out.println("Etios [rodando] VRUMVRUM");

    }
}
