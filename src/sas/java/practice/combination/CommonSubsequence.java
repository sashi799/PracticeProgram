package sas.java.practice.combination;

import java.util.Arrays;
import java.util.HashMap;

/*
 * 
 * Given two strings in lowercase, 
 * find the longest string whose permutations are subsequences of given two strings. 
 * The output longest string must be sorted.
 * */
public class CommonSubsequence {

	public static void main(String args[])
	{
		String str1="abaca";
		String str2="baa";

		StringBuilder sb=new StringBuilder();
		HashMap<Character,Character>  hp=new HashMap<Character,Character>();
		for(int i=0;i<str1.length();i++)
		{
			hp.put(str1.charAt(i),str1.charAt(i));

		}
		for(int i=0;i<str2.length();i++)
		{
			if(hp.containsKey(str2.charAt(i)))
				sb.append(str2.charAt(i));

		}
		String s=sb.toString();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(String.valueOf(ch));

	}
}

