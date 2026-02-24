package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		double result = 0;
		Scanner sc = new Scanner(System.in);
		boolean keep_running = true;

		while(keep_running) {

			System.out.println("Enter a Number: ");
			double num1 = sc.nextDouble();

			System.out.println("Enter another Number: ");
			double num2 = sc.nextDouble();

			System.out.println("You have entered " + num1 + " and " + num2);

			char operation = ' ';
			boolean validOperator = false;

			while (!validOperator) {

				System.out.println("Enter Operation (+, -, *, /):");
				operation  = sc.next().charAt(0);

				if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
					validOperator = true;
				} else {
					System.out.println("Invalid operator! Please enter +, -, *, or /");
				}

			}

			switch (operation) {
			case '+':
				result = add(num1, num2);
				break;
			case '-':
				result = substraction(num1, num2);
				break;
			case '*':
				result = muliplication(num1, num2);
				break;
			case '/':
				result = division(num1, num2);
				break;

			}

			System.out.println("Result is: "+result);

			System.out.println("Do you want to perform another calculation (y/n)");

			char again = sc.next().charAt(0);


			if(again == 'n' || again == 'N'){
				keep_running = false;
			}



		}
		sc.close();
		System.out.println("Calculator Closed.");
	}

	public static double add(double a, double b) {

		return a + b;

	}

	public static double substraction(double a, double b) {

		return a - b;
	}

	public static double muliplication(double a, double b) {

		return a * b;
	}

	public static double division(double a, double b) {

		if(b != 0 ) {
			return a / b ; 
		}else {
			System.out.println("Can't divide by zero");
			return 0;
		}

	}
}
