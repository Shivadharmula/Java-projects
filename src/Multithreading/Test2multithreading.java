package Multithreading;

public class Test2multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Runnable r1 = new Runnable() {            //-- this annoymonous class not runnable object
//		public void run() {
//			System.out.println("Employee--" + Thread.currentThread().getName() +" :: "+ Thread.currentThread().getId());
//		}
//		};
//		Runnable r2 = new Runnable() {
//			public void run() {
//				System.out.println("Student--" + Thread.currentThread().getName() +" :: "+ Thread.currentThread().getId());
//			}
//			};
//			Thread t1 = new Thread(r1, "Emp");
//			Thread t2 = new Thread(r1, "Stu");
//	        t1.start();
//		     t2.start();
		
         Emp1 e1 = new Emp1();           //--runnabale object   //runnable is interface 
		 Thread t1  = new Thread(e1 ,"Emp");
		 t1.start();	 
		 
		 Student1 s1 =new Student1();
		 Thread t2 = new Thread(s1, "Stu");
		 t2.start();
		
		System.out.println(Thread.activeCount());

	}

}

class Emp1 implements Runnable{
		@Override
	public void run() {
		System.out.println("Employee--" + Thread.currentThread().getName() +" :: "+ Thread.currentThread().getId());
	}
}
class Student1 implements Runnable {
	@Override 
	public void run() {
		System.out.println("Student--" + Thread.currentThread().getName() +" :: "+ Thread.currentThread().getId());
	}
}