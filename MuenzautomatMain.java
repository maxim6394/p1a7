import java.util.*;


public class MuenzautomatMain
{


	public static void main(String... args)
	{
		System.out.println("----------------------------------");
		(new Muenzautomat("Kaugummi", 0.2d, 3)).run();
		System.out.println("----------------------------------");

	}


}

class Muenzautomat
{
	private String produkt;
	private double preis;
	private int bestand;
	private double bezahlerBetrag;

	public Muenzautomat(String produkt, double preis, int bestand)
	{
		this.produkt = produkt;
		this.preis = preis;
		this.bestand = bestand;
		bezahlerBetrag = 0;
	}

	public void run()
	{
		while(bestand > 0)
		{
		System.out.println("# # # # # # # # # # # # # # # # # #");
			produktZeigen();
			geldEingeben();
			geldWechseln();
			produktAusgeben();
		System.out.println("# # # # # # # # # # # # # # # # # #");
		}

		System.out.println("Der Automat ist leer.");

	}

	private void produktZeigen()
	{
		System.out.println(produkt+"	 "+preis+" EUR	 "+bestand+" Stück");
	}

	private void geldEingeben()
	{
		double eingabe;

		Scanner scanner = new Scanner(System.in);

		do
		{
		System.out.println("Ich brauche noch "+(preis - bezahlerBetrag)+" EUR, was gibst du mir ?");

		eingabe = scanner.nextDouble();
		muenzeEinwerfen(eingabe);

		}
		while(bezahlerBetrag < preis);
		
	}

	private void muenzeEinwerfen(double betrag)
	{
		bezahlerBetrag+=betrag;
	}

	private void geldWechseln()
	{
		System.out.println("Wechselgeld: "+(bezahlerBetrag-preis)+" EUR");
	}

	private void produktAusgeben()
	{
		System.out.println("Gebe Produkt aus: "+produkt);		
		bezahlerBetrag = 0;
		bestand--;
	}

}


