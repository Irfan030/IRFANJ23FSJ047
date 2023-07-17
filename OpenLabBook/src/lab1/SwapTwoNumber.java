package lab1;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a,b,temp;//Necessary variable declaration
		a=10;
		b=28;
		 System.out.println("--Before swap--"); 
		 System.out.println("First number = " + a); 
		 System.out.println("Second number = " + b);
		//Using temporary variable to swap value
		temp = a;
		a=b;
		b=temp;
		 System.out.println("--Before swap--"); 
		 System.out.println("First number = " + a); 
		 System.out.println("Second number = " + b);
		
	}

}
