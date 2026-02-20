package ecommerce;

import java.sql.Connection;

public class TestDB {
	   public static void main(String[] args) {
	        Connection con = DBConnection.getConnection();
	        if (con != null) {
	            System.out.println("✅ MySQL Connected Successfully");
	        } else {
	            System.out.println("❌ MySQL Connection Failed");
	        }
	    }
}
