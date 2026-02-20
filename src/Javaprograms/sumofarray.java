package Javaprograms;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {5,3,4,2,7};
      int sum=0;
      
      for(int i=0;i<a.length-1;i++) {
    	  sum=sum+a[i];
      }
      System.out.println("Sum of Array:"+sum);
	}

}
