package klasy;

public class Przyklad2 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalski");
		Osoba ola = new Osoba("Ola", "Malinowska");
		
		ala.przedstawSie();
		ola.przedstawSie();
		System.out.println(ola.ileMaszLiter());
	}
}