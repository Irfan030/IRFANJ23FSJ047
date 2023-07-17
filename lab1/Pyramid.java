package lab1;

import java.util.Scanner; 

public class Pyramid {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++)
		{ 
		for(int j=1;j<=i;j++)
		{ 
		 System.out.print("* "); 
		 } 
		 System.out.println();//new line
		}
		PyramidExampleReverse py = new PyramidExampleReverse();
		py.run();
		
		FloydsTriangle fy = new FloydsTriangle();
		fy.run();
		
		
	}
} 
class PyramidExampleReverse {
	public void run() {
    int term=6; 
    for(int i=1;i<=term;i++) 
    { 
    	for(int j=term;j>=i;j--) 
    	{ 
    		System.out.print("* "); 
    	} 
    	System.out.println();//new line
    } 
	} 
}

//Floyd Triangle

class FloydsTriangle { 
 public void run()
 { 
 int rows, number = 1, counter, j; 
 //To get the user's input
 Scanner input = new Scanner(System.in); 
 System.out.println("Enter the number of rows for floyd's triangle:"); 
 //Copying user input into an integer variable named rows
 rows = input.nextInt(); 
 System.out.println("Floyd's triangle");
 System.out.println("****************"); 
 for ( counter = 1 ; counter <= rows ; counter++ ) 
 { 
 for ( j = 1 ; j <= counter ; j++ ) 
 { 
 System.out.print(number+" "); 
 //Incrementing the number value
number++; 
 } 
 //For new line
 System.out.println(); 
 } 
 } 
 } 



