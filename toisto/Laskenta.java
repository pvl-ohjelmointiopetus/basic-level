public class Laskenta {

	public static void main(String[] args) {

		int kerrottava;
		kerrottava = 5;

		int tulo;
		tulo = 0;

		// Lasketaan 5*5 käyttäen toistorakennetta

		for( int i = 0; i < 5; i = i + 1 ) {
			tulo = tulo + kerrottava;
		}

		System.out.println( tulo );

		// TOOO 1: Laske lukujen 1-1000 summa
		// TODO 2: Laske 3^3

	}

}
