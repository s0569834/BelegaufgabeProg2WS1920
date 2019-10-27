package reiseagentur;

import reiseagentur.Kunde.Anrede;
import reiseagentur.Bezahlmethode.Bezeichnung;

public class Start {

	public static void main(String[] args) {

		// Adressen
		Adresse raAdresse = new Adresse("Hauptstrasse", "5a", 10559, "Berlin");
		Adresse muellerAdresse = new Adresse("Alexanderplatz", "99", 10681, "Berlin");
		Adresse musterAdresse1 = new Adresse("Kurfuerstendamm", "13", 12993, "Berlin");
		Adresse musterAdresse2 = new Adresse("Friedrichstraße", "2", 12993, "Berlin");
		Adresse meierAdresse = new Adresse("Treskowallee", "7c", 17743, "Berlin");
		
		//Bezahlmethode
		Bezahlmethode muellerBezahlt = new Bezahlmethode(Bezeichnung.Paypal , "Konto: muelleranna@gmx.de");
		Bezahlmethode musterBezahlt1 = new Bezahlmethode(Bezeichnung.Paypal , "m.muster85@gmx.de");
		Bezahlmethode musterBezahlt2 = new Bezahlmethode(Bezeichnung.ECKarte , "IBAN: DE12 5364 9374 8373 66");
		Bezahlmethode meierBezahlt1 = new Bezahlmethode(Bezeichnung.ECKarte , "IBAN: DE12 0564 7354 8993 23");
		Bezahlmethode meierBezahlt2 = new Bezahlmethode(Bezeichnung.Rechnung , "Adresse: Treskowallee 7c, 17743 Berlin");
		
		
		
		//Reiseagentur
		Reiseagentur reiseagentur = new Reiseagentur("Magic Holidays Reiseagentur", "DE812524001", raAdresse);

		// Kunden
		Kunde annaMueller = new Kunde("00001", Anrede.Frau, "Anna", "Mueller", "01.07.1992", "+49176765777",
				"muelleranna@gmx.de");
		Kunde maxMuster = new Kunde("00002", Anrede.Herr, "Max", "Muster", "15.09.1985", "+4915273648",
				"m.muster85@gmx.de");
		Kunde jennyMeier = new Kunde("00003", Anrede.Frau, "Jenny", "Meier", "25.12.1997", "+4917854567",
				"jenmaier@gmail.de");
		

		// addKunde
		boolean addMueller = reiseagentur.addKunde(annaMueller);
		boolean addMuster = reiseagentur.addKunde(maxMuster);
		boolean addMeier = reiseagentur.addKunde(jennyMeier);
		
		//addAdresse
		boolean adresseMueller = annaMueller.addAdresse(muellerAdresse);
		boolean adresseMuster = maxMuster.addAdresse(musterAdresse1);
		boolean adresseMuster2 = maxMuster.addAdresse(musterAdresse2);
		boolean adresseMeier = jennyMeier.addAdresse(meierAdresse);
		
		//addBezahlmethode
		boolean bezahlMueller = annaMueller.addBezahlmethode(muellerBezahlt);
		boolean bezahlMuster = maxMuster.addBezahlmethode(musterBezahlt1);
		boolean bezahlMuster2 = maxMuster.addBezahlmethode(musterBezahlt2);
		boolean bezahlMeier = jennyMeier.addBezahlmethode(meierBezahlt1);
		boolean bezahlMeier2 = jennyMeier.addBezahlmethode(meierBezahlt2);

		System.out.println(reiseagentur);

	}

}
