// Interface que define o elemento aceitador da árvore (Element)
interface DocumentElement {
    void accept(DocumentVisitor visitor);
}