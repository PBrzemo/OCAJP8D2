package klasy03_tostring;

public class Przyklad2 {

	public static void main(String[] args) {
		Osoba Ala = new Osoba("Ala", "Kowalski");
		Osoba Ola = new Osoba("Ola", "Malinowska");
		
		Ala.przedstawSie();
		Ola.przedstawSie();
		System.out.println(Ola.ileMaszLiter());
	}
}