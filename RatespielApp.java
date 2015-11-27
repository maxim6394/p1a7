import java.util.*;


public class RatespielApp
{


	public static void main(String... args)
	{
		System.out.println("----------------------------------");

		RateSpiel r = new RateSpiel();

		Scanner scanner = new Scanner(System.in);

		do
		{
			System.out.print("Zahl eingeben: ");
		}
		while(!r.vergleichen(scanner.nextInt()));

		System.out.println("----------------------------------");

	}


}

class RateSpiel
{
	private int zahl;
	private int versuche; 
	public  RateSpiel()
	{
		init();
	}

	private void init()
	{
		zahl = (new Random()).nextInt(21);
	}

	public boolean vergleichen(int eingabe)
	{
		versuche++;
		System.out.print("Eingegebene Zahl ist ");

		if(eingabe < zahl)
			System.out.println("kleiner");
		else if(eingabe > zahl)
			System.out.println("größer");
		else
			System.out.println("gleich ###  Versuche = "+versuche+"  ###");

		return eingabe == zahl;
	}
}


