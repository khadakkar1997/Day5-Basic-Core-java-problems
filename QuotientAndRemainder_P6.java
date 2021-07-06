package basicCoreProgrammingDay5;

import java.util.Scanner;

public class QuotientAndRemainder_P6 {
	
	
	
	    public static void main(String[] args) {
	   
	    	Scanner scan=new Scanner(System.in);
	    	//create a scanner instance for receives input
	    	// from the user - input from keyboard
	    	System.out.print("Enter the value to num1: ");
	    	int num1=scan.nextInt();
	    	System.out.print("Enter the value to num2: ");
	    	int num2=scan.nextInt();
	    	int quotient=num1/num2;  // / symbol is used to calculate quotient 
	    	int remainder=num1%num2;  // % symbol is used to calculate remainder 
	    	System.out.println("Quotient is: "+quotient);
	    	System.out.println("remainder is: "+remainder);
	    	scan.close();
	    	}
	    	
}

	


