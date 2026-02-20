package abstraction;

public  abstract class AbstractMain {
	  
	public AbstractMain()
	{
   System.out.println("Before a:" +a);
   System.out.println("Before b:" +b);
    a=10;
    b=20;
   System.out.println("After a:"+a);
   System.out.println("After b:"+b);
   }
	int a=20;
	int b=40;
	int m2(int a,int b) 
	{
	  System.out.println(this.a);
	  System.out.println(this.b);
	  return a+b;
	  
	}

}