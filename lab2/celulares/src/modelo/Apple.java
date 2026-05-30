package modelo;
import interfaces.*;

public class Apple implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        System.out.println("Construindo celular [" + modelo + "]");
        if(modelo.equalsIgnoreCase("IphoneX")) {
            return new IphoneX();
        }else{
            return new IphoneS();
        }
    }
}
