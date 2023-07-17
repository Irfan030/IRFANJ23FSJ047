package lab1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value of a:");
		int a = scan.nextInt();
		
		//Find 0dd or even using if and else stmt
		if(a%2==0)
		{
			System.out.println("Given value is Even" + " " +a);
		}
		else
		{
			System.out.println("Given value is Odd" + " " +a);
		}
		scan.close();
	}

}
