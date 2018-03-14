public class VisiteurPrefixe implements Visiteur{

    public void visit(Constante constante) {
        System.out.print(constante.getValeur());
    }

    public void visit(Negation negation) {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
    }

    public void visitBinaire(OperateurBinaire operateurBinaire) {
        System.out.print(operateurBinaire.getOp());
        operateurBinaire.getOpG().accept(this);
        operateurBinaire.getOpD().accept(this);
    }

    public void visit(Addition addition) {
        visitBinaire(addition);
//        addition.getOpG()
    }

    public void visit(Multiplication multiplication) {
        visitBinaire(multiplication);
    }
}
