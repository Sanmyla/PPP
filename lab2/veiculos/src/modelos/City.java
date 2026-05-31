package modelos;

import interfaces.IVehicle;

public class City implements IVehicle {
    @Override
    public void start() {
        System.out.println("Ciy [ligando] vrum");
    }

    @Override
    public void stop() {
        System.out.println("City [parado] ...");
    }

    @Override
    public void drive() {
        System.out.println("Ciy [rodando] VRUM VRUM");
    }
}
