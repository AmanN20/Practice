package com.Practice.java;

import java.util.Scanner;

public class rearrange_minus1 {
	 public  static void Rearangearrays(int[] ar){
		 
		 //rearrange -1 at the beginning

	        int i = ar.length-1;
	        int j = ar.length-1;
	        while(i>=0){
	            if(ar[i] == -1){
	                i--;
	            }else{
	                ar[j] = ar[i];
	                i--;
	                j--;
	            }
	        }
	        while(j>=0){
	            ar[j]=-1;
	            j--;
	        }
	         
	    }


	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int sizear = scanner.nextInt();
	        int[] ar = new int[sizear];
	        for(int i = 0;i<ar.length;i++){
	            ar[i]=scanner.nextInt();
	        }

	        Rearangearrays(ar);
	        for(int  i = 0;i<ar.length;i++){
	            System.out.print(ar[i]+" ");
	        }
		
	}

}
