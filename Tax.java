package day5;

import java.util.*;

public class Tax

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Salary :");
		int amount=sc.nextInt();

		if(amount<=50000)
		{
			System.out.println("Amount to be Paid is : "+ amount);
		}
		else if(amount<=60000)
		{
			amount+=(amount/100)*10;
			System.out.println("Amount to be Paid is : "+ amount);
		}
		else if(amount <=150000)
		{
			amount+=(amount/100)*20;
			System.out.println("Amount to be Paid is : "+ amount);
		}
		else
		{
			amount+=(amount/100)*30;
			System.out.println("Amount to be Paid is : "+ amount);
		}

		sc.close();
	}
}