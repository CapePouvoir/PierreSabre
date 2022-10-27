package humain;

public class Ronin extends Humain {
	private int honneur = 1;
	/**
	 * Le Ronin est un personnage basé sur humain, il ne sert aucun seigneur
	 * @param nom_humain
	 * @param boisson
	 * @param argent
	 */
	public Ronin(String nom_humain, String boisson, int argent) {
		super(nom_humain, argent, boisson);
	}
	
	/**
	 * Le Ronin peut donner à un commercant
	 * @param c
	 * @param montant
	 */
	public void donner(Commercant c, int montant) {
		if (getArgent() >= montant) {
			c.ajouterArgent(montant);
			this.perdreArgent(montant);
		}
		else {
			parler("(Je n'ai pas cette somme je ne peux pas )");
		}
	}
	
	/**
	 * Le Ronin peut provoquer un Yakuza en duel, le samouraï peut perdre ou gagner le duel
	 * @param y
	 */
	public void provoquer(Yakuza y) {
		if(2*honneur > y.getReputation()) {
			this.honneur++;
			this.ajouterArgent(y.getArgent());
			y.perdre();
			parler("Je t'ai vaincu "+y.getNom()+" pour la peine je te prend ton argent");
		}
		else{
			this.honneur--;
			y.gagner();
			parler("Tu m'as vaincu "+y.getNom()+" Arrgh" );
		}
	}
}
