package personnages;

public class Humain {
	private String nom;
	private String boisson;
	public int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
		}
	
	public String getBoisson() {
		return boisson;
		}
	
	public int getArgent() {
		return argent;
		}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Hmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	private void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	private void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
		else {
			parler("J'ai " + argent + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}	
	}
	
}
