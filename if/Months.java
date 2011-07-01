import java.util.Scanner;

// Months <=> Months.java
public class Months {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("Anna kuukausi");
		System.out.print("> ");
		int month = 5;

		// TODO 1: Vakion sijaan lue kuukauden numero käyttäjältä

		// TODO 2: Tervehdykset merkkijonoiksi!

		if( month < 2 ) {
			System.out.println("On talvi");
		}
		
		// && means and: both conditions must be true
		if( month >= 4 && month < 6 ) {
			System.out.println("On kevät");
		}

		if( month >= 6 && month < 8 ) {
			System.out.println("On kesä");
		}

		if( month >= 8 && month < 11 ) {
			System.out.println("On syksy");
		}

		if( month > 11 ) {
			System.out.println("On talvi");
		}

	}

}
