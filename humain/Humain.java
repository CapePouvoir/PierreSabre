package humain;

public class Humain {
	private String nom_humain;
	private String boisson;
	private int argent;
	
	/**
	 * L'humain est un personnage qui a un nom, une quantit� d'argent, une boisson favorite 
	 * @param nom_humain
	 * @param argent
	 * @param boisson
	 */
	public Humain(String nom_humain , int argent, String boisson) {
		System.out.println("Cr�ation du personnage " + nom_humain + " qui aime le " + boisson + " qui poss�de " + argent + " sous");
		this.nom_humain=nom_humain;
		this.boisson=boisson;
		this.argent=argent;
		
	}
	
	/**
	 * La methode permet � l'humain de parler en annotant son nom
	 * @param texte
	 */
	public void parler( String texte ) {
		System.out.println("("+ this.nom_humain +") - " + texte);
	}
	
	/**
	 * L'humain fait sa pr�sentation
	 */
	public void direBonjour() {
		parler("Bonjour je m'appelle " + nom_humain+ " et j'aime boire du " + boisson);
	}
	
	/**
	 * L'humain peut boire sa boisson favorite
	 */
	public void boire () {
		parler ("Mmmh, un bon verre de " + boisson +" ! GLOUPS!");
	}
	
	/**
	 * L'humain ach�te un bien � un prix
	 */
	public void acheter( String bien, int prix) {
		if (getArgent() > prix) {
			parler ("J'ai " + argent +" sous en poche. Je vais pouvoir m'offrir un " + bien +" � " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler ("Je n'ai plus que " + argent +" sous en poche. Je ne peux m�me pas m'offrir un " + bien +" � " + prix + " sous.");
		}
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
	
	
	
	public void ajouterArgent(int gain) {
		argent= argent + gain; 
	}
	
	public void perdreArgent(int perte) {
		if (getArgent() >= perte) {
			argent= argent - perte;
		}		
	}
	
}
