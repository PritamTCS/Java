class Test {
	static int i;

	static {
		i = 30;
		System.out.println("Inside static block 1");
	}

	Test() {
		System.out.println("Inside constructor");

		System.out.format("Value: %d", i);
		System.out.println();

	}
}

public class StaticTest {

	public static void main(String[] args) {
		System.out.println("Inside Main method");
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(Test.i);
	}

	static {
		System.out.println("Inside static block 2");
	}

}