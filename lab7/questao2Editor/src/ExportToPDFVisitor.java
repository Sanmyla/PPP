// Operação 2: Exportador simulado para formato PDF
class ExportToPDFVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("[PDF] Renderizando parágrafo com fonte Helvetica: " + paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println("[PDF] Desenhando imagem de " + image.getSourcePath() + " com legenda: " + image.getAltText());
    }

    @Override
    public void visit(Table table) {
        System.out.println("[PDF] Desenhando grade de tabela com " + table.getContent().length + " linhas.");
    }
}