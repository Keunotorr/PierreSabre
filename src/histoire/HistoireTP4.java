package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String []args ) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		// Exercice 2.1
		System.out.println("");
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtroquer();
		marco.recevoir(15);
		marco.boire();

		// Exercice 2.2
		System.out.println("");
		
		Yakusa yaku = new Yakusa("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.extroquer(marco);
		
        // Exercice 2.3
		System.out.println("");
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.donner(marco);
	}
}
