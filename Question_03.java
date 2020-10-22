package assignments_5;

import java.util.Scanner;

public class Question_03 {

//	Question-3:
//		Write a program that displays the number of even numbers between 5 and 50 (included)

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 5; i <= 50; i++) {
			if (i % 2 == 0)
				counter++;
		}
		System.out.println("The number of even numbers between 5 and 50 is " + counter);
	}

}
