 package allprograms;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Your number: ");
	int num = scanner.nextInt();
	if(num % 2==0)
	{
		System.out.println("The number is Even: "+num);
		
	}
	else

	{
		System.out.println("The number is Odd: "+num);
		
	}

		

	}

}
