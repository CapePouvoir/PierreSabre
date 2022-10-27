package humain;

public class Traitre extends Samoura�{
	private int traitrise=0;
	
	/**
     * Un traitre est un personnage bas� sur Samoura�
     * @param nom
     * @param boisson
     * @param argent
     * @param seigneur
     */
	public Traitre(String nom_humain, String boisson, int argent, String seigneur) {
		super(nom_humain, boisson, argent, seigneur);
	}
	
	/**
     * Le traitre peut extorquer des commercant
     * @param commercant_extorqu�
     */
	public void extorquer(Commercant c) {
		if (traitrise <3) {
			ajouterArgent(c.getArgent());
			c.seFaireExtorquer();
			traitrise++;
			parler("(J'ai extorqu� " + c.getNom()+ " )");
		}
		else {
			parler("Je ne peux plus l'extorquer, sinon il me d�nocera au seigneur");
		}
	}
	
	/**
     * Le traitre peut faire le gentil en donnant de l'argent � un humain
     * @param Humain
     * @param montant
     */
	public void faireLeGentil(Humain h, int montant) {
		if (getArgent() >= montant) {
			h.ajouterArgent(montant);
			this.perdreArgent(montant);
			traitrise= traitrise - montant/10;
			if (traitrise < 0) {
				traitrise = 0;
			}
			parler("Faisons ami-ami je t'offre "+ montant+" pi�ces, tu peux me faire confiance maintenant :)");
		}
		else{
			parler("Je ne peux pas donner cette somme");
		}
	}
	
	/**
	 * On red�finit son dire bonjour, pour qu'il affiche egalement son niveau de traitrise
	 */
	public void direBonjour(){
		super.direBonjour();
		parler("Traitrise: "+traitrise);
	}
}
