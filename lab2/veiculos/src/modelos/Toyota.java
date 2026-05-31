package modelos;

import interfaces.IVehicle;
import interfaces.IVehicleMaker;

public class Toyota implements IVehicleMaker {
    //instância única (Singleton)
    private static Toyota instance;

    //Construtor privado impede que usem "new Toyota()" no Main (Singleton)
    private Toyota() {}

    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    // Factory
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Corolla")) {
            return new Corolla();
        } else if (modelo.equalsIgnoreCase("Hilux")) {
            return new Hilux();
        } else if (modelo.equalsIgnoreCase("Etios")) {
            return new Etios();
        }
        throw new IllegalArgumentException("Modelo Toyota não encontrado: " + modelo);
    }
}