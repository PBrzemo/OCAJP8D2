package referencje;

public class Referencje {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala","Kowalska","1981-01-01");	
		Osoba ola = new Osoba("Ola","Kowalska","1981-01-01");
		
		Konto a = /*null;*/ new Konto(1, 1000, ala);
		Konto b = new Konto(1, 2000, ola);
		Konto c = b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("----");
		
		b.wplata(300);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("----");
	
		b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("----");
		
		c = a;
		//gc GARBAGE COLLECTOR
		// w tym momencie tracę dowiązanie do konta nr 2 i gc ma prawo go usunąć
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("----");
	}

}
