package com.Practice.java;

import java.util.Scanner;

public class FarenheitToCelcius {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    // Write your code here
	    double farenheit = scanner.nextDouble();
	    double sum = (5.0/9)*(farenheit-32);
	    System.out.printf("%.4f",sum);
	  }
}
