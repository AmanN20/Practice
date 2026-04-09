package com.Practice.java;

import java.util.Scanner;

public class multipleOf537 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	         if(n%5==0 && n%3==0  && n%7==0){
	        System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }
	       
	    }
}
