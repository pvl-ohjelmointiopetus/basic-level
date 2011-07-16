public class Laskenta {

	public static void main(String[] args) {

		// esitellään uusi muuttuja
		int kerrottava;
		// asetetaan muuttujaan arvo
		kerrottava = 5;

		// esitellään uusi muuttuja
		int tulo;
		// asetetaan muuttujaan uusi arvo
		tulo = 0;

		// Lasketaan 5*5 käyttäen toistorakennetta
		//   alkuarvo ; lopetusehto ; kasvatuslause, suoritetaan aina toistorakenteen lopussa
		for( int i = 0; i < 5; i = i + 1 ) {
			tulo = tulo + kerrottava;
		}

		System.out.println( tulo );

		// TOOO 1: Laske lukujen 1-1000 summa
		// TODO 2: Laske 3^3

	}

}
