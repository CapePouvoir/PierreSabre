package humain;

public class Humain {
	private String nom_humain;
	private String boisson;
	private int argent;
	
	/**
	 * L'humain est un personnage qui a un nom, une quantité d'argent, une boisson favorite 
	 * @param nom_humain
	 * @param argent
	 * @param boisson
	 */
	public Humain(String nom_humain , int argent, String boisson) {
		System.out.println("Création du personnage " + nom_humain + " qui aime le " + boisson + " qui possède " + argent + " sous");
		this.nom_humain=nom_humain;
		this.boisson=boisson;
		this.argent=argent;
		
	}
	
	/**
	 * La methode permet à l'humain de parler en annotant son nom
	 * @param texte
	 */
	public void parler( String texte ) {
		System.out.println("("+ this.nom_humain +") - " + texte);
	}
	
	/**
	 * L'humain fait sa présentation
	 */
	public void direBonjour() {
		parler("Bonjour je m'appelle " + nom_humain+ " et j'aime boire du " + boisson);
	}
	
	/**
	 * L'humain peut boire sa boisson favorite
	 */
	public void boire () {
		parler ("Ahhh, un bon verre de " + boisson +" ! GLOUPS!");
	}
	
	public String getNom() {
		return nom_humain;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}	
		
	public void ajouterArgent(int montant) {
		argent= argent + montant; 
	}
	
	public void perdreArgent(int montant) {
		if (getArgent() >= montant) {
			argent= argent - montant;
		}		
	}
	
}
