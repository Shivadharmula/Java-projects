package Linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain 
{

	public static void main(String[] args) 
	{
		
		List listobj = new ArrayList();
		listobj.add(20);
		listobj.add(10);
		listobj.add(32);
		listobj.add(5);
		System.out.println(listobj);
		
		Set objset = new HashSet();
		objset.add(10);
		objset.add(5);
		objset.add(15);
		objset.add(2);
		System.out.println(objset);
		
		// for loop..
		
		for(int i=0;i<objset.size();i++) {
		System.out.println(i);
			
		}
	
	   Set<String> data = new HashSet<String>();
       data.add("code");
       data.add("begun");
       data.add("java");
       System.out.println(data);
   	   
       }
       
			

	}


