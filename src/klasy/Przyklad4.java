package klasy;

import java.time.LocalDate;

public class Przyklad4 {

    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1);
        
        // z nadklasy dziedziczone są: * pola (od poziomu dostępu zależy czy je widać)
        // * metody
        st1.imie = "Jan";
        st1.nazwisko = "Kowalski";
        st1.dataUrodzenia = LocalDate.of(1995, 6, 7);
        System.out.println(st1.getWiek());
        System.out.println(st1);
        
        // Z nadklasy NIE SĄ dziedziczone konstruktory
        //NK Student st2 = new Student("Ala", "Kowalska", "2001-01-01");
        
        // Dodatkowo obiekt podklasy posiada pola i metody dodane w podklasie
        st1.rok = 3;
        st1.kierunek = "informatyka";
        System.out.println(st1);
        
        Student st2 = new Student("Ala", "Kowalska", "1991-02-03", 2, "biologia");
        System.out.println(st2);
        System.out.println(st2.kierunek);
        
    }

}



