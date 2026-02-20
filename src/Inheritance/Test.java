package Inheritance;

class Bank {
    String bankName = "SBI Bank";

    void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    double getInterestRate() {
        return 5.0;
    }
}
class SavingsAccount extends Bank {
    @Override
    double getInterestRate() {
        return 6.5; // Savings account interest
    }

    void accountType() {
        System.out.println("Account Type: Savings");
    }
}
class CurrentAccount extends Bank {
    @Override
    double getInterestRate() {
        return 7.0; // Current account interest
    }

    void accountType() {
        System.out.println("Account Type: Current");
    }
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	        Bank b1 = new SavingsAccount();   // Parent reference, child object
	        Bank b2 = new CurrentAccount();

	        b1.showBankName();                // Inherited from Bank
	        System.out.println("Interest Rate: " + b1.getInterestRate());
	        ((SavingsAccount)b1).accountType(); // Child-specific method

	        System.out.println();

	        b2.showBankName();                
	        System.out.println("Interest Rate: " + b2.getInterestRate());
	        ((CurrentAccount)b2).accountType();
	    }
	

}
