// Classe Bicicleta com seus atributos específicos
class Bicicleta implements Veiculo {
    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() { return cor; }

    @Override
    public void accept(Visitor visitor) {
        // Redireciona a execução para o método visit específico de Bicicleta
        visitor.visit(this);
    }
}