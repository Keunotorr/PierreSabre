package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtroquer() {
		int temp = argent;
		argent = 0;
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return temp;
	}
	
	// La solution est de rendre l'attribut argent public. 
	//Pareil pour la méthode parler().

	public void recevoir(int argent) {
		this.argent = argent;
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}
	
	
}
