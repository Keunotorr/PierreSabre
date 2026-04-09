package personnages;

public class Yakusa extends Humain{
	public int reputation;
	private String clan;
	
	public Yakusa(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.reputation = 0;
		this.clan  = clan;
	}
	
	public void extroquer(Commercant victime) {
		reputation = reputation + 1;
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int temp = victime.seFaireExtroquer();
		argent = argent + temp;
		parler("J'ai piqué les " + temp + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hihi !");
	}
	
	
}
