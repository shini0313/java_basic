
public class R0605 {

	public static void main(String[] args) {
		
		String[] array = null;
		
		fillArray(array);
		
		System.out.println(array==null);
		

	}

	private static void fillArray(String[]array) {
		
		 array = new String[] {"1" , "2"};
		 
	}
}
