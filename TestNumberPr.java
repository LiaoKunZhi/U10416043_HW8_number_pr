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
		}
}
