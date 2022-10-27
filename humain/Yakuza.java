package humain;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;
	
	/**
	 * Le Yakuza est un humain criminel
	 * @param nom_humain
	 * @param boisson
	 * @param argent
	 * @param clan
	 */
	public Yakuza(String nom_humain, String boisson, int argent, String clan) {
		super(nom_humain, argent, boisson);
		this.clan=clan;
	}
	
	/**
	 * Le yakuza se présente et annonce son clan, il en est fier
	 */
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler(" Et je fais parti du clan " +clan+ " datebayo !!!");
	}
	
	/**
	 * Le yakuza peut extorquer à un commercant, il lui prend tout son argent
	 * @param c
	 */
	public void extorquer(Commercant c) {
		ajouterArgent(c.getArgent());
		c.seFaireExtorquer();
		reputation++;
		parler("J'ai extorqué " + c.getNom());
	}
	
	/**
	 * Le yakuza peut gagner son duel contre un Ronin
	 */
	void gagner() {
		reputation++;
		parler("Je t'ai vaincu Ronin, j'espère que tu retiendra la leçon, il ne faut pas venir chercher le clan " + clan+ " !");	
	}
	
	/**
	 * Le Yakuza peut perdre son duel contre le Ronin
	 */
	void perdre() {
		reputation--;
		perdreArgent(getArgent());
		parler("Tu m'as vaincu cette fois Ronin, mais le clan" + clan + " n'a pas dit son dernier mot !");
	}
	
	/**
	 * Cette méthode permet de connatitre la réputation d'un Yakuza	
	 * @return
	 */
	public int getReputation() {
		return reputation;
	}

}
