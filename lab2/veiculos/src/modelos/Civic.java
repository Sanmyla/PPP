package modelos;

import interfaces.IVehicle;

public class Civic implements IVehicle {
    @Override
    public void start() {
        System.out.println("Civic [ligando] vrum");
    }
    @Override
    public void stop() {
        System.out.println("Civic [parado] ...");
    }
    @Override
    public void drive() {
        System.out.println("Civic [rodando] VRUM VRUM");
    }
}
