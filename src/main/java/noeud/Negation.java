package noeud;

import noeud.interfaces.Noeud;
import visiteur.interfaces.Visiteur;

public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}

	public void accept(Visiteur visiteur) {
		visiteur.visit(this);
	}
}
