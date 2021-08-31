package day5;

import java.util.Scanner;

public class Circle implements Shape{
	
	Scanner sc = new Scanner(System.in);
	
	public void calculate() {
	
		int r;
		System.out.println("Enter the Length of Radius :");
		r = sc.nextInt();
		System.out.println("Area of circle : " +(3.14*r*r));
	}
}
