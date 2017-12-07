package klasy05;

public class Polimorfizm {

    public static void main(String[] args) {
        // Obiekt klasy Osoba na zmiennej typu Osoba
        Osoba osoba = new Osoba("Ala", "Kowalska", "1995-06-07");
        
        // Obiekt klasy Student na zmiennej typu Student
        Student student = new Student("Adam", "Abacki", "1996-07-08", 2, "geografia");
        
        // Obiekt klasy Student na zmiennej typu Osoba
        Osoba so = new Student("Jan", "Kowalski", "1996-07-08", 4, "historia");
        
        //NK Student niedasie = new Osoba();
        
        // Wszędzie mamy dostęp do pól / metod z klasy Osoba
        System.out.println(osoba.imie + " " + osoba.getWiek() + " lat");
        System.out.println(student.imie + " " + student.getWiek() + " lat");
        System.out.println(so.imie + " " + so.getWiek() + " lat");
        System.out.println();
        
        // Dostęp do pól i zmiennych zdefiniowanych w klasie Student - tylko na zmiennej typu Student
        //NK System.out.println(osoba.kierunek + " , średnia " + osoba.getSredniaOcen());
        System.out.println(student.kierunek + " , średnia " + student.getSredniaOcen());
        //NK System.out.println(so.kierunek + " , średnia " + so.getSredniaOcen());
        System.out.println();
        
        // Każdą Osobę, również Studenta, mogę wysłać na zakupy:
        Sklep sklep = new Sklep();
        sklep.zakupy(osoba);
        sklep.zakupy(student); // studenta mogę potraktować jako osobę; wszędzie tam, gdzie oczekiwana jest Osoba, może pojawić się Student
        sklep.zakupy(so);

        // Wypisanie za pomocą toString()
        // Obiekt "sam się wypisuje" i Student, nawet na zmiennej typu Osoba, wypisze swój kierunek i rok
        System.out.println(osoba);
        System.out.println(student);
        System.out.println(so);
        System.out.println();
                
        // Nadpisywanie metod (overriding) - obiekt wykona taką wersję metody, która jest zdefiniowana w jego klasie
        // Decyduje klasa obiektu w pamięci, a nie typ zmiennej
        System.out.println(osoba.kimJestes());
        System.out.println(student.kimJestes());
        System.out.println(so.kimJestes());
        
        so = osoba;
        System.out.println(so.kimJestes());
    }

}



