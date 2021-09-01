package day5;

import java.util.Scanner;

public class EvenOrOdd {
	
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		
		result = checkNum();
		
		System.out.println("Number Is (1 If Even, 0 If Odd) : " + result);
	}
	
	static int checkNum() {
		
		if(num % 2 == 0)
			return 1;
		else
			return 0;
	}

}
