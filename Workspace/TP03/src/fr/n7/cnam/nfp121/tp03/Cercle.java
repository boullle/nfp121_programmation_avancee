package fr.n7.cnam.nfp121.tp03;

import java.awt.Color;


/**
 *  Cercle modélise un cercle géometrique dans un plan équipé d'un
 * repère cartésien.  Un cercle peut être  affiché et translaté.
 * @author billb
 *
 */
public class Cercle implements Mesurable2D{
	private Point centre;
	private double rayon;
	private double diametre;
	private Color couleur;
	private final double PI=Math.PI;
	
	/**
	 * Construire un cercle à  partir de son centre  et de son rayon.
	 * @param centre
	 * @param rayon
	 */
	public Cercle(Point centre, double rayon) {
		assert centre!=null;
		assert rayon>0;
		this.centre = centre;
		this.rayon = rayon;
		this.diametre=rayon*2;
		this.couleur = Color.blue;
	}
	
	/**
	 * Construire un point à partir de deux points diamètralement opposée
	 * @param dp1 premier point du diamètre
	 * @param dp2 deuxième point du diamètre
	 */
	public Cercle(Point dp1, Point dp2) {
		assert dp1!=null;
		assert dp2!=null;
		//assert dp1!=dp2;
		assert dp1.distance(dp2)!=0;
		this.centre=new Point((dp1.getX()+dp2.getX())/2,(dp1.getY()+dp2.getY())/2);
		this.rayon=dp1.distance(dp2)/2;
		this.diametre=dp1.distance(dp2);
		this.couleur=Color.blue;
		
	}
	
	public Cercle(Point dp1,Point dp2,Color couleur) {
		this(dp1,dp2);
		this.setCouleur(couleur);
		
	}

	public boolean contient(Point dp) {
		assert dp!=null;
		return (this.centre.distance(dp)<=this.rayon);
	}
	/**
	 * Translater le cercle
	 * @param dx déplacement suivant l'axe des X
	 * @param dy déplacement suivant l'axe de Y
	 */
	public void translater(double dx, double dy) {
		this.centre.translater(dx, dy);
		
	}
	/**
	 * @return the centre
	 */
	public Point getCentre() {
		return this.centre;
	}
	/**
	 * @param centre the centre to set
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return this.rayon;
	}
	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * @return the diametre
	 */
	public double getDiametre() {
		return this.diametre;
	}
	/**
	 * @param diametre the diametre to set
	 */
	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}
	
	/**
	 * @return the couleur
	 */
	public Color getCouleur() {
		return couleur;
	}
	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(Color couleur) {
		assert couleur!=null;
		this.couleur = couleur;
	}
//	/** Afficher le cercle */
//	public void afficher() {
//		System.out.print(this);
//	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return this.rayon*2*this.PI;
	}

	@Override
	public double aire() {
		// TODO Auto-generated method stub
		
		return (this.rayon*this.rayon)*this.PI;
	}
	
}

