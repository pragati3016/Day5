package day5;

import java.util.Scanner;

public class Rectangle implements Shape{
	
	Scanner sc = new Scanner(System.in);
	
	public void calculate() {
		
		int l,b;
		System.out.println("Enter the Length :");
		l = sc.nextInt();
		System.out.println("Enter the Breadth :");
		b = sc.nextInt();
		System.out.println("Area of Reactangle : "+(l*b));
	}

}