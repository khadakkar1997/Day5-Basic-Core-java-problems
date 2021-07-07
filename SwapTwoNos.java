package basicCoreProgrammingDay5;


import java.util.Scanner;
public class SwapTwoNos {
	
	

	
		private static Scanner sc;
		public static void main(String[] args) 
		{
			int a, b, temp;
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter the First value : ");
			a = sc.nextInt();	
			
			System.out.print(" Please Enter the Second value : ");
			b = sc.nextInt();	
			
			System.out.println("\n Before Swapping: a =  " + a + " and b =  " + b);
			
			temp = a;
			a = b;
			b = temp;
			
			System.out.println("\n After Swapping:  a =  " + a + " and b =  " + b);
		}

}
