package com.Practice.java;

import java.util.Scanner;

public class insert_astreisk_befor_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == 'a') {
                result.append('*');
            }
            result.append(ch);
        }
        
        System.out.println(result.toString());
    }
}
