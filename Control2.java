public class Control2 {
	public static void main(String[] args) {
		switch (args.length) {
		case 0:
			System.out.println("입력값이 없습니다.");
			break;

		case 1:
			System.out.println(args[0] + " 이(가) 입력되었습니다.");
			break;

		default:
			System.out.println("여러 값이 입력되었습니다.");
			break;
		}
	}
}
