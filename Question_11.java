package assignments_5;

public class Question_11 {

	public static void main(String[] args) {

		for (int i = 4; i > 0; i--) {
			for (int j2 = i; j2 < 4; j2++) {
				System.out.print(" ");
			}
			
			for (int j = i; j >0; j--) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
