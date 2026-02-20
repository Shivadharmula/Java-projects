package Collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// size -no of elements present in list
		// by deault capcity = array Capacity -10
          Vector<String> v =new Vector<>();
          v.add("java");
          v.add("c");
          v.add("java");
          System.out.println(v);
          Vector<String> v1 =new Vector<>();
          v1.add("react"); 
          v1.add("js");
         
         // System.out.println(v.addAll(v1));
            v.addAll(v1);
          System.out.println(v);
       //   System.out.println(v.get(1));
	}

}

