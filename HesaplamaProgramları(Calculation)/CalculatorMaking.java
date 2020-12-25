package YbuMýsHomeWorks;

import java.util.Scanner;

public class CalculatorMaking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double x, y;
		int choose;
		String choose1;
		System.out.println("Enter The First Number -->");
		x = scan.nextDouble();
		System.out.println("Enter The Second Number -->");
		y = scan.nextDouble();

		System.out.println("Please Select An Action ; ");
		System.out.println("\n 1--> Addition : \n 2-->Subtractipon : \n 3--> Multiplication : \n 4--> Division :");
		System.out.println("YOUR CHOOSE =>");
		choose = scan.nextInt();

		if (choose == 1) {
			System.out.printf("Addition :" + (x + y));
		}
		if (choose == 2) {
			System.out.printf("Subtraction :" + (x - y));
		}
		if (choose == 3) {
			System.out.printf("Multiplication :" + (x * y));
		}
		if (choose == 4) {
			System.out.printf("Division : " + (x / y));
		}

		else if (choose >= 4 || choose <= 1) {
			System.out.println("Select is not true!!!");

		}

	}
}
