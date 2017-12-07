package wyjatki;

public class Przyklad1 {

    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", "1981-01-01");
        Konto konto = new Konto(1, 1000, ala);
        
        System.out.println(konto);
        
        // wplata można wywoływać bez obsługi wyjątków,
        // bo IllegalArgumentException jest unchecked
        konto.wplata(500);
        System.out.println("Udało się wplacic 500");
        System.out.println(konto);
        
        try {
            konto.wplata(100);
            System.out.println("Udało się wplacic 100");
        } catch(Exception e) {
            System.out.println("Nie udało się wplacic 100, " + e);            
        }
        System.out.println(konto);

        try {
            konto.wplata(-200);
            System.out.println("Udało się wplacic -200");
        } catch(Exception e) {
            System.out.println("Nie udało się wplacic -200, " + e);            
        }
        System.out.println(konto);

        
        // wyplata wymaga obsługi wyjątku, bo BrakSrodkow jest checked
        try {
            konto.wyplata(300);
            System.out.println("Udało się wypłacić 300");
        } catch (Braksrodkow e) {
            System.out.println("NIE udało się 300, " + e);
        }
        System.out.println(konto);

        try {
            konto.wyplata(1400);
            System.out.println("Udało się wypłacić 1400");
        } catch (Braksrodkow e) {
            System.out.println("NIE udało się 1400, " + e);
        }
        System.out.println(konto);

    }
}



