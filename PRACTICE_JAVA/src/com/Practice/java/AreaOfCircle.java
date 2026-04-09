package com.Practice.java;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    // Write your code here
	    double pi = 3.142f;
	    int r = scanner.nextInt();
	    double area =(double) pi * r * r;
	    System.out.printf("%.4f",area); 
	  }
}
