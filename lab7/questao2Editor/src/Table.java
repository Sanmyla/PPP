// Representa uma tabela de dados
class Table implements DocumentElement {
    private String[][] content; // Matriz simples simulando as linhas e colunas da tabela

    public Table(String[][] content) {
        this.content = content;
    }

    public String[][] getContent() { return content; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}