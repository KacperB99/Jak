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
    	int nm;
    	try
    	{
    		nm = Integer.parseInt(args[0]);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Argument musi być liczbą");
    		return;
    	}
        for (int i = 1; i <= nm; i++) 
        {
        	System.out.println("Witaj!");
            System.out.println(i);
        }
    }
}
