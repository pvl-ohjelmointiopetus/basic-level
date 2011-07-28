public class Paivoliini {

	private String name;
	private int year;
	private boolean graduated;
	
	public Paivoliini(String name, int year) {
		this.name = name;
		this.year = year;
		this.graduated = false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.year;
	}
	

}