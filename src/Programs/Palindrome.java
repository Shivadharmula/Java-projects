
package Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter a number::");
    //    int num =sc.nextInt();
        int num = 121;
        int Num1= num;
        int rev=0;
        while(num!=0) 
        {
        	rev=rev*10 + num%10;
        	num=num/10;
        }
      //  System.out.println(rev);
        if(Num1 == rev) 
        {
        	System.out.println(Num1 +":is palindrome number:");
        }
        else
        {
        	System.out.println(Num1 +":not palindrome number:");
        }
	    }

}
