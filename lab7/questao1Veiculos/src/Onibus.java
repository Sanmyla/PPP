// Classe Onibus com seus atributos específicos
class Onibus implements Veiculo {
    private int quantidadeLugares;
    private int anoFabricacao;

    public Onibus(int quantidadeLugares, int anoFabricacao) {
        this.quantidadeLugares = quantidadeLugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuantidadeLugares() { return quantidadeLugares; }
    public int getAnoFabricacao() { return anoFabricacao; }

    @Override
    public void accept(Visitor visitor) {
        // Redireciona a execução para o método visit específico de Onibus
        visitor.visit(this);
    }
}