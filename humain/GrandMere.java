package humain;


public class GrandMere extends Humain{
	
	private Humain[] memoire = new Humain[30];
    private int connaissance=0;
    
    /**
     * Une grand mere est un personnage basé sur l'humain
     * @param nom
     * @param argent
     */
	public GrandMere(String nom, int argent) {
        super(nom,argent,"tisane");
    }
	
	/**
     * humainHasard retourne en String le noms d'une des classes au hasard
     * @return
     */
	private String humainHasard() {
		int value = (int) (Math.random() * 3);
		switch( value ) {
            case 0:
                return "Commercant";
            case 1:
                return "Ronin";
            case 2:
                return "Samourai";
            case 3:
                return "Yakuza";
            default:
                return "erreur";
        }
    }
	
	/**
     * Une grand mere peut connaitre 30 personnages au max
     * @param humain
     */
	public void faireConnaissanceAvec(Humain humain) {
        if (connaissance <30) {
        	memoire[connaissance]=humain;
        }		
        connaissance++;
    }
	
	/**
     * Une grand mere peut ragoter (essayer de dire de qu'elle classe le personnage est)
     * Elle reconnait trés bien les Traitres
     */
	public void ragoter() {
        for(int i=0; i<connaissance; i++) {
        	if(connaissance>=30){
            	String message="Je crois ne pas me souvenir de cette personne, c'est un " + humainHasard()+ " c'est çà ?";
            	parler(message);
            }
            if(memoire[i] instanceof Traitre) {
                String message="Je sais que "+memoire[i].getNom()+" est un traitre";
                parler(message);
            }
            else {
            	String message="Je crois que "+memoire[i].getNom()+" est un " + humainHasard();
            	parler(message);
            }
        }
        	
    }
}
