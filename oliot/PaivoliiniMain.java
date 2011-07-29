public class PaivoliiniMain {
	
	// Pääohjelma, eli tämä ajetaan
	public static void main(String[] args) {
		
		// luodaan uusia oliota
		Paivoliini matti = new Paivoliini("Matti", 1988);
		Paivoliini nyyti = new Paivoliini("Nyyti", 1993);
		
		// käytettän olioiden tarjoamia palveluita, eli metodeita.
		System.out.println( matti.getName() + " " + matti.getAge() );
		System.out.println( nyyti.getName() + " " + nyyti.getAge() );
		
		// TODO 1: Luo uusi olio itsellesi
		// TODO 2: Korjaa getAge() - metodin palautus, siten että se palauttaa henkilön iän
		// TODO 3: Siirrä luomasi oliot taulukkoon ja käytä toistorakennetta niiden tulostamiseen
		// TODO 4: Muuta Paivoliinin konstruktoria siten, että se ottaa myös parametrina valmistumista kuvaavan suureen
		//         Muokkaa myös tätä luokkaa.
		// TODO 5: Luo uusi metodi getGraduated() joka palauttaa truen jos henkilö on valmistunut ja falsen jos hän ei ole.
		//         Lisää tämä metodi myös tulosteeseen.
	}

}