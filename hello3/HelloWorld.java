import java.util.Scanner;

public class HelloWorld {

	public static void main(String args[]) {
		// luodaan uusi lukija, joka lukee sen, mitä käyttäjä kirjoittaa
		Scanner in = new Scanner(System.in);

		// luetaan käyttäjän nimi ja laitetaan se talteen
		System.out.println("Anna nimesi");
		System.out.print("> ");
		String name = in.nextLine();

		int thisYear = 2011;

		// luetaan käyttäjän syntymäaika ja laitetaan se talteen
		System.out.println("Anna syntymävuotesi");
		System.out.print("> ");
		int birthYear = in.nextInt();

		System.out.println("Hei, nimeni on " + name + " ja olen " + ( thisYear - birthYear ) + " vuotta vanha" );
	}

}
