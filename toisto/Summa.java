import java.util.Scanner;

public class Summa {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// esitellään uusi muuttuja
		int number;
		// asetetaan ensimmäiseksi arvoksi 0
		number = 0;

		// esitellään uusi muuttuja summa ja alustetaan se
		double sum;
		sum = 0;

		System.out.println("Syötä numeroita, niin lasken niiden summan. Negatiivinen luku lopettaa.");

		// toistenaan niin kauan kun number ei ole negatiivinen
		while( number >= 0 ) {

			sum = sum + number;

			number = input.nextInt();

		}

		System.out.println("Annettujen lukujen summa oli " + sum);

		// TODO 1: Muuta ohjelmaa niin, että se osaa laskea myös keskiarvon!
		// TODO 2: Muuta ohjelmaa niin, että se laskee negatiivisia lukuja

	}

}
