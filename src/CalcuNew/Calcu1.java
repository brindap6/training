package CalcuNew;

import java.util.Scanner;


public class Calcu1 {

	public static void main(String[] args) {
	
		 Scanner test = new Scanner(System.in);
	
		 while(true) {
			String Operator;
			
			 System.out.println("Enter 1st number:");
			 int num1 = test.nextInt();
			 
			 System.out.println("Enter 2nd number:");
			 int num2 = test.nextInt();
			  
			 Calcu aa = new Calcu();
				 

			  System.out.println("Enter Operator");
			  Operator = test.next();
			  
			 if (Operator.equals("+")) 
				  System.out.println("sum = "+(num1+num2));
				 if (Operator.equals("*"))
				  System.out.println("multiply = "+(num1*num2));
				 else if (Operator.equals("/"))
					System.out.println("Division = "+(num1/num2));
				 if (Operator.equals("-"))
				  System.out.println("subtract = "+(num1-num2));
		
	
	}

}
}