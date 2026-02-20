package Collections;

import java.util.ArrayList;

public class Arraylistexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       Integer[] array1 = {1,2,3};
	       Integer[] array2 = {4,5,6};
	       ArrayList<Integer[]> combineArray=new ArrayList<Integer[]>();
	       combineArray.add(array1);
	       combineArray.add(array2);
	     // System.out.println(combineArray.get(0)[1]);
	       ArrayList<ArrayList<Integer[]>> arrayList1 = new ArrayList<ArrayList<Integer[]>>();
	       arrayList1.add(combineArray);
	       for(int i=0;i<arrayList1.size();i++) 
	       {
	    	   for(int j=0;j<arrayList1.get(i).size();j++)
	    	   {
	    		   for(int k=0;k<arrayList1.get(i).get(j).length;k++)
	    		   {
				System.out.println(arrayList1.get(i).get(j)[k]);
	               }
	    	   
	           }     

	       }

}
	
	
}

