public class VisiteurInfixe implements Visiteur {

    public void visit(Constante constante) {
        System.out.print(constante.getValeur());
    }

    public void visit(Negation negation) {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
    }

    public void visitBinaire(OperateurBinaire operateurBinaire) {
        if (operateurBinaire.getOpG().getPriorite() > -1 && operateurBinaire.getPriorite() > operateurBinaire.getOpG().getPriorite()) {
            System.out.print("(");
        }
        operateurBinaire.getOpG().accept(this);
        if (operateurBinaire.getOpG().getPriorite() > -1 && operateurBinaire.getPriorite() > operateurBinaire.getOpD().getPriorite()) {
            System.out.print(")");
        }
        System.out.print(operateurBinaire.getOp());
        operateurBinaire.getOpD().accept(this);

        }

    public void visit(Addition addition) {
        visitBinaire(addition);
    }

    public void visit(Multiplication multiplication) {
        visitBinaire(multiplication);
    }
}
