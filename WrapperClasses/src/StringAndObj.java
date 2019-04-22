
public class StringAndObj {

	public static void main(String[] args) {
//		long x = 10000;
//		// primitive to object
//		Long l = Long.valueOf(x);
//		// to String
//		String s = l.toString();
//		// string to object
//		Long l2 = Long.valueOf(s);
//		System.out.println(l2.getClass());
		StringToObjectViceVersa();
		test();

	}

	public static void StringToObjectViceVersa() {
		int x = 12;
		String s = Integer.toString(x);
		System.out.println(s.getClass() + " " + s);

		int y = Integer.parseInt(s);
		System.out.println(y);
	}

	public static void test() {
		int x = 20;
		Integer x1 = Integer.valueOf(x);
		String s1 = Integer.toString(x);
		Integer y = Integer.valueOf(s1);
		System.out.println(y.getClass());

	}

}
