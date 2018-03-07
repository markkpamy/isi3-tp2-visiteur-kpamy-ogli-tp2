public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	public void accept(Visiteur visiteur) {
		visiteur.visit(this);
	}
}
