package klasy02_metody;

public class Przyklad1 {

	public static void main(String[] args) {
		Osoba Ala = new Osoba();
		System.out.println(Ala);
		
		
		Osoba drugaOsoba = new Osoba();
		System.out.println(drugaOsoba);
		
		
		Ala.imie= "ala";
		Ala.nazwisko ="kowalska";
		System.out.println(Ala.nazwisko +" "+ Ala.imie);
		System.out.println(Ala.imie);
		
		Ala.przedstawSie();
		drugaOsoba.przedstawSie();
		
	}

}