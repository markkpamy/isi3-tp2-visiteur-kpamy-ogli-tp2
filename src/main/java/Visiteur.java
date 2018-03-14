public interface Visiteur {

    public void visit(Addition addition);

    public void visit(Multiplication multiplication);

    public void visit(Constante constante);

    public void visit(Negation negation);
}
