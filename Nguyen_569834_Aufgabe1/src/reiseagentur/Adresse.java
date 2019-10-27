package reiseagentur;

/**
 * 
 * @author Nguyen, Lac Thien, 569834
 *
 */

public class Adresse {
	private String strasse;
	private String hausnummer;
	private int plz;
	private String ort;
	
	
	/**
	 *Konstruktor um Stammdaten für die Adresse festzulegen
	 *
	 */
	public Adresse(String strasse, String hausnummer, int plz, String ort) {
		super();
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	
	
	/**
	 * Getter- und Setter-Methoden, um später auf die Daten zugreifen
	 * zu können
	 */
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	
	/**
	 * toString-Methode gibt eine Stringg-Referenz zurück
	 */
	@Override
	public String toString() {
		return "Adresse: "+ strasse +" " + hausnummer +", "+ plz + " " + ort+ "\n";
	}
	
	
}
