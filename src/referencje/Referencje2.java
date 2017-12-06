package referencje;

public class Referencje2 {
    static void metoda(Konto aa, Konto bb, Konto cc, int xx) {
        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);
        System.out.println("cc: " + cc);
        System.out.println("xx: " + xx);
        System.out.println();
        aa = new Konto(aa.numer, aa.saldo, aa.wlasciciel);
        aa.saldo += 11;
        aa.wlasciciel.imie = "Alicja";
        bb.wplata(11);
        xx += 55;
        
        System.out.println("Na koniec metody:");
        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);
        System.out.println("cc: " + cc);
        System.out.println("xx: " + xx);
        System.out.println();
}

    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", "1981-01-01");
        Osoba ola = new Osoba("Ola", "Malinowska", "1989-09-09");

        Konto a = new Konto(1, 1000, ala);
        Konto b = new Konto(2, 2000, ola);
        Konto c = b;
        int x = 5000;
        
        System.out.println(" a: " + a);
        System.out.println(" b: " + b);
        System.out.println(" c: " + c);
        System.out.println(" x: " + x);
        System.out.println();
        
        metoda(a,b,c,x);
        
        System.out.println("Na koniec main-a:");
        System.out.println(" a: " + a);
        System.out.println(" b: " + b);
        System.out.println(" c: " + c);
        System.out.println(" x: " + x);
    }

}



