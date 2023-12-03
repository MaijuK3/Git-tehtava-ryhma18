
public class Main {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		auto1.merkki = "Toyota";
		auto1.malli = "Yaris";
		auto1.bensanMaara = 5;
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
	}
} // main loppuu



//Auto-luokka:
class Auto {
	// auton ominaisuudet:
	public String merkki;
	public String malli;
	public int bensanMaara;	
	
	
	// oletusmuodostin:
	public Auto() {

		this.merkki = "";
		this.malli = "";
		this.bensanMaara = 0;

	}
	
	
	
	// parametrinen muodostin:
	
	
	
	// auton toiminnot:
	// jarruta-metodi:
	public void jarruta() {

		System.out.println("Auto jarruttaa");
	}

	
	
	
	// kiihdyta-metodi:
	public void kiihdyta() {
	if (bensanMaara > 0) {
        bensanMaara -= 1;
		System.out.println("Auto kiindyttää"); }
			else {
				System.out.println("Bensa loppu");
			}
		}

	
	
	
	// tankkaa-metodi:
	
	
	
	
	// naytaTiedot-metodi:
	public void naytaTiedot() {
		System.out.println("*** Auton tiedot ***");
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
	}	
	
	
} // Auto-luokka loppuu
