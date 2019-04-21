
public class ThisKeywordDemo {
	int x;

	{
		x = 20;
	}

//	ThisKeywordDemo() {
//		new ThisKeywordDemo(40);
//	}

	ThisKeywordDemo(int i) {
		System.out.println(this.x);
		this.x = i;
		System.out.println(this);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		System.out.println("Inside Main method");
		ThisKeywordDemo th1 = new ThisKeywordDemo(10);

		System.out.println(th1.x);
		
	}

}
