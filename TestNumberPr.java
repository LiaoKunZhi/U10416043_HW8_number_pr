//U10416043   廖崑智

import java.util.*;

//Class
public class TestNumberPr{

	//Main method
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		//Ask user to enter the two numbers he or she want
		System.out.println("Please enter first number you want : ");
		String npr1 = input.next();
		System.out.println("Please enter second number you want : ");
		String npr2 = input.next();
		
		//Let the two number can be called from the class NumberPr
		NumberPr n = new NumberPr(npr1,npr2);
		
		//Let user choose the method he or she want to do to the two numbers
		System.out.println("Please enter what you want to do { (1)addition (2)subtract (3)multiply (4)divide }:");
		int calculate = input.nextInt();
		
		//Let user to enter the scale he or she want
		System.out.println("Please enter a scale ( >=0 ): ");
		int scale = input.nextInt();
		
		//Show the result after calculate
		System.out.println("Result: " + n.getCalculate(calculate,scale));
		
	}
}
