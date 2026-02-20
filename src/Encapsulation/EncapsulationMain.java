package Encapsulation;

 class details
 {
   private int age;   //private variable (data hididng))
   private  String name;
   
   public int getAge()
   {
	  return age;
   }
   public void setAge(int a)
   {
	    age=a;   
   }
   public String getName()
   {
	   return name;
   }
   public void setName(String n) {
	   name = n;
   }
   
 }
public class EncapsulationMain {

	
	public static void main(String[] args) 
	{
		details obj = new details();
	
	  	obj.setAge(20);
		obj.setName("shiva");
		
		System.out.println(obj.getName() + ":"+ obj.getAge());
		

	}

}
