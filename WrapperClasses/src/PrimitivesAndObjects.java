
public class PrimitivesAndObjects {

	public static void main(String[] args) {
		int x = 100; // primitive type

		// Boxing -- primitive to object
		Integer y = Integer.valueOf(x);
		System.out.println(y + " --> " + y.getClass());

		// Unboxing -- object to primitive
		int a = y.intValue();
		System.out.println(a);

		// Autoboxing -- primitive to object
		int b = 200;
		Integer bb = b;
		System.out.println(bb.getClass());

		// AutoUnboxing -- object to primitive
		int z = bb;
		System.out.println(bb);

		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");

		testFloat();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		testDouble();

	}

	public static void testFloat() {
		float f1 = 12.456f;

		// boxing:
		Float ff1 = Float.valueOf(f1);
		System.out.println(ff1 + " --> " + ff1.getClass().getName());

		// autoboxing:
		Float ff2 = f1;
		System.out.println(ff2 + "-->" + ff2.getClass().getName());

		// unboxing:
		float f2 = ff1.floatValue();
		System.out.println(f2);

		// autounboxing:
		float f3 = ff1;
		System.out.println(f3);

	}

	public static void testDouble() {
		double x = 2.3;
		// boxing:
		Double x1 = Double.valueOf(x);
		System.out.println(x1);

		// autoboxing
		Double x2 = x;
		System.out.println(x2);

		// unboxing:
		double x3 = x1.doubleValue();
		System.out.println(x3);

		// autounboxing:
		double x4 = x1;
		System.out.println(x4);

	}

}
