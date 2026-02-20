package Linkedlist;

import java.util.LinkedList;

public class LinkTest {

	public static void main(String[] args) {
		
		LinkedList<String> alist = new LinkedList<String>();
		//System.out.println(alist);
		alist.add("code");
		alist.add("begun");
		alist.add("java");
		alist.add("javascript");
//		
		System.out.println(alist);
		System.out.println("the last element:"+alist.removeLast());
		
		System.out.println(alist.add("js"));
	System.out.println(alist);
	//	System.out.println("first element:"+alist.removeFirst());
//		System.out.println("element:"+alist.getFirst());
//		System.out.println("element:"+alist.get(0));
//		System.out.println("element:"+alist.peekFirst());
	
		
	}

}
