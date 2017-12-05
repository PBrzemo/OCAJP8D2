package klasy02_metody;

public class Osoba {
    // To są pola / atrybuty / zmienne instancyjne
    // field / attribute / instance variable
    // Uwaga: w Javie słowo własność (property) oznacza coś innego (zwiąane z getterami i setterami)
    String imie, nazwisko;
   
//   Konstruktor
    Osoba(){
    	
    }
    Osoba(String imi, String naz){
    	imie = imi;
    	nazwisko = naz;
    	//nazwisko = naz.toUpperCase();
    }
    
    
    // Metody
    void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    
    int ileMaszLiter() {
    	return imie.length() + nazwisko.length();
    }
}



