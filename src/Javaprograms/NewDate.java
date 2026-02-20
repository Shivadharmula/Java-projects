package Javaprograms;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDate {

	public static void main(String[] args) {
	     Date date = new Date();
	     
	     System.out.println(date);
	     
	     LocalDate localdate = LocalDate.now();
	     System.out.println(localdate);
	     LocalTime localtime = LocalTime.now();
	     System.out.println(localtime);
	     LocalDateTime localDandT= LocalDateTime.now();
	     System.out.println(localDandT);
	     
	     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	     System.out.println(dtf.format(localDandT));
	     DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
	     System.out.println(dtf1.format(localtime));
	     DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	     System.out.println(dtf2.format(localdate));
	     DateTimeFormatter dtf3 = DateTimeFormatter.ISO_OFFSET_DATE;
	     
	     
	     
	     

	}

}
