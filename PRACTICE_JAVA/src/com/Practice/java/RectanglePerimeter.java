package com.Practice.java;

import java.util.Scanner;

public class RectanglePerimeter {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    // Write your code here
		    int l = scanner.nextInt();
		    int w = scanner.nextInt();
		    int perimeter = 2 * (l + w);
		    System.out.println(perimeter);
		  }
}
