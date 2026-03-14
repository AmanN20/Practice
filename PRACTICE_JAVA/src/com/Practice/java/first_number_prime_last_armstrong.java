package com.Practice.java;

import java.util.Scanner;

public class first_number_prime_last_armstrong {
	
	public static boolean checkPrime(int n){
		int num = 0;

		if(num < 2) return false;

		for(int i = 2; i * i <= num; i++) {
		    if(num % i == 0) {
		        return false;
		    }
		}
		return true;
	}
	
	public static int countDigit(int n){
		int count = 1;
		for(int  i =0;i<n;i++) {
			n = n/10;
			count++; 
		}
		return count;
	}
	
	public static boolean checkArmstrong(int n){
		int count = countDigit(n);
		int  i = n-1;
		int sum = 0;
		int originalNumber = n;
		while(n>0) {
			int digit = n%10;
			sum += Math.pow(digit, count);
			n = n/10;
		}
		return sum == originalNumber;
			
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		
		int[] ar = new int[size];
		
		for(int  i = 0;i<ar.length;i++) {
			ar[i] = sc.nextInt();		
		}
//		for(int  i = 0 ; i<ar.length;)
		if(checkPrime(ar[0]) && checkArmstrong(ar[size-1])) {
			System.out.print(ar[0]+" "+ar[size-1]);
		}
		
	}

}
