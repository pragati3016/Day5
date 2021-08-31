package day5;

import java.util.Scanner;

public class Square implements Shape{
	
	Scanner sc = new Scanner(System.in);
	
	public void calculate() {
	
		int s;
		System.out.println("Enter the Length of side of Square :");
		s = sc.nextInt();
		System.out.println("Area of Square : " +(s*s));
	}
}
