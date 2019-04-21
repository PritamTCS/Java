
public class Demo {
	static Demo obj = new Demo();

	int cal = 10;
	static {
//		System.out.println(Demo.obj);
//		Demo.obj = new Demo();
//		System.out.println(Demo.obj);
//		Demo.obj = Demo.init();
		System.out.println(Demo.obj);
		Demo num = new Demo();
		System.out.println(num.cal);
		

	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		System.out.println(Demo.obj);
		new Demo().doSomething();
	}
	
	static Demo init() {
		return new Demo();
	}
	
	void doSomething() {
		System.out.println("Do Something!.");
	}
}
