package basicCoreProgrammingDay5;

import java.util.Scanner;

public class harmonicNos_P4 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter any no:");
	int n = s.nextInt();
	s.close();
	double sum= 0;
	for (float i = 1; i<=n;i++){
	sum+=(1/i)*Math.pow(-1,i+1);

	}
	System.out.println(sum);
	}
	


}


