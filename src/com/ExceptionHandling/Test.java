package com.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args)  {  //throws FileNotFoundException 
		// TODO Auto-generated method stub
		System.out.println("program excuetion is started");
        int a= 8;
        int b=0;
        		;
        int c=0;
//          File file = new File("D:/resume.docx");
//          FileInputStream fis = new FileInputStream(file);
//          System.out.println(fis);
        
        try {
        	c=a/b;
        }
        catch(ArithmeticException ae){
        	System.out.println(ae.toString());
        //	throw ae;      //by default java catches -- program exceution stopped
        }
        finally {
        	System.out.println("finally block"); // exception or without finally block printed //when  finally block there catch is optional 
        }
        System.out.println("Result:"+c);
	}

}
