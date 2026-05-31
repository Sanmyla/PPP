package modelos;

import interfaces.IVehicle;

public class Corolla implements IVehicle {
    @Override
    public void start() {
        System.out.println("Corolla [ligado] vrum");
    }

    @Override
    public void stop() {
        System.out.println("Corolla [parado] ...");
    }

    @Override
    public void drive() {
        System.out.println("Corolla [rodando] VRUM VRUM");
    }
}
