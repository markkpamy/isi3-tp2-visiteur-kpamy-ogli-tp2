public class TestArbreBinaire {

	public static void main(String[] args) {
		//faire 1+2*3+-4=3
		Addition racine = new Addition(new Addition(new Constante(1),
					new Multiplication(new Constante(2),new Constante(3))),
					new Negation(new Constante(4)));
		Addition racine1 = new Addition(new Multiplication(new Addition(new Constante(1),new Constante(2))
					,new Constante(3)),
					new Negation(new Constante(4)));
		testRacine(racine);
		testRacine(racine1);
		
		

	}

	private static void testRacine(Addition racine) {
		ExpressionArithmetique exp = new ExpressionArithmetique(racine);

		exp.afficherInFixe();
		exp.afficherPreFixe();
		System.out.println("\n calcul valeur: " + exp.calculerValeur());
		System.out.println("\n calcul hauteur: " + exp.calculerHauteur());
		exp.afficherPostFixe();
	}


}
