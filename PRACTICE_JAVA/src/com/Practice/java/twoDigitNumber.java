package com.Practice.java;

import java.util.Scanner;

public class twoDigitNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         if(n>9 && n<100){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
        
    }
}
