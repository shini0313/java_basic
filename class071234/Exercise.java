
package class071234;

public class Exercise {

	public static void main(String[] args) {

		Dog dog1 = new Dog(null, 0, null);
		Dog dog2 = new Dog(null, 0, null);

		dog1.setName("hana");
		dog1.setAge(4);
		dog1.setKind("博美");
		dog1.ShowProfile();

		dog2.setName("runa");
		dog2.setAge(6);
		dog2.setKind("泰迪");
		dog2.ShowProfile();

	}

}
