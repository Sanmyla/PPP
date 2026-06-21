public class Tomate extends PizzaDecorator {

    public Tomate(Pizza pizza){
        super(pizza);
    }

    public String getDescricao(){
        String descricaoSemTomate = super.getDescricao();
        return descricaoSemTomate + " tomate";
    }

    public double getCusto(){
        double custoSemTomate = super.getCusto();
        return custoSemTomate + 10.00;
    }

}