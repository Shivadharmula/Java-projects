package Programs;

import java.lang.reflect.Array;

public class secondlargestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,size;
		int a[]= {10,20,25,56,67,90,74};
	  size=a.length;
		
		for(int i=0;i<size;i++) {
		 for(int j=i+1;j<size;j++) {
			 if(a[i]>a[j]) {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			 }
			 
			 
		 }
		}
          System.out.println("Second largest element in the array:"+a[size-2]);
	}

}
