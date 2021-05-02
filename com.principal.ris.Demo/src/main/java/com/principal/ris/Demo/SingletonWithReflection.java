package com.principal.ris.Demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonWithReflection {
	
	public static void main(String args[]){
		
		Singleton s1 = Singleton.getInstance();
		//Singleton s2 = Singleton.getInstance();
		Singleton s2 = null;
		
		
		//with reflection
		/*try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			
			for (Constructor c :constructors){
				c.setAccessible(true);
				s2 = (Singleton) c.newInstance();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		} */
		
		
		
		
		// to avoid reflection
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			
			for (Constructor c :constructors){
				c.setAccessible(true);
				s2 = (Singleton) c.newInstance();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		
		
		
		
		
		
	}

}
