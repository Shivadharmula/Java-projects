package Programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int num,rem=0,sum=0,temp;
		System.out.println("Enter a number:");
		num=sc.nextInt();
        temp=num;
        while(num!=0) {
        	rem=num%10;
        	sum=sum+(rem*rem*rem);
        	num=num/10;	
        }
        if(temp==sum) {
        	System.out.println("Armstrong number");
        }
        else {
        	System.out.println("not Armstrong number");
        }
	}

}
