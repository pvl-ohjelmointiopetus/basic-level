import java.util.Scanner;

// Nimi Game tulee siitä, että on Game.java
public class Game {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Anna luku!");
		System.out.print(">");
		int guess = read.nextInt();

		int computer = 10;

		// TODO 1: Siirrä voitto / häviötekstit muuttujiin
		// Niitä on helpompi muokata silloin

		// TODO 2: Kerro voitto/häviötekstissä, että minkä luvun arvasit ja mitä lukua tietokone arvasi

		// TODO 3: Toteuta huijaustila: tietokone arvaa aina yhden luvun isomman luvun kuin käyttäjä

		if( guess < computer ) {
			System.out.println("Minä voitin!");
		} else {
			System.out.println("Hävisin :(");
		}

	}

}
