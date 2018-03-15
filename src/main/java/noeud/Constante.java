package noeud;

import noeud.interfaces.Noeud;
import visiteur.interfaces.Visiteur;

public class Constante implements Noeud {
	private int valeur;
	public Constante(int v){
		valeur = v;
	}
	public int getValeur(){return valeur;}

	public void accept(Visiteur visiteur) {
		visiteur.visit(this);
	}

    public int getPriorite() {
        return Priorite.CONSTANTE.getPriorite();
    }
}
