// Tuodaan käyttöön Javan satunnaislukuominaisuus
import java.util.Random;

public class Bingo {

	// Vakio, joka kertoo arvottavan Bingo-ruudukon koon
	public static final int KOKO = 4;

	public static void main(String[] args) {

		// esitellään uusi muuttuja, joka sisältää Bingo-ruudukon sanat
		// Huomaa, tämä on nyt taulukko
		String[] sanat = new String[30];

		sanat[0] = "kääntää";
		sanat[1] = "ajaa";
		sanat[2] = "muuttuja";
		sanat[3] = "void";
		sanat[4] = "metodi";
		sanat[5] = "int";
		sanat[6] = "lohko";
		sanat[7] = "if-rakenne";
		sanat[8] = "else-lohko";
		sanat[9] = "while";
		sanat[10] = "for";
		sanat[11] = "lopetusehto";
		sanat[12] = "totuusarvo";
		sanat[13] = "bugi";
		sanat[14] = "kokonaisluku";
		sanat[15] = "double";
		sanat[16] = "liukuluku";
		sanat[17] = "kissa";
		sanat[18] = "toistorakenne";
		sanat[19] = "kommentointi";
		sanat[20] = "ehto";
		sanat[21] = "sijoitetaan";
		sanat[22] = "arvo";
		sanat[23] = "nimi";
		sanat[24] = "taulukko";
		sanat[25] = "vakio";
		sanat[26] = "toistetaan";
		sanat[27] = "palautetaan";
		sanat[28] = "palautusarvo";
		sanat[29] = "parametri"; 

		// uusi satunnaislukuja antava järjestelmä
		Random random = new Random();
		
		// arvotaan sanoja KOKO-nimiseen ruudukkoon
		// rivit
		for( int i = 0; i < KOKO; i = i + 1) {
			// sarakkeet
			for( int j = 0; j < KOKO; j = j + 1) {
				// otetaan satunnaisluku taulukon koosta
				int r = random.nextInt( sanat.length );
				System.out.print( sanat[r] );
				// tulostetaan tarvittava määrä tyhjiä välejä
				for(int k = 0; k < 17 - sanat[r].length(); k = k + 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
