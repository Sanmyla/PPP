import interfaces.IVehicle;
import interfaces.IVehicleMaker;
import modelos.Honda;
import modelos.Toyota;

public class Main {
    public static void main(String[] args) {

        /*
        * Padroes utilizados:
        * Factory Method(Metodo de fabrica) -> para uma redução de acoplameto estrutural,
        *  respeitando o Principio de abeto/fehado. Com esse padrao a classe Main nao precisa
        *  instaciar as outras classes usando New
        * Singleton -> Singleton dentro das classes Toyota e Honda para garantir que essas
        *  fábricas sejam instâncias únicas na memória, espelhando corretamente o domínio real
        *  do problema
        * */

        System.out.println("--- Testando o Singleton das Fábricas ---");
        // metodo estatico
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