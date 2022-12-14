package fr.n7.cnam.nfp121.tp03;

import java.awt.Color;



public class CercleTest{
	// prÃ©cision pour les comparaisons rÃ©elle
	public final static double EPSILON = 0.001;

	// Les points du sujet
	private Point A, B, C, D, E;

	// Les cercles du sujet
	private Cercle C1, C2;

	@Before public void setUp() {
		// Construire les points
		A = new Point(1, 2);
		B = new Point(2, 1);
		C = new Point(4, 1);
		D = new Point(8, 1);
		E = new Point(8, 4);

		// Construire les cercles
		C1 = new Cercle(A, 2.5);
		C2 = new Cercle(new Point(6, 1), 2);
		C2.setCouleur(Color.yellow);
}