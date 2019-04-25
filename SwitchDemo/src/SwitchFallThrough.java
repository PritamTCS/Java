
public class SwitchFallThrough {

	public static void main(String[] args) {
		int x = 2;

		switch (x) {

		case 1:
		case 2:
		case 3:
			System.out.println("Common Logic");
			break;
		case 4:
			System.out.println("Case 4");
			break;
		default:
			System.out.println("Case 5");
		}

	}

}
