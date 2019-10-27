package reiseagentur;

/**
 * 
 * @author Nguyen, Lac Thien, 569834
 *
 */

public class Bezahlmethode {
	private Bezeichnung bezeichnung;
	private String beschreibung;
	
	public enum Bezeichnung{
		Kreditkarte, ECKarte, Paypal, Rechnung
	}
	
	/**
	 *Konstruktor um Stammdaten der Bezahlmethode festzulegen
	 *
	 */
	public Bezahlmethode(Bezeichnung bezeichnung, String beschreibung) {
		super();
		this.bezeichnung = bezeichnung;
		this.beschreibung = beschreibung;
	}

	/**
	 * Getter- und Setter-Methoden, um später auf die Daten zugreifen
	 * zu können
	 */
	public Bezeichnung getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(Bezeichnung bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	
	/**
	 * toString-Methode gibt eine Stringg-Referenz zurück
	 */
	@Override
	public String toString() {
		return "Bezahlmethode: " + bezeichnung + ", Beschreibung: " + beschreibung +"\n";
	}
	
	

}
