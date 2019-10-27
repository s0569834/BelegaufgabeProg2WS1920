package reiseagentur;

import java.util.Arrays;

/**
 * 
 * @author Nguyen, Lac Thien, 569834
 *
 */

public class Kunde {
	private String kundennummer;
	private Anrede anrede;
	private String vorname;
	private String name;
	private String geburtsdatum;
	private String telefonnummer;
	private String email;
	private Adresse[] adresse;
	private Bezahlmethode[] bezahlM;

	public enum Anrede {
		Frau, Herr
	}

	
	/**
	 *Konstruktor um Stammdaten des Kunden festzulegen
	 *
	 */
	public Kunde(String kundennummer, Anrede anrede, String vorname, String name, String geburtsdatum,
			String telefonnummer, String email) {
		super();
		this.kundennummer = kundennummer;
		this.anrede = anrede;
		this.vorname = vorname;
		this.name = name;
		this.geburtsdatum = geburtsdatum;
		this.telefonnummer = telefonnummer;
		this.email = email;
		bezahlM = new Bezahlmethode[3];
		adresse = new Adresse[2];

	}

	/**
	 * Diese Methode fügt eine Adresse zum Kunden hinzu. Wenn der 
	 * return-Wert TRUE ist wird die Adresse zu den Stammdaten des 
	 * Kunden hinzugefügt, wenn der return-Wert FALSE ist, dann wird 
	 * nichts hinzugefügt
	 */
	public boolean addAdresse(Adresse adressen) {
		for (int i = 0; i <= adresse.length; i++) {
			if (adresse[i] == null) {
				adresse[i] = adressen;
				return true;
			}
		}
		return false;
	}

	/**
	 * Diese Methode fügt eine Bezahlmethode zum Kunden hinzu. Wenn 
	 * der return-Wert TRUE ist wird die Bezahlmethode zu den 
	 * Stammdaten des Kunden hinzugefügt, wenn der return-Wert FALSE 
	 * ist, dann wird nichts hinzugefügt
	 */
	public boolean addBezahlmethode(Bezahlmethode bezahlMe) {
		for (int i = 0; i <= bezahlM.length; i++) {
			if (bezahlM[i] == null) {
				bezahlM[i] = bezahlMe;
				return true;
			}
		}
		return false;
	}

	/**
	 * Getter- und Setter-Methoden, um später auf die Daten zugreifen
	 * zu können
	 */
	public String getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}

	public Anrede getAnrede() {
		return anrede;
	}

	public void setAnrede(Anrede anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Adresse[] getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse[] adresse) {
		this.adresse = adresse;
	}

	public Bezahlmethode[] getBezahlM() {
		return bezahlM;
	}

	public void setBezahlM(Bezahlmethode[] bezahlM) {
		this.bezahlM = bezahlM;
	}

	
	/**
	 * toString-Methode gibt eine Stringg-Referenz zurück
	 */
	@Override
	public String toString() {
		return "\n\nKundennummer: " + kundennummer + "\n" + anrede + " " + vorname + " " + name + "\nGeburtsdatum: "
				+ geburtsdatum + "\nTelefonnummer: " + telefonnummer + "\nE-Mail: " + email + "\n"
				+ Arrays.toString(adresse) + "\n" + Arrays.toString(bezahlM) + "\n";
	}

}
