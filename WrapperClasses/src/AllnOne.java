
public class AllnOne {

	public static void main(String[] args) {
		int x = 100;
		String s1 = Integer.toString(x);
		Integer a1 = new Integer(s1); // new Integer() takes either primitive type or string
		System.out.println(a1.getClass().getName() + " -> " + a1);

		Integer a2 = Integer.valueOf(s1);
		System.out.println(a2.getClass().getName() + " -> " + a2);

		// convert to primtive type
		int z = a2.intValue();
		System.out.println(z);

		Integer b1 = new Integer(z);
		Integer b2 = Integer.valueOf(z);

		String d = b1.toString();
		// string to primitive
		int e = Integer.parseInt(d);
		System.out.println(e);

	}

}
