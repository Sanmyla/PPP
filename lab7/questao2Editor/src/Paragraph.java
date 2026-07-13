// Representa um parágrafo de texto no editor
class Paragraph implements DocumentElement {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() { return text; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}