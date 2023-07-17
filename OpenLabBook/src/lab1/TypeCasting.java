package lab1;

public class TypeCasting {
	public static void main(String[] args) {
		byte i = 10;
		System.out.println(i);
		
		int j= i; // will accept - automatic type promotion
		System.out.println(j);
		
		byte c = i;// will not accept - because lower type cannot be put in higher
		System.out.println(c);
		
		byte d=(byte)i;// Type casting makes it possible to store compatible types.
		System.out.println(d);
		
		 /*
		byte x=10; 
		byte y=20; 
		 
		//byte sum=x*y; // Error is thrown because when two bytes are used in a 
		             //arthmetic operation, the result will be integer
		System.out.println(sum);
	*/
	}

}
