package ClosedlabBook;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayInOrderOfAscendingandDescending {
	public static void main(String[] args) {
                           {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        int[] array = new int[n];
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter element " + (i + 1) + ": ");
		            array[i] = scanner.nextInt();
		        }

		        System.out.println("Choose sorting order:");
		        System.out.println("1. Ascending");
		        System.out.println("2. Descending");
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            Arrays.sort(array);  // Sort in ascending order
		        } else if (choice == 2) {
		            Arrays.sort(array);
		            reverseArray(array); // Sort in descending order
		        } else {
		            System.out.println("Invalid choice.");
		            scanner.close();
		            return;
		        }

		        System.out.println("Sorted array: " + Arrays.toString(array));

		        scanner.close();
                           }
		    }

		    public static void reverseArray(int[] array) {
		        int left = 0;
		        int right = array.length - 1;

		        while (left < right) {
		            int temp = array[left];
		            array[left] = array[right];
		            array[right] = temp;
		            left++;
		            right--;
		        }
		    }
		}



