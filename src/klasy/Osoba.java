package klasy;

import java.time.LocalDate;

public class Osoba {
    // To są pola / atrybuty / zmienne instancyjne
    // field / attribute / instance variable
    // Uwaga: w Javie słowo własność (property) oznacza coś innego (zwiąane z getterami i setterami)
    String imie, nazwisko;    
    LocalDate dataUrodzenia;
    
    // Konstruktory
    // Można podać wiele konstruktorów pod warunkiem,
    // że mają różną liczbę lub typ parametrów
    Osoba() {
        
    }
    
    Osoba(String imi, String naz) {
        imi = imie;
        nazwisko = naz;
    }

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public Osoba(String imie, String nazwisko, String data) {
        // wywołanie innego konstruktora (przy okazji konwersja String na LocalDate)
        this(imie, nazwisko, LocalDate.parse(data));
    }

    // Metody
    void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    
    int ileMaszLiter() {
        return imie.length() + nazwisko.length();
    }
    
    public String toString() {
        return imie + " " + nazwisko + " ur." + dataUrodzenia;
    }
}



