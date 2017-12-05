package abstrakcyjne;

import java.io.File;
import java.util.ArrayList;

public class TestZapisu {

    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();
        
        osoby.add(new Pracownik("Adam", "Nowak", "1969-03-03", "profesor", 3300));
        osoby.add(new Pracownik("Anna", "Trudnonazwiskowa", "1969-03-03", "kierowca", 5300));
        osoby.add(new Pracownik("Jan", "Kowalski", "1969-03-03", "sprzedawca", 3300));
        
        osoby.add(new Student("Ala", "Kowalska", "2001-01-01", 1, "prawo"));
        osoby.add(new Student("Iza", "Izowska", "2001-01-01", 3, "lewo"));
        osoby.add(new Student("Zenon", "Ząbkowski", "2001-01-01", 3, "stomatologia"));

        ObslugaCSV.zapisz(osoby, new File("osoby.csv"));
        System.out.println("Gotowe");
    }

}



