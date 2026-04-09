package com.Practice.java;

import java.util.Scanner;

public class AbsoluteValue {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        if(n<0)
	        {
	            n = -n;
	        }
	        System.out.println(n);
	       
	    }
}
