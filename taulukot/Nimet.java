public class Nimet {

	public static void main(String[] args) {

		// tallenna henkilöiden etu- ja sukunimet taulukkoon
		String[] firstNames;
		firstNames = new String[3];

		String[] lastNames;
		lastNames = new String[3];

		// yhteensä nyt on 3 etunimi ja sukunimiparia
		// huomaa, että laskenta alkaa nollasta ja jatkuu neljään
		firstNames[0] = "Matti";
		lastNames[0] = "Nelimarkka";

		firstNames[1] = "Nyyti";
		lastNames[1] = "Kinnunen";

		// TODO1: lisää oma etu- ja sukunimesi tähän taulukkoon
		// TODO2: korvaa seuraavat rivit toistorakenteella

		System.out.println( firstNames[0] + " " + lastNames[0] );
		System.out.println( firstNames[1] + " " + lastNames[1] );
		System.out.println( firstNames[2] + " " + lastNames[2] );

		// TODO3: luo uusi taulukko, johon tallennat henkilöiden iät

	}

}
