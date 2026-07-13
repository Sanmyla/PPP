// Interface que define os métodos de visitação para cada tipo de elemento de texto
interface DocumentVisitor {
    void visit(Paragraph paragraph);
    void visit(Image image);
    void visit(Table table);
}