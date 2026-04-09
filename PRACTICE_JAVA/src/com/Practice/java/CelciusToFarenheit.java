package com.Practice.java;

import java.util.Scanner;

public class CelciusToFarenheit {
	static void celsiusToFahrenheit(int celsius)
	{
		//Write your code here
        
        double sum = (9.0/5 * celsius)+32;
        System.out.printf("%.4f",sum);
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int celsius = scan.nextInt();
		celsiusToFahrenheit(celsius);
	}
}
