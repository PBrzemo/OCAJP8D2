package klasy;

import java.time.LocalDate;

public class Student extends Osoba {
	int rok;
	String kierunek;
	public Student() {
		super();
		
	}
	public Student(String imie, String nazwisko, String data, int rok, String kierunek) {
		super(imie, nazwisko, data);
		this.rok = rok;
		this.kierunek = kierunek;
	}
	public Student(String imie, String nazwisko, LocalDate dataUrodzenia, int rok, String kierunek) {
		super(imie, nazwisko, dataUrodzenia);
		this.rok = rok;
		this.kierunek = kierunek;
	}
	
	
}
