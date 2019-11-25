/* Author: Saakshi
 To make a selection from options and print using if and else statements*/

import java.util.Scanner;
class choose
{
	//Main
	public static void main(String[] p)
	{
		boolean correctanswer = false;
		while(!correctanswer)
		{
			print("Choose from A. Crisps: 1.50 \t B. Health Bar: 1.20 \t C. Chocolate: 2.00.");
			String c= input("Enter your choice");
			if(c.equals("A"))
			{
				print("A packet of crisps costs 1.50");
				correctanswer = true;
			}
			else if(c.equals("B"))
			{
				print("A Health Bar costs 1.20");
				correctanswer = true;
			}
			else if(c.equals("C"))
			{
				print(" A bar of chocolate costs 2.00");
				correctanswer = true;
			}
			else 
			{
				print("I do not have anything for choice "+c);
				correctanswer = false;
			}
		   	
		 }
	}
	
	//to print on the screen
	public static void print(String s)
	{
		System.out.println(s);
	}

	//to take input from the user
	public static String input(String p)
	{
		Scanner scanner= new Scanner(System.in);
		print(p);
		return  scanner.nextLine();
	}
}
		
		
		

