package pojava.lab1.zadC;

import java.util.Random;

public class Auto 
{
	private int m=12;
	private float[]przebieg=new float[m];
	Auto()
	{
		for(int i=0;i<przebieg.length;i++) 
		{
			Random random = new Random();
			przebieg[i]=random.nextFloat(0,1000);
		}
	}
	float srPrzebieg()
	{
		float sum=0;
		for(int i=0;i<przebieg.length;i++)
		{
			sum+=przebieg[i];
		}
		return sum/przebieg.length;
	}
	
}
