package pojava.lab1.zadB;

public class Tablica 
{

	public static void main(String[] args) 
	{
		int n =4;
		if (args.length<4)
    	{
    		System.out.println("Podaj cztery słowa");
    		return;
    	}
		String[] tablica = new String[n];
		for (int i=0;i<tablica.length;i++)
		{
			tablica[i]=args[i];
		}
		for (int i=0;i<tablica.length;i++)
		{
			System.out.println(tablica[i]);
		}
	}
}
