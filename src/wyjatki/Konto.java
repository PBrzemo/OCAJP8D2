package wyjatki;

public class Konto {
	int numer;
	int saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}

	
	@Override
	public String toString() {
		return "Konto [numer=" + numer + ", saldo=" + saldo + ", wlasciciel=" + wlasciciel + "]";
	}
	
	public void wplata(int kwota) {
//		if(kwota > 0)
//		saldo += kwota;
//		else
//			throw new IllegalArgumentException("ERROR");
		if(kwota <= 0) {
			throw new IllegalArgumentException("ERROR");
		}
			saldo += kwota;
		
	}
	public void wyplata(int kwota) throws Braksrodkow {
//		if(kwota > 0)
//		saldo += kwota;
//		else
//			throw new IllegalArgumentException("ERROR");
		if(kwota <= 0) {
			throw new IllegalArgumentException("ERROR");
		}
		if(kwota>saldo) {
			throw new Braksrodkow();
		}
		saldo -= kwota;
		
		
	}
	
}
