import interfaces.IVehicle;
import interfaces.IVehicleMaker;
import modelos.Honda;
import modelos.Toyota;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Testando o Singleton das Fábricas ---");
        // usamos o metodo estatico
        IVehicleMaker fabricaToyota = Toyota.getInstance();
        IVehicleMaker fabricaHonda = Honda.getInstance();

        System.out.println("--- Testando o Factory Method ---");
        IVehicle meuCarro1 = fabricaToyota.makeVehicle("Corolla");
        IVehicle meuCarro2 = fabricaHonda.makeVehicle("Civic");

        // Colocando os carros para funcionar polimorficamente
        System.out.println("\n[Carro 1]");
        meuCarro1.start();
        meuCarro1.drive();
        meuCarro1.stop();

        System.out.println("\n[Carro 2]");
        meuCarro2.start();
        meuCarro2.drive();
        meuCarro2.stop();
    }
}