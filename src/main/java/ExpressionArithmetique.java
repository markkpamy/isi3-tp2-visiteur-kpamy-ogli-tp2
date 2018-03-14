public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
		// TODO
		VisiteurPostfixe visiteurPostfixe = new VisiteurPostfixe();
		this.getRacine().accept(visiteurPostfixe);
	}

	public int calculerValeur() {
		// TODO
		VisiteurCalcul visiteurCalcul = new VisiteurCalcul();
		this.getRacine().accept(visiteurCalcul);
		return visiteurCalcul.getValeur();
	}

	public int calculerHauteur() {
		// TODO
        VisiteurHauteur visiteurHauteur = new VisiteurHauteur();
		this.getRacine().accept(visiteurHauteur);
        return visiteurHauteur.getHauteur();
	}
	public void afficherInFixe() {
		// TODO
		System.out.println("\n infixe:");
		VisiteurInfixe visiteurInfixe = new VisiteurInfixe();
		this.getRacine().accept(visiteurInfixe);
	}
	public void afficherPreFixe() {
		// TODO
		System.out.println("\n prefixe:");
		VisiteurPrefixe visiteurPrefixe = new VisiteurPrefixe();
		this.getRacine().accept(visiteurPrefixe);
	}
	//public void
	
}
