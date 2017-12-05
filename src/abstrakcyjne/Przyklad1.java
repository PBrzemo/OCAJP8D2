package abstrakcyjne;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Przyklad1 {

    public static void main(String[] args) {
        // Nie można tworzyć instancji klas abstrakcyjnych
        // Nie można pisać new KlasaAbstrakcyjna()
        //NK Osoba osoba = new Osoba("Ala", "Kowalska", LocalDate.now());
        
        Osoba a = new Student("Adam", "Abacki", "1996-07-08", 2, "łopatologia");
        System.out.println(a.getNazwisko());

        Osoba[] osoby = {
            new Student("Adam", "Abacki", "1999-09-09", 2, "łopatologia"),
            new Pracownik("Jan", "Kowalski", "1981-02-03", "szatniarz", 5500)
        };

        for (Osoba osoba : osoby) {
            System.out.println(osoba);
            System.out.println(osoba.rola());
        }
    }

}
