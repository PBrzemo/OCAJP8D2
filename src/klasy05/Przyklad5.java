package klasy05;

public class Przyklad5 {

    public static void main(String[] args) {
        Student ala = new Student("Ala", "Kowalska", "1994-02-03", 2, "biologia");
        Student ola = new Student("Ola", "Malinowska", "1991-02-03", 4, "informatyka");

        ala.dodajOcene(5.0);
        ala.dodajOcene(3.5);
        ala.dodajOcene(4.0);
        
        System.out.println(ala.oceny);
        System.out.println("średnia ocen ali : "+ala.getSredniaOcen() );
        System.out.println("średnia ocen ali : "+ola.getSredniaOcen() );

    }

    
}



