import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Anna luku!");
		System.out.print(">");
		int guess = read.nextInt();

		int computer = 10;

		if( guess < computer ) {
			System.out.println("Minä voitin!");
		} else {
			System.out.println("Hävisin :(");
		}

	}

}
