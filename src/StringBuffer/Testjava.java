package StringBuffer;

public class Testjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StringBuffer sb1 = new StringBuffer("Shiva");
		 
		 StringBuffer sb2 = new StringBuffer("Shiva");
		 System.out.println(sb1 == sb2);
		 
		 sb1 = sb1.append("Dharmula");
		 System.out.println(sb1 == sb2);
		 
		 StringBuffer sb3 = new StringBuffer("Shiva Dharmula");
		 
		  System.out.println(sb1 == sb3);
		
		System.out.println("=================================");
		
		
        String s1 = "Shiva";    // String concepts--- String are immutable
        
        String s2 = "Shiva";
        
        System.out.println(s1 == s2);  //20==20
        
        s1 = s1 + "Dharmula" ;
        System.out.println(s1 == s2); 
        
        String s3= "Shiva Dharmula";
        
        System.out.println(s1 ==  s3);
        
        System.out.println("====");
        
        StringBuffer sb11 = new StringBuffer("Shiva");
        StringBuffer sb22 = new StringBuffer("Shiva");
        
        System.out.println(sb11.equals(sb22));

        
        
        
        
		
	}

}
