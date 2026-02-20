package Constructors;

public class Studentinfo {
     
	int id ;
	String name;
	
	Studentinfo(int i, String n){    // parameter constructor
		id =i;
		name =n;
	
	}
	void display () {
		System.out.println(id +" "+ name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Studentinfo std1 =new Studentinfo(101,"Shiva");   // craeting object
       Studentinfo std2 =new Studentinfo(102,"Dharmula");
       
       std1.display();   // constructor called
       std2.display();
	}

}
