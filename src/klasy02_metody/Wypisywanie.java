package klasy02_metody;

public class Wypisywanie {

    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska");
        System.out.println(ala);
        
        String s;
        s = ala.toString();
        System.out.println(s);
        
        s = "obiekt: " + ala;
        System.out.println(s);

        // String.valueOf - uniwersalny sposób zamiany dowolnej wartości (także null, także int-ów itp.) na napis
        s = String.valueOf(ala);
        System.out.println(s);
        
        Object obj = ala;
        s = obj.toString();
        System.out.println(s);
    }

}



