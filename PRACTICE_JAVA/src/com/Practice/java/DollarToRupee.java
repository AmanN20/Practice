package com.Practice.java;

import java.util.Scanner;

public class DollarToRupee {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    // Write your code here
	    int m = scanner.nextInt();
	    double dollar = m * 82.73;
	    System.out.printf("%.4f",dollar);
	}
}
