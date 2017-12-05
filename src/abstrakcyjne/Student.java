package abstrakcyjne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Osoba {
    private int rok;
    private String kierunek;
    private final List<Double> oceny = new ArrayList<>();
    
    public Student(String imie, String nazwisko, LocalDate dataUrodzenia, int rok, String kierunek) {
        super(imie, nazwisko, dataUrodzenia);
        this.rok = rok;
        this.kierunek = kierunek;
    }

    public Student(String imie, String nazwisko, String data, int rok, String kierunek) {
        super(imie, nazwisko, data);
        this.rok = rok;
        this.kierunek = kierunek;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public List<Double> getOceny() {
        return oceny;
    }
    
    public String toString() {
        return "Student " + getImie() + " " + getNazwisko() + " kier. " + getKierunek();
    }

    @Override
    public String rola() {
        return "student";
    }

    @Override
    public List<String> pola() {
        return Arrays.asList(rola(), getImie(), getNazwisko(), 
        		String.valueOf(getDataUrodzenia()), String.valueOf(getRok()), getKierunek());
    }
}



