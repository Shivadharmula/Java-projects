package Programs;

import java.util.Scanner;

public class Largestthreeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c,largest,temp;
       Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
       a=sc.nextInt();
       System.out.println("Enter first number");
       b=sc.nextInt();
       System.out.println("Enter second number");
       c=sc.nextInt();
 
        
       temp=a>b?a:b;
       largest=c>temp?c:temp;
       System.out.println("Enter a largest number:"+largest);
	}

}
