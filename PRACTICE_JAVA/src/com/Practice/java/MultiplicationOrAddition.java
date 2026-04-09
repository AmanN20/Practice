package com.Practice.java;

import java.util.Scanner;

public class MultiplicationOrAddition {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n%2==0 && m%2==0){
            System.out.println(m*n);
        }else{
            System.out.println(m+n);
        }

        
    }
}
