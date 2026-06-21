public class Main {

    public static void main(String ... args){

        Pizza minhaPizzaDeHoje = new Ovo(new Tomate(new MassaFinaPizza()));
        System.out.println(minhaPizzaDeHoje.getCusto());
        System.out.println(minhaPizzaDeHoje.getDescricao());

        Pizza minhaPizzaDeSabado = new Ovo(new Tomate(new MassaEspessaPizza()));
        System.out.println(minhaPizzaDeSabado.getCusto());
        System.out.println(minhaPizzaDeSabado.getDescricao());
    }

}