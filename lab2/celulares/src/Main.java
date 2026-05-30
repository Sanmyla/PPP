import interfaces.Celular;
import interfaces.FabricanteCelular;
import modelo.FabricanteCelularSingleton;

public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = FabricanteCelularSingleton.getAppleInstance();
        FabricanteCelular samsung = FabricanteCelularSingleton.getSamsungInstance();

        Celular iphoneX = apple.constroiCelular("iphoneX");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();

        Celular iphoneS = apple.constroiCelular("iphoneS");
        iphoneS.fazLigacao();
        iphoneS.tiraFoto();

        Celular galaxy8 = samsung.constroiCelular("galaxy8");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();

        Celular galaxy20 = samsung.constroiCelular("galaxy20");
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();

    }

}