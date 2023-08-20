package ClosedlabBook;

import java.util.Scanner;

public class NumberisPrimeorNot {
	

		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter any number:");
			int num=scan.nextInt();
			scan.close();
//			boolean isPrime= true;
//			
//			for(int i=2;i<num;i++) {
//				if(num%i==0) {
//					isPrime=false;
//					break;
//				}
//				
//			}
//			
//			if(isPrime) {
//				System.out.println("Enetered number is Prime");
//			}else {
//				System.out.println("Not a prime number");
//			}
			isPrime(num);
			
		}
		public static void isPrime(int numToCheck) {
			for(int i=2;i<=numToCheck/2;i++) {
				if(numToCheck%i==0) {
					System.out.println("Not a prime number");
					return;
				}
				
			}
			System.out.println("Enetered number is Prime");
		}

	}


