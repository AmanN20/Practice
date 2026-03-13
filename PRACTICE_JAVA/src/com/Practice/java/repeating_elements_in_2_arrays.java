package com.Practice.java;

import java.util.Scanner;


public class repeating_elements_in_2_arrays {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sizear1 = sc.nextInt();
	
	int[] ar1 = new int[sizear1];
	
	for(int i = 0;i<ar1.length;i++) {
		ar1[i]=sc.nextInt();
	}
	
	int sizear2 = sc.nextInt();
	
	int[] ar2 = new int[sizear2];
	
	for(int i = 0;i<ar2.length;i++) {
		ar2[i]=sc.nextInt();
	}
	
	int i = 0;
	int j = 0;
	while(i < ar1.length && j < ar2.length) {
		if(ar1[i]==ar2[j]) {
			System.out.println(ar1[i]);
			i++;
			j++;
		}else if(ar1[i]<ar2[j]) {
			i++;
		}else {
			i++;
		}
	}
}
}