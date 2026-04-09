package personnages;

public class Ronin extends Humain{
	public int reputation;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.reputation = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int temp = argent /10;
		argent = argent - temp;
		parler(beneficiaire.getNom() + " prend ces " + temp + " sous.");
		beneficiaire.recevoir(temp);
	}
}
