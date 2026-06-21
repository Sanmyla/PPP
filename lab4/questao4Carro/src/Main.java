// ---------- FACADE ----------
// Esconde do cliente a necessidade de conhecer e coordenar cada subsistema
// individualmente, expondo apenas as operações de alto nível "dirigir" e

public class Main {
    public static void main(String[] args) {
        CarroFachada meuCarro = new CarroFachada("105.7 FM");

        meuCarro.dirigir();
        meuCarro.finalizarCorrida();
    }
}