package humain;

public class Samouraï extends Ronin{
	
	private String seigneur;
	
	/**
     * Le Samouraï est un Ronin qui sert un seigneur
     * @param nom_humain
     * @param boisson
     * @param argent
     * @param seigneur
     */
	
	public Samouraï(String nom_humain, String boisson, int argent, String seigneur) {
		super(nom_humain, boisson, argent);
		this.seigneur=seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	
	/**
     * Le Samouraï dit bonjour et annoce son seigneur
     */
	@Override
	public void direBonjour(){
		super.direBonjour();
		parler(" Et je sers le seigneur " +seigneur+ " datebayo !!!");
	}
	
	/**
	 * Le samouraï peut boire toute les boisson 
	 * @param boisson
	 */
	public void boire(String boisson){
		parler ("Ahhh, un bon verre de " + boisson +" ! GLOUPS!");
	}
}