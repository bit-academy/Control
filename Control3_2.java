public class Control3_2 {
	public static void main(String[] args) {
		here:

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) {
					System.out.println("continue - here");
					continue here;
				} else if (i == 5) {
					System.out.println("break - here");
					break here;
				}

				System.out.println(i + " " + j);
			}
		}
	}
}
