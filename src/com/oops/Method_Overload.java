package com.oops;

class Calculator{
	int add (int a,int b) 
	{
		return a+b;
	}
	int add (int a,int b,int c) // method name same&& different parameters--- overloaded
	{
		return a+b+c;
	}
	double add (double a,double b) 
	{
		return a+b;
	}
}
public class Method_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator calc = new Calculator();
       System.out.println(calc.add(2, 3));
       System.out.println(calc.add(20, 30, 40));
       System.out.println(calc.add(2.5, 2.5));
	}

}
