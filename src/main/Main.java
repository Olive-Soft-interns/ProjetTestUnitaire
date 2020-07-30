package main;
import java.util.Scanner;

public class Main {

	public static void main (String[] arg) {
		
		Calculator calculator = new CalculatorImpl();
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Veuillez saisir les deux valeurs \n");
		int FirstValue=scanner.nextInt() ;
		int SecondValue=scanner.nextInt() ;
		System.out.println("Veuillez saisir l'operateur (+, -, *, /): \n");
		char operator = scanner.next().charAt(0);
		int calculatedResult;
		switch(operator) {
		case '+' : 
		 calculatedResult = calculator.addition(FirstValue,SecondValue);
		break;
		
		case '-' : 
			 calculatedResult = calculator.substract(FirstValue,SecondValue);
			
		 break;
		
		case '*' : 
			 calculatedResult =calculator.multiply(FirstValue,SecondValue);
			
		 break;
		
		case '/' : 
			 calculatedResult = calculator.divide(FirstValue,SecondValue);
			System.out.println(calculatedResult);
		 break;
		default:
                System.out.printf("Error! l'operateur est incorrect");
                return;
		
		}
		System.out.println(calculatedResult);
		
	}
}
