package abstraction;

public class AbstractDerived extends AbstractMain{
	int a=20;
	int b=40;
	int m2(int a,int b) 
	{
	  System.out.println("Deived class::"+super.a);
	  System.out.println("Derived class::"+super.b);
	  return a+b;
	  
	}


}
