package basicCoreProgrammingDay5;

import java.util.Scanner;

public class LeapYear_P2 {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = sc.nextInt();
        
        if((year%400==0) || ((year%4==0) && (year%100!=0)))
        {
            System.out.println(year+" is a Leap Year.");
        }
        else {
            System.out.println(year+" is not a Leap Year.");
        }
        sc.close();
        
        
    }

}


