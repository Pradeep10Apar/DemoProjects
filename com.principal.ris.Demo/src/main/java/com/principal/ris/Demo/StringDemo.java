package com.principal.ris.Demo;

public class StringDemo {
	
	
	public static void main (String args[]){
		String s = "ADG";
		s = "new";
		System.out.println(s);
		
		String s1 = new String("AFGH");
		System.out.println(s1);
		
		s1 = "MODFYING";
		s1.concat("PQR");
		
		System.out.println(s1);
		
		String s3 =s1.concat("PQRS");
		
		System.out.println(s3);
		
		StringBuilder s4 = new StringBuilder("XYZ");
		s4.append("ABC");
		
		System.out.println(s4);
	}

}
