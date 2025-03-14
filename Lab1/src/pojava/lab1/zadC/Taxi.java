package pojava.lab1.zadC;

import java.util.Random;

public class Taxi extends Auto
{
	private int m=12;
	private float[] zarobki=new float[m];

	Taxi()
	{
		for(int i=0;i<zarobki.length;i++) 
		{
			Random random = new Random();
			zarobki[i]=random.nextFloat(0,10000);
		}
	}
	float srZarobki()
	{
		float sum=0;
		for(int i=0;i<zarobki.length;i++)
		{
			sum+=zarobki[i];
		}
		return sum/zarobki.length;
	}
	public static void main(String[] args)
	{
		Taxi taxi= new Taxi();
		float P = taxi.srPrzebieg();
		float Z = taxi.srZarobki();
		System.out.format("Średni miesięczny przebieg wynosi : %.3f km \n",P);
		System.out.format("Średnie miesięczne zarobki wynoszą : %.2f PLN",Z);
	}	

	

}
