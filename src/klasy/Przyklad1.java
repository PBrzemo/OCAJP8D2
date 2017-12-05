package klasy;

public class Przyklad1 {

	public static void main(String[] args) {
		Osoba ala = new Osoba();
		System.out.println(ala);
		
		
		Osoba drugaOsoba = new Osoba();
		System.out.println(drugaOsoba);
		
		
		ala.imie= "ala";
		ala.nazwisko ="kowalska";
		System.out.println(ala.nazwisko +" "+ ala.imie);
		System.out.println(ala.imie);
		
		ala.przedstawSie();
		drugaOsoba.przedstawSie();
		
	}

}