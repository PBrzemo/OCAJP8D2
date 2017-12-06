package referencje;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    String imie, nazwisko;    
    LocalDate dataUrodzenia;
    
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
        this(imie, nazwisko, LocalDate.parse(data));
    }

    void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + getWiek() + " lat.");
    }
    
    public String toString() {
        return imie + " " + nazwisko + " ur." + dataUrodzenia;
    }
    
    public int getWiek() {
        if(dataUrodzenia == null) {
            return 0;
        }
        Period okres = Period.between(dataUrodzenia, LocalDate.now());
        return okres.getYears();
    }    
}



