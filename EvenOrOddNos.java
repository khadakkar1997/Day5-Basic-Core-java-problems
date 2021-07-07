package basicCoreProgrammingDay5;

import java.util.Scanner;

public class EvenOrOddNos {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a no");
	        int n = sc.nextInt();
	        sc.close();
	        
	        
	        if(n%2==0)
	        {
	            System.out.println(n+" is an EVEN no");
	        }
	        else
	        {
	            System.out.println(n+" is an ODD no");
	        }
	    }

}
