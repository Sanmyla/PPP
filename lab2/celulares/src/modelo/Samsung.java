package modelo;
import interfaces.*;

public class Samsung implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        System.out.println("Construindo celular [" + modelo + "]");
        if(modelo.equalsIgnoreCase("Galaxy20")) {
            return new Galaxy20();
        }else{
            return new Galaxy8();
        }
    }
}
