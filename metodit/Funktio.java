import java.util.Scanner;

public class Funktio {

	public static void main(String[] args) {

		// luodaan uusi muuttuja, joka mahdollistaa tekstin lukemisen

		Scanner input;
		input = new Scanner(System.in);

		System.out.println("Anna ala- ja ylärajat, niin kerron, onko funktiolla nollakohtaa välillä!");
		
		double lower;
		System.out.println("Alaraja");
		lower = input.nextDouble();

		double upper;
		System.out.println("Yläraja");
		upper = input.nextDouble();

		boolean nullpoint = hasNullpoint( lower, upper );

		if( nullpoint ) {
			System.out.println("Funktiolla on nollakohta välillä " + lower  +" ja "+ upper );
		}
	}

	private static double calculateValue(double x) {
		return 1.5 * x * x - 5;
	}

	private static double[] calculateValues(double start, double end, double stepSize) {

		// otetaan itseisarvo alarajan ja ylärajan erotuksesta
		int distance = (int)( Math.abs(end - start) );

		double[] values;
		values = new double[distance];

		// nyt laskettava arvo
		double currentValue = start;

		for( int i = 0; i < distance; i = i + 1 ) {
			currentValue = currentValue + 1;
			values[i] = calculateValue(currentValue);
		}
		return values;
	}

	private static boolean hasNullpoint(double x0, double x1) {
		// otetaan pisteet välillä x0 ja x1
		double[] values = calculateValues(x0, x1, 0.5);

		// tarkastetaan koko taulukko
		for(int i = 0; i < values.length - 1; i = i + 1 ) {
			if( values[i] > 0 ) {
				if( values[i+1] < 0 ) {
					return true;
				}
			} else {
				if( values[i+1] > 0 ) {
					return true;
				}
			}
		}
		return false;
	}
	
	// TODO 4 malliratkaisu
	private static double maxValue(double start, double end) {
		
		double[] arvoja;
		arvoja = calculateValues(start, end, 1.0);
		
		double max;
		max = arvoja[0];
		
		for(int i = 0; i < arvoja.length; i = i + 1) {
			
			// onko arvoja[i] isompi kuin max
			// JOS SE ON NIIN...
			// asetetaan max = arvoja[i]
			
			if( arvoja[i] > max ) {
				max = arvoja[i];
			}
			
		}
		
		return max;
	}

	// TODO 1: Uusi laskettava funktio on x^4 - 3 x^2 + 4. Muokkaa koodia siten, että sitä voi käyttää
	// TODO 2: Ilmoita myös, jos nollakohtaa ei löydy
	// TODO 3: Muokkaa calculateValues-metodia siten, että se ottaa huomioon tarkkuuden parametrissä stepsize
	// TODO 4: Toteuta metodi, joka saa parametreinään alku- ja loppupisteen ja etsii tämän perusteella funktion suurimman arvon kyseisellä välillä
}
