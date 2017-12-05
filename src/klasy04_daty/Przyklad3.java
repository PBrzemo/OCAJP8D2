package klasy04_daty;

import java.time.LocalDate;

public class Przyklad3 {

    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1999, 12, 5));
        Osoba ola = new Osoba("Ola", "Kowalska", LocalDate.parse("2004-04-12"));
        Osoba ela = new Osoba("Ela", "Elowska", "1980-05-23");
        
        System.out.println(ala);
        System.out.println(ola);
        System.out.println(ela);
        System.out.println();
        
        System.out.println(ala.getWiek());
        System.out.println(ola.getWiek());
        System.out.println(ela.getWiek());
        
        Sklep sklep = new Sklep();
        System.out.println("Ala idzie na zakupy...");
        sklep.zakupy(ala);

        System.out.println("Ola idzie na zakupy...");
        sklep.zakupy(ola);
        
    }
}



