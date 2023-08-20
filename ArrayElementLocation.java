package ClosedlabBook;

public class ArrayElementLocation {
    public static int findElementIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Found the element, return its index
            }
        }
        return -1; // Element not found in the array
    }
    
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 };
        int targetElement = 15;
        
        int index = findElementIndex(numbers, targetElement);
        
        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index: " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }
}
