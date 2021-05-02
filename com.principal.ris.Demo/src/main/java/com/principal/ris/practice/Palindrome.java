package com.principal.ris.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {
	
	
	
	
	public static void main(String[] args) {
	
		String palindrome  = "MALaYALAM";
		System.out.println(isPalindrome(palindrome.toLowerCase()));
		
		
		//Random code
		ArrayList<String> l = new ArrayList<>();
		
		l.add("ABC");
		l.add("PRQ");
		l.add("DEF");
		l.add("GHE");
		l.add("IJK");
		l.add("ABC");
		l.add("ABC");
		
		l.add("ABC");
		l.add("ABC");
		
		
		List<String> filteredStream = l.stream().filter(s->s.equalsIgnoreCase("ABC")).collect(Collectors.toList());
		
		filteredStream.forEach(h->System.out.println(h));
	}
	
	
	private static boolean isPalindrome(String s){
		char [] a =  s.toCharArray();
		
		for(int i = 0; i<a.length; i++){
			if(a[i]!=a[a.length-1-i]){
				return false;
			}
		}
		return true;
	}

}
