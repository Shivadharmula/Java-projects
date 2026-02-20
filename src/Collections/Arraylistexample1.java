package Collections;

import java.util.ArrayList;

public class Arraylistexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Float> alist1 = new ArrayList<Float>();
		ArrayList<Boolean> alist2 = new ArrayList<Boolean>();
		
		alist.add(20);
		alist.add(23);
		alist1.add(2.4f);
		alist1.add(23.1f);
		alist2.add(true);
		alist2.add(false);
		
		System.out.println(alist);
		System.out.println(alist1);
		System.out.println(alist2);
		
		
		ArrayList<TestData> alist3 = new ArrayList<TestData>();
		TestData obj = new TestData();
		obj.setVar1(100);
		obj.setVar1(20);
		alist3.add(obj);
		for(int i=0;i<alist3.size();i++) {
		
			
		}

	}

}

