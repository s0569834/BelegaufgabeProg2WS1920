package reiseagentur;

import java.util.Arrays;

/**
 * 
 * @author Nguyen, Lac Thien, 569834
 *
 */


public class Reiseagentur {
	private String rName;
	private String ustIdnr;
	private Adresse rAdresse;
	private Kunde[] kunde;

	/**
	 *Konstruktor um Stammdaten der Reiseagentur festzulegen
	 *
	 */
	public Reiseagentur(String rName, String ustIdnr, Adresse rAdresse) {
		super();
		this.rName = rName;
		this.ustIdnr = ustIdnr;
		this.rAdresse = rAdresse;
		kunde = new Kunde [100];
	}
	
	/**
	 * Diese Methode fügt einen neuen Kunden in die Liste der Reiseagentur
	 * Wenn der return-Wert TRUE ist wird der erstellte Kunde in die Liste 
	 * hinzugefügt, wenn der return-Wert FALSE ist dann wird nichts hinzugefügt
	 */
	public boolean addKunde(Kunde kunden) {
		for(int i = 0; i <= kunde.length; i++) {
			if( kunde[i] == null) {
				kunde[i] = kunden;
				return true;
			}
		}
		return false;
	}


	/**
	 * Getter- und Setter-Methoden, um später auf die Daten zugreifen
	 * zu können
	 */
	public String getrName() {
		return rName;
	}


	public void setrName(String rName) {
		this.rName = rName;
	}


	public Adresse getrAdresse() {
		return rAdresse;
	}


	public void setrAdresse(Adresse rAdresse) {
		this.rAdresse = rAdresse;
	}


	public String getUstIdnr() {
		return ustIdnr;
	}


	public void setUstIdnr(String ustIdnr) {
		this.ustIdnr = ustIdnr;
	}


	/**
	 * toString-Methode gibt eine Stringg-Referenz zurück
	 */
	@Override
	public String toString() {
		return "Reiseagentur: " + rName + "\nUST-IDNR: " + ustIdnr + "\n" + rAdresse + "\n" + Arrays.toString(kunde) ;
	}
	
}
