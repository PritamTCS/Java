
public class NonStaticMembersDemo {

	int num;

	NonStaticMembersDemo() {
		System.out.println("Inside constructor");
	}

	{
		System.out.println("Inside non static block");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main method");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}

	static {
		System.out.println("Inside static block");
	}

}