package humain;

public class Commercant extends Humain{
	/**
	 * Le commercant est un personnage basé sur humain
	 * @param nom_humain
	 * @param argent
	 */
	public Commercant(String nom_humain , int argent) {
		super(nom_humain,argent,"Thé");
	}
	
	/**
	 * Le commercant peut se faire extorquer
	 * @return
	 */
	int seFaireExtorquer() {
		perdreArgent(getArgent());	
		parler("J'ai tout perdu, le monde est si injuste");
		return getArgent();
	}
	
	/**
	 * Le commercant peut recevoir de l'argent
	 * @param argent
	 */
	void recevoir (int argent) {
		ajouterArgent(argent);
		parler("Je vous remercie généreux donateur");

	}
	
	
	 
}
