package noeud.interfaces;

import visiteur.interfaces.Visiteur;

public interface Visitable {

    public void accept(Visiteur visiteur);
}
