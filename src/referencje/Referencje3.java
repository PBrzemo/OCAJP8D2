package referencje;

public class Referencje3 {
    	//clasa string jest immutable - tzn. w istniejacym obiekcie nie da sie wprowadzic zmian
		// inne clasy immutable Integer, Double, it., LocalData, LocalDataTIme itd
    static void metoda(String arg) {
        arg += " ma kota";
        //arg = arg.concat("ma kota");
    	arg.concat("i psa");
    	
        System.out.println("metoda: " + arg);
    }

    public static void main(String[] args) {
        String a = "Ala";
        String b = a;
        
        metoda(a);
        
        b += " i chomika";
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}



