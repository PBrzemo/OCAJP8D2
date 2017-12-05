package abstrakcyjne;

import java.time.LocalDate;

public abstract class Osoba implements Wypisywalny{
    private String imie, nazwisko;    
    private LocalDate dataUrodzenia;

    public Osoba() {
        
    }
    
    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public Osoba(String imie, String nazwisko, String data) {
        this(imie, nazwisko, LocalDate.parse(data));
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
    
    public abstract String rola();
    

}



