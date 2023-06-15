
public class R0603 {

	public static void main(String args[]) {

		String x = null;

		sayHello(x);

		System.out.println(x);
	}

	/**
	 * 
	 * @param y
	 */
	private static void sayHello(String y) {

		y = "Hello world";
	}

}