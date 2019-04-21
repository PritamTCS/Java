
public class ImplicitTypeCast {

	public static void main(String[] args) {
		byte b = 100;
		byte h = 20;

		int i = b;
		System.out.println(i);

		long l = i;
		System.out.println(l);

		char ch = 'A';
		System.out.println(ch);

		int y = ch;
		System.out.println(y);

//		byte result = b + h;   // throws error
		byte result = (byte) (b + h);
		System.out.println(result);

	}

}
