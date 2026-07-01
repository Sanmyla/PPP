public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe.prepararReceita();

        Bebida capuccino = new Capuccino();
        capuccino.prepararReceita();

        Bebida cha = new Cha();
        cha.prepararReceita();
    }
}