// Classe Carro com seus atributos específicos
class Carro implements Veiculo {
    private String cor;
    private String marca;
    private String modelo;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters para que o Visitor possa acessar as informações
    public String getCor() { return cor; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    @Override
    public void accept(Visitor visitor) {
        // Redireciona a execução para o método visit específico de Carro
        visitor.visit(this);
    }
}