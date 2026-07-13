// Operação 1: Exportador para formato HTML
class ExportToHTMLVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("<p>" + paragraph.getText() + "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("<img src=\"" + image.getSourcePath() + "\" alt=\"" + image.getAltText() + "\">");
    }

    @Override
    public void visit(Table table) {
        System.out.println("<table>");
        for (String[] row : table.getContent()) {
            System.out.print("  <tr>");
            for (String cell : row) {
                System.out.print("<td>" + cell + "</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}