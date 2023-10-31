package Calculator;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 char op;
		 System.out.println("Enter operator from(+,-,*,/,%)");
		 op=scanner.next().charAt(0);
		 switch(op)
		 {
		 case '+': { System.out.print("Enter the number of operands: ");
		 			int numOperands = scanner.nextInt();

		 			if (numOperands < 2) {
		 				System.out.println("You need at least 2 operands to perform addition.");
		 				return;
		 			}

		 			int sum = 0;
		 			for (int i = 1; i <= numOperands; i++) {
		 				System.out.print("Enter operand " + i + ": ");
		 				int operand = scanner.nextInt();
		 				sum += operand;
		 			}

		 			System.out.println("The sum of the operands is: " + sum);}
		 break;
		 case '-':{
			 	System.out.print("Enter the number of operands: ");
		        int numOperands = scanner.nextInt();

		        if (numOperands < 2) {
		            System.out.println("You need at least 2 operands to perform Subtraction.");
		            return;
		        }
		        System.out.print("Enter the first operand: ");
		        int firstOperand = scanner.nextInt();
		        int sub=firstOperand;
		        
		        for (int i = 2; i <= numOperands; i++) {
		            System.out.print("Enter operand " + i + ": ");
		            int operand = scanner.nextInt();
		            sub -= operand;
		        }

		        System.out.println("The difference of the operands is: " + sub); }
		 break;
		 case '*':{System.out.print("Enter the number of operands: ");
		 			int numOperands = scanner.nextInt();

		 			if (numOperands < 2) {
		 				System.out.println("You need at least 2 operands to perform multiplication.");
		 				return;
		 			}

		 			int result = 1; 

		 			for (int i = 1; i <= numOperands; i++) {
		 				System.out.print("Enter operand " + i + ": ");
		 				int operand = scanner.nextInt();
		 				result *= operand;
		 			}

		 			System.out.println("The result of multiplication is: " + result);}
		 	break;
		 	
		   case '/':{System.out.print("Enter the number of operands: ");
		   			int numOperands = scanner.nextInt();

		   			if (numOperands < 2) {
		   				System.out.println("You need at least 2 operands to perform division.");
		   				return;
		   			}

		   			System.out.print("Enter the first operand: ");
		   			double firstOperand = scanner.nextDouble();

		   			double result = firstOperand;

		   			try {
		   				for (int i = 2; i <= numOperands; i++) {
		   					System.out.print("Enter operand " + i + ": ");
		   					double operand = scanner.nextDouble();
		   					if (operand == 0) {
		   						throw new ArithmeticException("Division by zero is not allowed.");
		   					}
		   					result /= operand;
		   				}

		   				System.out.println("The result of division is: " + result);
		   			} catch (ArithmeticException e) {
		   				System.out.println("Error: " + e.getMessage());
		   			}}
		   	break;
		   case '%':{ System.out.print("Enter the number of operands: ");
		   			int numOperands = scanner.nextInt();

		   			if (numOperands < 2) {
		   				System.out.println("You need at least 2 operands to perform the modulo operation.");
		   				return;
		   			}

		   			System.out.print("Enter the dividend: ");
		   			int dividend = scanner.nextInt();

		   			int result = dividend;

		   			try {
		   				for (int i = 2; i <= numOperands; i++) {
		   					System.out.print("Enter divisor " + i + ": ");
		   					int divisor = scanner.nextInt();
		   					if (divisor == 0) {
		   						throw new ArithmeticException("Division by zero is not allowed.");
		   					}
		   					result %= divisor;
		   				}

		   				System.out.println("The result of the modulo operation is: " + result);
		   			} catch (ArithmeticException e) {
		   				System.out.println("Error: " + e.getMessage());
		   			}}
		   break;
		   default:{System.out.println("Only enter from the above");
		   }
		   scanner.close();
		 }
	}
}
