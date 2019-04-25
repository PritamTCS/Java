
public class StringConcat {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "";

		System.out.println(s3);
		System.out.println(a + b + s1 + s2);
		System.out.println(s1 + s2 + a + b);
		System.out.println(a + s1 + b + c);

		if (s3 != null && s3 == "") {
			System.out.println("Hi");
		}
	}

}
