public class VisiteurHauteur extends VisiteurPrefixe {

    private int hauteur = 0;

    @Override
    public void visitBinaire(OperateurBinaire operateurBinaire) {
        super.visitBinaire(operateurBinaire);
        hauteur += 1;
    }

    public int getHauteur() {
        return hauteur;
    }
}
