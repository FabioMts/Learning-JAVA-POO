package com.cursonelio.aula9;

public class Program2 {

	public static void main(String[] args) {

		
		String[] vect = new String[] {"Maria", "Bob", "Alex"}; 
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
	}

}
