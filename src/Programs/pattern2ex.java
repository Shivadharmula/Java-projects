package Programs;

public class pattern2ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=5;i>=1;i--) {
        	for(int s=1;s<=5-i;s++) {
        		System.out.print(" ");
        		
        	}
        	for(int j=1;j<=i*2-1;j++) {
        		System.out.print("*");
        	}
        	  	
        	System.out.println();
        }
	}

}
