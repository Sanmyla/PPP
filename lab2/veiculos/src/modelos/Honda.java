package modelos;

import interfaces.IVehicle;
import interfaces.IVehicleMaker;

public class Honda implements IVehicleMaker {
    // Mecânica do Singleton
    private static Honda instance;

    private Honda() {}

    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }

    // Mecânica do Factory Method
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("City")) {
            return new City();
        } else if (modelo.equalsIgnoreCase("Civic")) {
            return new Civic();
        } else if (modelo.equalsIgnoreCase("Fit")) {
            return new Fit();
        }
        throw new IllegalArgumentException("Modelo Honda não encontrado: " + modelo);
    }
}