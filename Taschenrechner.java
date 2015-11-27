import java.util.*;


class Taschenrechner
{

	private double zwischenergebnis;


	public double getZwischenergebnis()
	{
		return zwischenergebnis;
	}

	public void reset()
	{
		zwischenergebnis = 0.0;
	}

	public void add(double d)
	{
		zwischenergebnis += d;
	}

	public void sub(double d)
	{
		zwischenergebnis -= d;
	}

	public void mult(double d)
	{
		zwischenergebnis *= d;
	}

	public void div(double d)
	{
		zwischenergebnis /= d;
	}

	public void root()
	{
		zwischenergebnis = Math.sqrt(zwischenergebnis);
	}

	public static void main(String... args)
	{
		Taschenrechner t = new Taschenrechner();

		Scanner scanner = new Scanner(System.in);

		String operation = "";

		while(true)
		{
			System.out.println("----------------------------------");

			System.out.println("Operation eingeben: a = addieren, s = subtrahieren,"
			+"m = multiplizieren, d = dividieren, w = quadratwurzel, r = zurücksetzen, e = ende");
			operation = scanner.next();

			double zahl = 0d;

			if(operation.equals("e"))
			{
				break;
			}
			if(!operation.equals("w") && !operation.equals("r"))
			{
				System.out.print("Zahl eingeben: ");
					zahl=scanner.nextDouble();
			}

			switch(operation)
			{
				case "a":
				t.add(zahl);
				break;

				case "s":
				t.sub(zahl);
				break;

				case "m":
				t.mult(zahl);
				break;

				case "d":
				t.div(zahl);
				break;

				case "w":
				t.root();
				break;

				case "r":
				t.reset();
			}

			System.out.println("Zwischenergebnis: "+t.getZwischenergebnis());

			System.out.println("----------------------------------");

		} 
	}


}


