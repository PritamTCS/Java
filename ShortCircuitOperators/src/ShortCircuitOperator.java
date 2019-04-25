
public class ShortCircuitOperator {

	public static void main(String[] args) {
		boolean x = true, y = false;
		String s1 = "";
		if (x && y) {
			System.out.println("Inside If");
		} else if (x || y) {
			System.out.println("Inside else if");
		} else {
			System.out.println("Inside else");
		}
	}

}
