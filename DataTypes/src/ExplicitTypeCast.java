
public class ExplicitTypeCast {

	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;
		System.out.println(b);

		int x = 97;
		char c = (char) x;
		System.out.println(c);
		
		int y = 130;
		byte a = (byte)y;
		System.out.println(a);
		
		int z = 612;
		byte b1 = (byte)z;
		System.out.println(b1);
		char c1 = (char)b1;
		System.out.println(c1);
		
		float f1 = 1f;
		double d1 = 1;
		System.out.println(f1);
		System.out.println(d1);
	}

}
