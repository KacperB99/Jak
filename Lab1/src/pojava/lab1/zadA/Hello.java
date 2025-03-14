package pojava.lab1.zadA;

class Hello
{
    public static void main(String[] args)
    {
    	if (args.length==0)
    	{
    		System.out.println("Podaj jakiś argument");
    		return;
    	}
    	int n;
    	try
    	{
    		n = Integer.parseInt(args[0]);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Argument musi być liczbą");
    		return;
    	}
        for (int i = 1; i <= n; i++) 
        {
        	System.out.println("Witaj!");
            System.out.println(i);
        }
    }
}
