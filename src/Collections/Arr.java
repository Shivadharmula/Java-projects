package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Arr {

public static void main(String[] args) {
	    
	    ArrayList<Integer> Arr = new ArrayList<Integer>();
	    Arr.add(1);
	    Arr.add(4);
	    Arr.add(3);
	    Arr.add(2);
	    Arr.add(1);
	    Arr.add(3);
	    Arr.add(4);
	    Arr.add(3);
	    System.out.println("Before duplicate:"+Arr);
	   
	    for(int i=0;i<Arr.size();i++) {
	     for(int j=i+1;j<Arr.size();j++) {
	    	 if(Arr.get(i)==Arr.get(j)) {
	    		 Arr.remove(j);	
	    		 j--;
	    		 
	    	 } 
	     }
	   }
	    System.out.println("After duplicate:"+Arr);
	    
	    for (int i=0;i<Arr.size();i++) {
	     for(int j=i+1;j<Arr.size();j++) {
	    	 if(Arr.get(i)>Arr.get(j)) {
	    		 int a=Arr.get(i) ;
	    		 int b=Arr.get(j);
	    		 int c=a;
	    		 a=b;
	    		 b=a;
	    		 Arr.set(i, b);
	    		 Arr.set(j,c);
	    		 
	    	 }
	     }
	   }
	    System.out.println("sorted Array:"+Arr);
	    System.out.println("second largest number::"+Arr.get(Arr.size()-2));
	    
	    ArrayList<Integer> arr=new ArrayList<Integer>();
	    int n = 0;
	    for(int i=0;i<arr.size();i++) {
	    	if(i<n) {
	    	  Arr.add(Arr.get(i));
	    	}
	    }
	    System.out.println("Before rotate:"+Arr);
	//     for(j=n;j<arr.size();j++) {
	//    	 arr.get(arr.get(j));
	     }
	    
	    
}  
	    
