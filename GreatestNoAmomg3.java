package basicCoreProgrammingDay5;

import java.util.Scanner;

public class GreatestNoAmomg3
{

	public static void main(String[] args) 
	{
	int a,b,c;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any three numbers: ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	sc.close();

	         if(a>=b && a>=c) 
	             {
	               System.out.println("Largest number: "+a);
	             }
	         if(b>=a && b>=c) 
	            {
	               System.out.println("Largest number: "+b);
	            }
	            if(c>=a && c>=b) 
	            {
	               System.out.println("Largest number: "+c);
	            }
	}
}
