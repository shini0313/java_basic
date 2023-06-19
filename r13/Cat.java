package r13;

public class Cat {

	public static void main(String[] args) {

		Animal cat = new Animal(7, "hana", "cat");

		System.out.println(cat.getAge());
		System.out.println(cat.getName());
		System.out.println(cat.getClassname());

		cat.hello();
	}

}
