package staticmethod;

public class staticglo {
      static  int a=10;;
	public static void main(String[] args) {
		    staticglo sc= new staticglo();
		     method1();
		     sc.method2();
	}  
	  static void method1()
	  {
	      System.out.println("allows the global variable::" +a); 
      }
	    void method2()
	    {
		   System.out.println("allows the global variable::" +a);
	    }
	}


