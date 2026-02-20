package allprograms;

import java.util.Date;
import java.text. SimpleDateFormat;
public class datedemo {


	public static void main(String[] args) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss ");
		Date datenow = new Date();
		SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss ");
		Date datenow1 = new Date();
		SimpleDateFormat ft2 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		Date datenow2= new Date();
		SimpleDateFormat ft3 = new SimpleDateFormat("dd MMMM yyyy zzzz");
		Date datenow3= new Date();
		System.out.println("Current Date: "+  ft.format (datenow));
		System.out.println(""+  ft1.format (datenow1));
		System.out.println(""+  ft2.format (datenow1));
		System.out.println(""+  ft3.format (datenow1));

	}

}
