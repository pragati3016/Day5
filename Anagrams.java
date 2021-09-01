package day5;

import java.util.Arrays;
import java.util.Scanner;  

public class Anagrams {

	static Scanner sc = new Scanner(System.in);
	
	static void isAnagram()
	{  
		String str1, str2;
		
		System.out.println("Enter the First String :");
		str1 = sc.next();
		
		System.out.println("Enter the Second String :");
		str2 = sc.next();
	
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        
        boolean status = true; 
        
        if (s1.length() != s2.length()) {  
            status = false;  
        } 
        else 
        {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) 
        {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } 
        else 
        {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
    	
        isAnagram();  
    }  
}  