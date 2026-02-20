package allprograms;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Date2 {

	public static void main(String[] args) {
		
		long x = 1703576045L;
		
		DateFormat obj2= new SimpleDateFormat("dd MM yyyy HH:mm:ss:sss Z");
	     Date  dt2= new Date();
	     
	     System.out.println(obj2.format(dt2));
		
				

	}

}









































