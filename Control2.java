public class Control2 {
	public static void main(String[] args) {
		switch (args.length) {
		case 0:
			System.out.println("�Է°��� �����ϴ�.");
			break;

		case 1:
			System.out.println(args[0] + " ��(��) �ԷµǾ����ϴ�.");
			break;

		default:
			System.out.println("���� ���� �ԷµǾ����ϴ�.");
			break;
		}
	}
}
