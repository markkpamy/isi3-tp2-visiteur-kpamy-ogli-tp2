public interface Visiteur {
    void visit(Addition addition);
    void visit(Negation negation);
    void visit(Multiplication multiplication);
    void visit(Constante constante);
}
