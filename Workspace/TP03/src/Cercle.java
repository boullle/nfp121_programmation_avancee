import static org.junit.Assert.assertNotNull;

import java.awt.Color;

import javax.swing.text.Segment;

/**
 * 
 */

/** Cercle modèlise un cercle géométrique dans un plan équipé d'un
 * repère cartésien.  Un Cercle peut être affiché et translaté.
 * Sa distance par rapport Ã  un autre point peut être obtenue.
 *On peut savoir si un point est situé à l'intérieur ou sur ce cercle
 * @author billb
 *
 */
public class Cercle implements Element, Mesurable2D {
	private Point centre;
	private double rayon;
	//private double diametre;
	private Color couleur;	// couleur du cercle
	public final static double PI = Math.PI;

	/**
	 * Construire un cercle à partir de son centre et de son rayon
	 * @param va centre
	 * @param vr rayon
	 */
	public Cercle(Point va, double vr) {
		
		assert vr > 0;
		assert va != null;
				this.centre = va;
				this.rayon = vr;			
	}
	
	/**
	 * Construire un cercle à partir de deux points diamètralement opposés
	 * @param va
	 * @param vb
	 */
	public Cercle(Point va, Point vb) {
		assert va != null;
		assert vb != null;
		this.centre = new Point((vb.getX()+va.getX()/2),((vb.getY()+va.getY())/2));
		this.rayon = va.distance(vb)/2;
		
		
	}
	
	/**
	 * Construire un cercle à partir de deux points diamètralement opposés et de sa couleur
	 * @param va
	 * @param vb
	 * @param c
	 */
	public Cercle(Point va, Point vb, Color vc) {
		assert va != null;
		assert vb != null;
		assert vc != null;
		
		this.couleur = vc;		
		this.centre = new Point((vb.getX()+va.getX()/2),((vb.getY()+va.getY())/2));
		this.rayon = va.distance(vb)/2;
		
	}
	
	
	/**
	 * Créer un cercle à partir de son centre et d'un point du cercle
	 * @param vcentre
	 * @param vpointDuCercle
	 * @return
	 */
	public static Cercle creerCercle(Point vcentre, Point vpointDuCercle) {
		assert vcentre != null;
		assert vpointDuCercle != null;
		Cercle c;
		c = new Cercle(vcentre, vcentre.distance(vpointDuCercle));		
		return c;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double aire() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void translater(double dx, double dy) {
		assert dx > 0;
		assert dy > 0;
		this.centre.setX((this.centre.getX()+dx));
		this.centre.setY((this.centre.getY()+dy));
		
	}

	@Override
	public Color getCouleur() {
		// TODO Auto-generated method stub
		return this.couleur;
	}

	@Override
	public void setCouleur(Color nouvelleCouleur) {
		assert nouvelleCouleur != null;
		this.couleur = nouvelleCouleur;
		
	}

	public Point getCentre() {
		return this.centre;
	}

	public double getRayon() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDiametre() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean contient(Point a) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setRayon(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setDiametre(int i) {
		// TODO Auto-generated method stub
		
	}

}
