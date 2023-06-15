
public class R0604 {

	public static void main(String[] args) {

		String[] array = new String[] { "value1" };

		fillArray(array);
		System.out.println(array[0]);

	}

	public static void fillArray(String[] array) {

		array[0] = "value2";
	}
}
