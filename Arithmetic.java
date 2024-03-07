import java.util.Scanner;

public class Arithmetic{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = scanner.nextInt();
		int square1 = firstNumber * firstNumber;
		int square2 = secondNumber * secondNumber;
		System.out.printf("Square of first number is: %d%n", square1);
		System.out.printf("Square of second number is: %d%n", square2);


	}

}