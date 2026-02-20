package com.oops;


class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

// Implementation 3
class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Payment payment;   // Parent reference

	        payment = new UPI();        // Child object
	        payment.pay(500);

	        payment = new CreditCard(); // Child object
	        payment.pay(1000);

	        payment = new Cash();       // Child object
	        payment.pay(300);
	}

}
