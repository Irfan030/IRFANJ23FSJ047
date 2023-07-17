package lab1;
import java.util.Scanner;
public class Multiply2Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//GET two value By user
		System.out.println("Enter the a Value:");
		int a =scan.nextInt();
		System.out.println("Enter the b Value:");
		int b =scan.nextInt();
		//Multiply 2 numbers
		int result = a*b;
		System.out.println("Multiplication of a*b is : "+result);
		scan.close();
		
		
	}

}
