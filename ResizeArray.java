package ClosedlabBook;

import java.util.Arrays;

public class ResizeArray {
	public static void main(String[] args) {
//	Resize array to Larger size
	int  a[] = {1,2,4,5,6,7,8};
	int  b[]= new int[10];
	
	System.arraycopy(a, 0, b, 0, 5);
	a= null;
	System.out.println(Arrays.toString(b));
	}
		}