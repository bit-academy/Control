public class Control4 {
	public static void main(String[] args) {
		int a = 0;
		while (a < 3) {
			System.out.print(a++ + " ");
		}

		do {
			System.out.println(a++ + " ");
		} while (a < 3);
	}
}
