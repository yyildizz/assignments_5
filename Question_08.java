package assignments_5;

import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) {

// Write a program to calculate the sum of the numbers from 1 till upper bound.		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the upper bound: ");
		int bound = scan.nextInt();

		int i = 0, sum = 0;
		while (i <= bound) {
			sum += i;
			i++;
		}
		System.out.println("The sum is " + sum);

	}

}
