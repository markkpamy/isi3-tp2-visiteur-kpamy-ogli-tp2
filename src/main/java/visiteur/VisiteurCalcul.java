package visiteur;

import noeud.*;

public class VisiteurCalcul extends VisiteurPostfixe{

    private int valeur;

    @Override
    public void visit(Constante constante) {
        super.visit(constante);
        this.valeur = constante.getValeur();
    }

    @Override
    public void visit(Negation negation) {
        super.visit(negation);
        this.valeur = -valeur;
    }

    @Override
    public void visit(Addition addition) {
        int left = getLeft(addition);
        this.valeur += left;
    }

    private int getLeft(OperateurBinaire operateurBinaire) {
        operateurBinaire.getOpG().accept(this);
        int left = this.valeur;
        operateurBinaire.getOpD().accept(this);
        return left;
    }

    @Override
    public void visit(Multiplication multiplication) {
        int left = getLeft(multiplication);
        this.valeur *= left;
    }

    public int getValeur() {
        return valeur;
    }
}
