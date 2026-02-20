package Multithreading;

public class Testmultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Thread t1 = new Emp();          //"e1"      :here thread class we created object
		 t1.start();		                         
		 Thread t2 = new Student();
		 t2.start();
		
		System.out.println(Thread.activeCount()); 
		//System.out.println(Thread.currentThread().getName());
                                                                //		 this one way of multithreading 
	}
	
}

class Emp extends Thread{
	
//	public Emp (String ename) {                   // constructor 
//		super(ename);
//	}
	@Override

	public void run() {
		System.out.println("employee-portal-" + Thread.currentThread().getName() +" :: "+ Thread.currentThread().getId());
	}
}

class Student extends Thread{
//	public Student (String tname) {
//		super (tname);
//	}
	@Override
	
	public void run() {
		System.out.println("student-portal-" + Thread.currentThread().getName() +" :: "+ Thread.currentThread().getId());
	}
}