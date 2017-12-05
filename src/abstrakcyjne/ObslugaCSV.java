package abstrakcyjne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.stream.Collectors;

public class ObslugaCSV {
    
    public static void zapisz1(Collection<Osoba> osoby, File plik) {        
        try(PrintWriter out = new PrintWriter(plik)) {
            for(Osoba osoba : osoby) {
                for(String pole : osoba.pola()) {
                    out.print(pole);  // pola rozdzielam średnikami w jednej linii
                    out.print(";");
                }
                out.println(); // koniec linii w pliku
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void zapisz(Collection<Osoba> osoby, File plik) {        
        try(PrintWriter out = new PrintWriter(plik)) {
            for(Osoba osoba : osoby) {
                String wiersz = osoba.pola().stream()
                        .collect(Collectors.joining(";"));
                out.println(wiersz);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



