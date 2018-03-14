public class VisiteurPostfixe implements Visiteur {

    public void visit(Constante constante) {
        System.out.print(constante.getValeur());
    }

    public void visit(Negation negation) {
        negation.getOpG().accept(this);
        System.out.print(negation.getOp());
    }

    public void visitBinaire(OperateurBinaire operateurBinaire) {
        operateurBinaire.getOpG().accept(this);
        operateurBinaire.getOpD().accept(this);
        System.out.print(operateurBinaire.getOp());
    }

    public void visit(Addition addition) {
        visitBinaire(addition);
    }

    public void visit(Multiplication multiplication) {
        visitBinaire(multiplication);
    }
}
