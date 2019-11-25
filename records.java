//Aurthor: saakshi.....To make a program to impliment Stations
import javax.swing.JOptionPane;
class records
{
	//main method
	public static void main (String[] p)
	{ 	
		Station selectedstation= new Station();

		Station o = new Station();
		o.name = "Oxford Circus";
		o.toilets = false;
		o.cost = 300;
		
		Station b = new Station();
		b.name = "Bond Street";
		b.toilets = true;
		b.cost = 310;

		Station sg = new Station();
		sg.name = "Stepney Green";
		sg.toilets = true;
		sg.cost = 360;

		Station kc = new Station();
		kc.name = "Kings Cross";
		kc.toilets = false;
		kc.cost = 240;

		Station gp = new Station();
		gp.name = "Green Park";
		gp.toilets = true;
		gp.cost = 390;




		print("Which station do you want to know about");
		boolean correctans = false;
		while(!correctans)
		{
		String s = input("Enter a station name");
		if (s.equalsIgnoreCase(o.name))
		{ 
		selectedstation = o;
		correctans = true;
		}
		else if (s.equalsIgnoreCase(b.name))
		{ 
		selectedstation= b;
		correctans = true;
		}
		else if (s.equalsIgnoreCase(sg.name))
		{ 
		selectedstation= sg;
		correctans = true;
		}
		else if (s.equalsIgnoreCase(kc.name))
		{ 
		selectedstation= kc;
		correctans = true;
		}

		else if (s.equalsIgnoreCase(gp.name))
		{ 
		selectedstation= gp;
		correctans = true;
		}


		else
		{
		print("Is "+s+" a London underground station? Check your spelling.");
		correctans= false;
		}

		}//end of while
		
		if(selectedstation.toilets)
		{
			print(selectedstation.name+" has toilets and costs(in pence) "+selectedstation.cost);
		}
		else 
		{
			print(selectedstation.name+" doesn't have toilets and costs (in pence) "+ selectedstation.cost);
		}
	}//end of main




	
	//method to print
	public static void print(String p)
	{
		System.out.println(p);
	}

	//method to accept strings
	public static String input(String i)
	{
		return JOptionPane.showInputDialog(i);
	}



}//end of class Stations



//class Station
class Station
{
	String name;
	boolean toilets;
	int cost;//in pence
}
