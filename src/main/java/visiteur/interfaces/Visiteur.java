package visiteur.interfaces;

import noeud.Addition;
import noeud.Constante;
import noeud.Multiplication;
import noeud.Negation;

public interface Visiteur {

    public void visit(Addition addition);

    public void visit(Multiplication multiplication);

    public void visit(Constante constante);

    public void visit(Negation negation);
}
