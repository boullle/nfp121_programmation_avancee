import java.awt.Color;

public interface Element {

	/** Afficher le point. */
	void afficher();

	/** Translater le point.
	* @param dx dÃ©placement suivant l'axe des X
	* @param dy dÃ©placement suivant l'axe des Y
	*/
	void translater(double dx, double dy);

	/** Obtenir la couleur du point.
	 * @return la couleur du point
	 */
	Color getCouleur();

	/** Changer la couleur du point.
	  * @param nouvelleCouleur nouvelle couleur
	  */
	void setCouleur(Color nouvelleCouleur);

}