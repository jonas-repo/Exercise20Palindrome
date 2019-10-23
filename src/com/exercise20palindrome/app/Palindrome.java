package com.exercise20palindrome.app;

import com.exercise20palindrome.model.StringMethods;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal1 = "Anita lava latina";
		String pal2 = "yo doy rosas oro no doy";
		
		
		System.out.println(StringMethods.isPalindrome(pal1));
		System.out.println(StringMethods.isPalindrome2(pal1));
		
	}

}
