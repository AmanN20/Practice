package com.Practice.java;

import java.util.Scanner;

public class count_vowels {
	//COUNT VOWELS,CONSONANTS,SPECIALS

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		
		int vowel = 0;
		int Consonant = 0;
		int Specials = 0;
		for(int i = 0;i<s.length();i++) {
			char ch =s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
			  || ch == 'E'|| ch == 'I' || ch == 'O' || ch =='u') {
				vowel++;

				
			}
			else{
				Consonant++;

				
			}
			}
			else{
				Specials++;

			}
			
		}
		System.out.print("Vowels = "+vowel);
		System.out.println();
		System.out.print("Consonants = "+ Consonant);
		System.out.println();
		System.out.print("Specials = "+ Specials);
}

}
