package allprograms;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");	
		Scanner scanner= new Scanner(System.in);
		  int num = scanner.nextInt();	
	  
		if (num>0) {
			System.out.println("The number is Postive: ");
			
			
		}
		else if (num<0 ){
			System.out.println("The number is negative: ");
			
		}
		else {
			 System.out.println("The number is zero: ");
		}
		

	}

}
