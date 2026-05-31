package modelos;

import interfaces.IVehicle;

public class Fit implements IVehicle {
    @Override
    public void start() {
        System.out.println("Fit [ligando] vrum");
    }

    @Override
    public void stop() {
        System.out.println("Fit [parado] ...");
    }

    @Override
    public void drive() {
        System.out.println("Fit [rodando] VRUM VRUM");
    }
}
