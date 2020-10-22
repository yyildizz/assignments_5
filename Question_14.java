package assignments_5;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the line number: ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("#");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("#");

		}

	}

}
