public class Ovo extends PizzaDecorator {

    public Ovo(Pizza pizza){
        super(pizza);
    }

    public String getDescricao(){
        String descricaoSemOvo = super.getDescricao();
        return descricaoSemOvo + " ovo";
    }

    public double getCusto(){
        double custoSemOvo = super.getCusto();
        return custoSemOvo + 2.50;
    }

}