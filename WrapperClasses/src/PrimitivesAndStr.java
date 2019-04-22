
public class PrimitivesAndStr {

	public static void main(String[] args) {
		IntToString();
		FloatToString();
	}

	public static void IntToString() {
		int x = 14;
		// primitive to string
		String s = Integer.toString(x);
		System.out.println(s + " " + s.getClass().getName());

		// String to primitive
		int x1 = Integer.parseInt(s);
		System.out.println(x1);

	}

	public static void FloatToString() {
		// primitive to string
		float x1 = 1.23f;
		String s1 = Float.toString(x1);
		System.out.println(s1 + " " + s1.getClass().getName());

		// string to primitive
		float x2 = Float.parseFloat(s1);
		System.out.println(x2);
	}

}
