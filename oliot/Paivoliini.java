public class Paivoliini {

	// jäsenmuuttujia
	// näihin muuttujiin viitataan this.muuttujalla
	// ja nämä siis ovat olemassa jokaiselle oliolle erikseen
	private String name;
	private int year;
	private boolean graduated;
	
	// Konstuktori, tällä luodaan uusia olioita.
	public Paivoliini(String name1, int year) {
		// tämän olion nimeksi (this.name) asetetaan parametrina saatu nimi (name)
		this.name = name1;
		this.year = year;
		this.graduated = false;
	}
	
	// metodi...
	public String getName() {
		return this.name;
	}
	
	// metodi
	public int getAge() {
		return this.year;
	}
	

}