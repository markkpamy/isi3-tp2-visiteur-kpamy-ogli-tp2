package noeud;

import noeud.interfaces.Noeud;
import visiteur.interfaces.Visiteur;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	public void accept(Visiteur visiteur) {
		visiteur.visit(this);
	}
}
