
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      double num1, num2;
	      String operation;

	      System.out.println("Enter first number:");
	      num1 = sc.nextDouble();
	      System.out.println("Enter second number:");
	      num2 = sc.nextDouble();
	      System.out.println("Enter operation (+, -, *, /, %, ^):");
	      operation = sc.next();

	      switch (operation) {
	         case "+":
	            System.out.println("The result is: " + (num1 + num2));
	            break;
	         case "-":
	            System.out.println("The result is: " + (num1 - num2));
	            break;
	         case "*":
	            System.out.println("The result is: " + (num1 * num2));
	            break;
	         case "/":
	            System.out.println("The result is: " + (num1 / num2));
	            break;
	         case "%":
	            System.out.println("The result is: " + (num1 % num2));
	            break;
	         case "^":
	            System.out.println("The result is: " + Math.pow(num1, num2));
	            break;
	         default:
	            System.out.println("Invalid operator!!!");
	      }
	   }
}