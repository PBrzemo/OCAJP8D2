package abstrakcyjne;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Pracownik extends Osoba {
    private String stanowisko;
    private BigDecimal pensja;
    
    public Pracownik() {
        
    }
    
    public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia, String stanowisko, BigDecimal pensja) {
        super(imie, nazwisko, dataUrodzenia);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Pracownik(String imie, String nazwisko, String data, String stanowisko, int pensja) {
        super(imie, nazwisko, data);
        this.stanowisko = stanowisko;
        this.pensja = new BigDecimal(pensja);
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public BigDecimal getPensja() {
        return pensja;
    }
    
    public void podwyzka(BigDecimal kwota) {
        pensja = pensja.add(kwota);
    }
    
    public String toString() {
        return "Pracownik " + getImie() + " " + getNazwisko() + " (" + getStanowisko() + ")";
    }

    @Override
    public String rola() {
        return "pracownik";
    }
    

    @Override
    public List<String> pola() {
        return Arrays.asList(rola(), getImie(), getNazwisko(),
                String.valueOf(getDataUrodzenia()),
                getStanowisko(), String.valueOf(getPensja()));
    }
}



