package ClosedlabBook;

import java.util.Scanner;
import java.util.Arrays;

public class ReversArrayElement {
	public static void main(String[] args) {
		System.out.println("Enter the Array Size:");
	    Scanner scan = new Scanner(System.in);
	    {
			int n = scan.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n;i++)
			{
				arr[i]=scan.nextInt();
				
			}
			scan.close();
			System.out.println("Original Array"+ Arrays.toString(arr));
			int reverseArray[]= new int[arr.length];
			for(int j=0;j<arr.length;j++)
			{
				
				reverseArray[j]=arr[arr.length-j-1];
				
			}
			
			System.out.println("Reverse Array"+ Arrays.toString(reverseArray));
		}
		
		
	
	}
}



