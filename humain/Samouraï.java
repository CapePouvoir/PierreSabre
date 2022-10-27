package humain;

public class Samoura� extends Ronin{
	
	private String seigneur;
	
	/**
     * Le Samoura� est un Ronin qui sert un seigneur
     * @param nom_humain
     * @param boisson
     * @param argent
     * @param seigneur
     */
	
	public Samoura�(String nom_humain, String boisson, int argent, String seigneur) {
		super(nom_humain, boisson, argent);
		this.seigneur=seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	
	/**
     * Le Samoura� dit bonjour et annoce son seigneur
     */
	@Override
	public void direBonjour(){
		super.direBonjour();
		parler(" Et je sers le seigneur " +seigneur+ " datebayo !!!");
	}
	
	/**
	 * Le samoura� peut boire toute les boisson 
	 * @param boisson
	 */
	public void boire(String boisson){
		parler ("Ahhh, un bon verre de " + boisson +" ! GLOUPS!");
	}
}