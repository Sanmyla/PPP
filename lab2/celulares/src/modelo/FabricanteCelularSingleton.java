package modelo;
import interfaces.*;

public class FabricanteCelularSingleton {
    private static Apple apple;
    private static Samsung samsung;

    private FabricanteCelularSingleton(){}


    public static FabricanteCelular getAppleInstance(){

        if(apple == null){
            apple = new Apple();
        }
        return apple;
    }

    public static FabricanteCelular getSamsungInstance(){
        if(samsung == null){
            samsung = new Samsung();
        }
        return samsung;
    }

}
