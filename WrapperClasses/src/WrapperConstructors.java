
public class WrapperConstructors {

	public static void main(String[] args) {
		long x = 2000;
		Long l = new Long(x);
		System.out.println(l + " --> " + l.getClass().getName());

		Long l1 = Long.valueOf(x);
		System.out.println(l1 + " --> " + l1.getClass().getName());

		String s1 = "4000";
		Long l2 = Long.valueOf(s1);
		System.out.println(l2 + " --> " + l2.getClass().getName());
	}

}
