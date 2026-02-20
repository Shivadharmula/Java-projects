package Programs;

public class swaptwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=20;
           int b=30;
    //       System.out.println("Before Swapping a is :" +a + " and b is :"+b);
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After Swapping a is :"+a);
            System.out.println("After Swapping b is :"+b);
	}

}
