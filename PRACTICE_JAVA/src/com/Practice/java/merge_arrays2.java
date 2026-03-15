package com.Practice.java;

import java.util.Scanner;

public class merge_arrays2 {

	public static void main(String[] args) {
		// merge_arrays 2
		Scanner sc = new Scanner(System.in);
		int sizear1 = sc.nextInt();
		
		int[] ar1 = new int[sizear1];
		
		for(int  i = 0;i<ar1.length;i++) {
			ar1[i] = sc.nextInt();
		}
		
		int sizear2 = sc.nextInt();
		
		int[] ar2 = new int[sizear2];
		
		for(int i = 0;i<ar2.length;i++) {
			ar2[i]=sc.nextInt();
		}
		
		int sizear3 = sc.nextInt();
		
		int[] ar3 = new int[sizear3];
		
		for(int i = 0;i<ar3.length;i++) {
			ar3[i]=sc.nextInt();
		}
		
		int[] res  = new int[sizear1+sizear2+sizear3];
		
		int j = 0;
		int  i =0;
		int k = 0;
		while(k<res.length) {
			if(i<ar1.length) {
				res[k] = ar1[i];
				k++;
			}
			if(i<ar2.length) {
				res[k] = ar2[i];
				k++;
			}
			if(i<ar3.length) {
				res[k] = ar3[i];
				k++;
			}
			i++;
			
		}
		for(int y = 0;y<res.length;y++) {
			System.out.print(res[y]);
		}
	}

}
