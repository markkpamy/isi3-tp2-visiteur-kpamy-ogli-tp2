public interface Visiteur {

    public void visit(OperateurBinaire operateurBinaire);

    public void visit(Constante constante);

    public void visit(Negation negation);
}
