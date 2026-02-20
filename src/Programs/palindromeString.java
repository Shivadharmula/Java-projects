package Programs;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter a String::");
   //     String str=sc.next();
        String str = "RADAR";
        
        String rev="";
        
        int strlen=str.length();
        for(int i=strlen-1;i>=0;i--) 
        {
        	rev=rev+str.charAt(i);
        }
      //System.out.println(rev);
        if(str.equals(rev)) {
        	System.out.println(str + ":is palindrome:");
        }
        else {
        	System.out.println(str + ":not palindrome:");
        }
        
	}

}
