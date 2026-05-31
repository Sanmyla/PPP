package modelos;

import interfaces.IVehicle;

public class Hilux implements IVehicle {
    @Override
    public void start() {
        System.out.println("Hilux[ligando] vrum");
    }

    @Override
    public void stop() {
        System.out.println("Hilux[parado] ...");
    }

    @Override
    public void drive() {
        System.out.println("Hilux [rodando] VRUM VRUM");
    }
}
