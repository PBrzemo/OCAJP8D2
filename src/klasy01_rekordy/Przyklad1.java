package klasy01_rekordy;

public class Przyklad1 {

	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		System.out.println(osoba);
		
		
		Osoba drugaOsoba = new Osoba();
		System.out.println(drugaOsoba);
		
		
		osoba.imie= "ala";
		osoba.nazwisko ="kowalska";
		System.out.println(osoba.nazwisko +" "+ osoba.imie);
		System.out.println(osoba.imie);
		
	}

}