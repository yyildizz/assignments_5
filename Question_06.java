package assignments_5;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {

//		Question-6:
//		Write a program to print Fibonacci series of n terms where n is declared by user :
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the term number");
		int number = scan.nextInt();
		int next = 1;

		int total = 0;
		int count = 0;

		for (int i = 1; count < number; i++) {
			System.out.print(total);
			count++;
			int temp = total;
			total += next;
			next = temp;
			if (count < number)
				System.out.print(", ");
		}
	}

}
