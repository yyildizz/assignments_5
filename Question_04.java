package assignments_5;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		int product = 0;
		
		while (product < 100) {
			System.out.println("Enter a number ");
			number = scan.nextInt();
			product +=number*10;
		}
		
		System.out.println("The product is now " + product);
	}

}
