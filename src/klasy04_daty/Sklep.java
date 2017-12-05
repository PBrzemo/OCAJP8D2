package klasy04_daty;

public class Sklep {
	
	public void zakupy(Osoba klient) {
		//System.out.print(klient.imie);
		if(klient.getWiek() < 18) {
			System.out.println(klient.imie +" masz za mało lat");
		}else {
			System.out.println(klient.imie +" możesz kupić piwo");
		}
	}
}
