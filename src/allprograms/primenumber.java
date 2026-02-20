package allprograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
//		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the number::");
//			int n= sc.nextInt();
			int i,j;
            for(i=1;i<=100;i++) 
            {
              int count =0;
              for(j=1;j<=i;j++) 
              {
               if(i%j==0)
                {
            	  count++;
                 }
               }
            if(count==2)
            {
            	System.out.println(i);
            }
            }
	}

}