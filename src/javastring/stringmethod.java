package javastring;

public class stringmethod {

	public static void main(String[] args) {
		String s = "Hello123";
		String s1 = "Hello1234";
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(0));
		System.out.println(s.contains(s));
		System.out.println(s.compareTo(s));
		System.out.println(s.compareToIgnoreCase(s));
		System.out.println(s.compareTo(s1));
	}

}
