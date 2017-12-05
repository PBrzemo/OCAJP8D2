package klasy;

import java.time.LocalDate;

public class Przyklad3 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalski", LocalDate.of(1999, 12, 4));
		Osoba ola = new Osoba("Ola", "Kowalski", LocalDate.parse("2004-04-12"));
		Osoba ela = new Osoba("Ela", "Kowalski", "1999-12-09" );
		
		System.out.println(ala);
		System.out.println(ola);
		System.out.println(ela);

	}

}