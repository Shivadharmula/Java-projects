package Javaprograms;

public class ConstructorTestMain {

	public static void main(String[] args) {
		ConstructorTest constructorTest = new ConstructorTest(90,80,70);
		ConstructorTest constructorTest1 = new ConstructorTest();
		
		constructorTest.method1(30,20,40);
		int a=0;
		System.out.println("Valof A ::" + a);
		
		constructorTest1.method();
		
		
		System.out.println("From Main Method Obj1 ::" +constructorTest.input1);
		System.out.println("From Main Method Obj2 ::" +constructorTest1.input2);


		
		
				}

}
