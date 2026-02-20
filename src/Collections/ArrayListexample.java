package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList alist = new ArrayList ();
		
		alist.add("Shiva");
		alist.add("Age:22");
		alist.add("8/3/2001");
		
		System.out.println(alist);
		
		List alist1 = new ArrayList();
		alist1.add("Dharmula");
		alist1.add("age:22");
		alist1.add("8/3/2001");
		
		System.out.println(alist1);
		
		alist.addAll(alist1);
		System.out.println(alist);
	//	System.out.println(alist.get(0));
	//	alist.removeFirst();

		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		
		
				
	}

}
