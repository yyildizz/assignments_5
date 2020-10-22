package assignments_5;

public class Question_13 {

	public static void main(String[] args) {
		char first = 'W';
		char second = 'B';

		for (int i = 0; i < 8; i++) {
			int count = 0;
			for (int j = 0; j < 8; j++) {

				if ((i + j) % 2 == 0)
					System.out.print(first + " ");
				else
					System.out.print(second + " ");
				count++;
				if (count == 8)
					System.out.println();

			}
		}

	}

}
