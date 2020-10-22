package assignments_5;

import java.util.Scanner;

public class Question_09 {

	public static void main(String[] args) {
//		Write a program for the following logic:
//			Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//			if end = 10, OUTPUT = 1, 3, 5, 7, 9
//			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//
//			You should use while loop and if-else statements. Note that, 
//			there should not be any comma after the last digit.
//	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter end number: ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {

			if (i % 2 == 1) {
				System.out.print(i);
				if (i<num-1)System.out.print(", ");

			}
		}
		
	}

}
