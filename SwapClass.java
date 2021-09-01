package day5;

import java.util.Scanner;

public class SwapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fNum, sNum, temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		fNum = sc.nextInt();
		
		System.out.println("Enter the Second Number : ");
		sNum = sc.nextInt();
		
		System.out.println("Numbers Before Swapping are : " + fNum + ", " + sNum);
		
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		System.out.println("Numbers After Swapping are : " + fNum + ", " + sNum);

	}

}
