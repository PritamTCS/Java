
public class UnaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x;

		int a = 20;
		int b = a++;

		System.out.println(" Pre increment: ");
		System.out.println("Value of x " + x);
		System.out.println("Value of y " + y);

		System.out.println(" Post increment: ");
		System.out.println("Value of a " + a);
		System.out.println("Value of b " + b);

	}

}
