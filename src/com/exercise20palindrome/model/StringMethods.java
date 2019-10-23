package com.exercise20palindrome.model;

import java.util.Stack;

public class StringMethods {
	public static boolean isPalindrome(String phrase)
	{
		boolean isPal = true;
		String cadClean = phrase.replace(" ", "");
		cadClean = cadClean.replace(".", "");
		cadClean = cadClean.replace(",", "");
		cadClean = cadClean.replace("}", "");
		cadClean = cadClean.toLowerCase();
		
		for(int i=0; i < cadClean.length();i++)
		{
			if(cadClean.charAt(i) != cadClean.charAt((cadClean.length()-1)-i))
			{
				isPal = false;
				break;
			}
		}
		System.out.println(cadClean);
		return isPal;
	}
	
	public static boolean isPalindrome2(String phrase)
	{
		boolean isPal = true;
		String cadClean = phrase.replace(" ", "");
		cadClean = cadClean.replace(".", "");
		cadClean = cadClean.replace(",", "");
		cadClean = cadClean.replace("}", "");
		cadClean = cadClean.toLowerCase();
		char[] charArray = cadClean.toCharArray();
		
		
		Stack<Character> letters1 = new Stack<Character>();
		Stack<Character> letters2 = new Stack<Character>();
		
		for(Character c: charArray)
		{
			letters1.push(c);
		}
		
		for (int i = charArray.length-1; i >= 0 ; i--) 
		{
			letters2.push(charArray[i]);
		}
		
		while(!letters1.isEmpty())
		{
			if(letters1.pop() != letters2.pop())
			{
				isPal = false;
				break;
			}
		}
		
		
		return isPal;
	}
	
	
}
