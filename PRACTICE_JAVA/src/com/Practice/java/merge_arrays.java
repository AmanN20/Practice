package com.Practice.java;

import java.util.Scanner;

public class merge_arrays {

	public static void main(String[] args) {
		// merge 2 arrays such that resultant array is sorted
		Scanner sc = new Scanner(System.in);
		int sizear1 = sc.nextInt();
		int[] ar1 = new int[sizear1];
		
		for(int i = 0;i<ar1.length;i++) {
			ar1[i]=sc.nextInt();
		}
		
		int sizear2 = sc.nextInt();
		
		int[] ar2 = new int[sizear2];
		for(int  i = 0;i < ar2.length;i++) {
			ar2[i] = sc.nextInt();
		}
		
		int[] result = new int[sizear1 + sizear2];
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i< ar1.length && j<ar2.length && k< result.length) {
			if(ar1[i]>=ar2[j]) {
				result[k] = ar2[j];
				k++;
				j++;
			}else {
				result[k] = ar1[i];
				i++;
				k++;
			}
		}
		while(j<ar2.length) {
			result[k] = ar2[j];
			k++;
			j++;
		}
		while(i<ar1.length) {
			result[k] = ar1[i];
			k++;
			i++;
		}
		System.out.print("Merged array: ");
		for(int  w = 0;w<result.length;w++) {
			System.out.print(result[w]+" ");
		}
	}

}
