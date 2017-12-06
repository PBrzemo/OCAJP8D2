package referencje;

public class Referencje {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala","Kowalska","1981-01-01");	
		Osoba ola = new Osoba("ola","Kowalska","1981-01-01");
		
		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(1, 2000, ala);
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
	
	}

}
